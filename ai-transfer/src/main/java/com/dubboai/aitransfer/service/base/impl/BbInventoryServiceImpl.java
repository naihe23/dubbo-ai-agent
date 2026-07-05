package com.dubboai.aitransfer.service.base.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dubboai.aitransfer.model.BbInventory;
import com.dubboai.aitransfer.service.base.BbInventoryService;
import com.dubboai.aitransfer.mapper.BbInventoryMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangjw
* @description 针对表【bb_inventory(库存表)】的数据库操作Service实现
* @createDate 2026-07-04 14:12:00
*/
@Service
public class BbInventoryServiceImpl extends ServiceImpl<BbInventoryMapper, BbInventory>
    implements BbInventoryService{

}




