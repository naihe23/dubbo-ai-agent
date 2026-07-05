package com.dubboai.aitransfer.service.base.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dubboai.aitransfer.model.BbInventoryLog;
import com.dubboai.aitransfer.service.base.BbInventoryLogService;
import com.dubboai.aitransfer.mapper.BbInventoryLogMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangjw
* @description 针对表【bb_inventory_log(库存操作日志表)】的数据库操作Service实现
* @createDate 2026-07-04 14:12:00
*/
@Service
public class BbInventoryLogServiceImpl extends ServiceImpl<BbInventoryLogMapper, BbInventoryLog>
    implements BbInventoryLogService{

}




