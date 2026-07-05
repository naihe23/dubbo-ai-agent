package com.dubboai.aitransfer.service;

import com.dubboai.aitransfer.domain.vo.SaleRecordVo;

import java.util.List;

/**
 *
 *@author zhang_jiawang
 *@date 2026/7/4
 *@description
 */
public interface CollectSaleRecordService {

    List<SaleRecordVo> collectSaleRecord(Integer productId);
}
