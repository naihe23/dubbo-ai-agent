package com.dubboai.aitransfer.nodes;

import cn.hutool.json.JSONUtil;
import com.alibaba.cloud.ai.graph.OverAllState;
import com.alibaba.cloud.ai.graph.action.NodeAction;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.dubboai.aitransfer.domain.vo.SaleRecordVo;
import com.dubboai.aitransfer.model.BbInventory;
import com.dubboai.aitransfer.service.CollectSaleRecordService;
import com.dubboai.aitransfer.service.base.BbInventoryService;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

/**
 *
 *@author zhang_jiawang
 *@date 2026/7/4
 *@description
 */
public class CollectSaleRecordNode implements NodeAction {

    private final CollectSaleRecordService collectSaleRecordService;

    private final BbInventoryService bbInventoryService;

    public CollectSaleRecordNode(CollectSaleRecordService collectSaleRecordService, BbInventoryService bbInventoryService) {
        this.collectSaleRecordService = collectSaleRecordService;
        this.bbInventoryService = bbInventoryService;
    }

    @Override
    public Map<String, Object> apply(OverAllState state) throws Exception {

        String productId = state.value("productId", "");

        if(StringUtils.isBlank(productId)){
            return Map.of();
        }

        List<SaleRecordVo> saleRecordVos = collectSaleRecordService.collectSaleRecord(Integer.parseInt(productId));

        String saleRecordDataJson = JSONUtil.toJsonStr(saleRecordVos);

        List<BbInventory> bbInventories = bbInventoryService.list(Wrappers.lambdaQuery(BbInventory.class).eq(BbInventory::getProductId, productId));

        String bbInventoryDataJson = JSONUtil.toJsonStr(bbInventories);

        return Map.of("saleRecordData", saleRecordDataJson,
                "nowProductInventoryData", bbInventoryDataJson);
    }
}
