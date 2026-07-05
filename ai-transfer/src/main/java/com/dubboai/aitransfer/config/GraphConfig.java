package com.dubboai.aitransfer.config;

import com.alibaba.cloud.ai.graph.CompiledGraph;
import com.alibaba.cloud.ai.graph.KeyStrategy;
import com.alibaba.cloud.ai.graph.KeyStrategyFactory;
import com.alibaba.cloud.ai.graph.StateGraph;
import com.alibaba.cloud.ai.graph.action.AsyncNodeAction;
import com.alibaba.cloud.ai.graph.exception.GraphStateException;
import com.alibaba.cloud.ai.graph.internal.node.ConditionalParallelNode;
import com.alibaba.cloud.ai.graph.state.strategy.ReplaceStrategy;
import com.dubboai.aitransfer.nodes.CollectSaleRecordNode;
import com.dubboai.aitransfer.service.CollectSaleRecordService;
import com.dubboai.aitransfer.service.base.BbInventoryService;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 *
 *@author zhang_jiawang
 *@date 2026/7/4
 *@description
 */
@Configuration
public class GraphConfig {

    private final BbInventoryService bbInventoryService;;

    private final CollectSaleRecordService collectSaleRecordService;

    public GraphConfig(BbInventoryService bbInventoryService, CollectSaleRecordService collectSaleRecordService) {
        this.bbInventoryService = bbInventoryService;
        this.collectSaleRecordService = collectSaleRecordService;
    }

    @Bean
    public CompiledGraph graph(ChatClient.Builder chatClient) throws GraphStateException {

        KeyStrategyFactory keyStrategyFactory = () -> Map.of("productId",new ReplaceStrategy(),
                "saleRecordData", new ReplaceStrategy(),
                "nowProductInventoryData", new ReplaceStrategy());

        StateGraph stateGraph = new StateGraph("inventoryGraph",keyStrategyFactory);
        //添加图节点

        stateGraph.addNode("saleRecordNode", AsyncNodeAction.node_async(new CollectSaleRecordNode(collectSaleRecordService, bbInventoryService)));

        stateGraph.addEdge(StateGraph.START, "saleRecordNode");
        stateGraph.addEdge("saleRecordNode", StateGraph.END);

        return stateGraph.compile();
    }
}
