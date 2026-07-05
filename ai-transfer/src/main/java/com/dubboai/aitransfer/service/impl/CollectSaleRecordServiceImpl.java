package com.dubboai.aitransfer.service.impl;

import com.dubboai.aitransfer.domain.vo.SaleRecordVo;
import com.dubboai.aitransfer.mapper.SaleRecordDao;
import com.dubboai.aitransfer.service.CollectSaleRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 *@author zhang_jiawang
 *@date 2026/7/4
 *@description
 */
@Service
public class CollectSaleRecordServiceImpl implements CollectSaleRecordService {

    private final SaleRecordDao saleRecordDao;

    public CollectSaleRecordServiceImpl(SaleRecordDao saleRecordDao) {
        this.saleRecordDao = saleRecordDao;
    }

    @Override
    public List<SaleRecordVo> collectSaleRecord(Integer productId) {
        return saleRecordDao.getSaleRecordList(productId);
    }
}
