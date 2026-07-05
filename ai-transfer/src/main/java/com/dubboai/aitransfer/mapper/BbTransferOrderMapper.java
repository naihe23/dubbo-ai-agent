package com.dubboai.aitransfer.mapper;

import com.dubboai.aitransfer.model.BbTransferOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author zhangjw
* @description 针对表【bb_transfer_order(调拨单主表)】的数据库操作Mapper
* @createDate 2026-07-04 14:12:00
* @Entity com.dubboai.aitransfer.model.BbTransferOrder
*/
@Mapper
public interface BbTransferOrderMapper extends BaseMapper<BbTransferOrder> {

}




