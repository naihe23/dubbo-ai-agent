package com.dubboai.aitransfer.service.base.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dubboai.aitransfer.model.BbSalesRecord;
import com.dubboai.aitransfer.service.base.BbSalesRecordService;
import com.dubboai.aitransfer.mapper.BbSalesRecordMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangjw
* @description 针对表【bb_sales_record(商品销售记录表)】的数据库操作Service实现
* @createDate 2026-07-04 14:12:00
*/
@Service
public class BbSalesRecordServiceImpl extends ServiceImpl<BbSalesRecordMapper, BbSalesRecord>
    implements BbSalesRecordService{

}




