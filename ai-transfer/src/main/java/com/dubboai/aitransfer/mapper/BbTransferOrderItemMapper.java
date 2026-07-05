package com.dubboai.aitransfer.mapper;

import com.dubboai.aitransfer.model.BbTransferOrderItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author zhangjw
* @description 针对表【bb_transfer_order_item(调拨单明细表)】的数据库操作Mapper
* @createDate 2026-07-04 14:12:00
* @Entity com.dubboai.aitransfer.model.BbTransferOrderItem
*/
@Mapper
public interface BbTransferOrderItemMapper extends BaseMapper<BbTransferOrderItem> {

}




