package com.dubboai.aitransfer.service.base.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dubboai.aitransfer.model.BbTransferOrder;
import com.dubboai.aitransfer.service.base.BbTransferOrderService;
import com.dubboai.aitransfer.mapper.BbTransferOrderMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangjw
* @description 针对表【bb_transfer_order(调拨单主表)】的数据库操作Service实现
* @createDate 2026-07-04 14:12:00
*/
@Service
public class BbTransferOrderServiceImpl extends ServiceImpl<BbTransferOrderMapper, BbTransferOrder>
    implements BbTransferOrderService{

}




