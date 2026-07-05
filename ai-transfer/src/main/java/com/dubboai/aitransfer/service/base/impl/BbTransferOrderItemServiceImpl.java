package com.dubboai.aitransfer.service.base.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dubboai.aitransfer.model.BbTransferOrderItem;
import com.dubboai.aitransfer.service.base.BbTransferOrderItemService;
import com.dubboai.aitransfer.mapper.BbTransferOrderItemMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangjw
* @description 针对表【bb_transfer_order_item(调拨单明细表)】的数据库操作Service实现
* @createDate 2026-07-04 14:12:00
*/
@Service
public class BbTransferOrderItemServiceImpl extends ServiceImpl<BbTransferOrderItemMapper, BbTransferOrderItem>
    implements BbTransferOrderItemService{

}




