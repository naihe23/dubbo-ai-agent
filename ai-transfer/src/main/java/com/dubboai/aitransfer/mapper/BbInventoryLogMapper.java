package com.dubboai.aitransfer.mapper;

import com.dubboai.aitransfer.model.BbInventoryLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author zhangjw
* @description 针对表【bb_inventory_log(库存操作日志表)】的数据库操作Mapper
* @createDate 2026-07-04 14:12:00
* @Entity com.dubboai.aitransfer.model.BbInventoryLog
*/
@Mapper
public interface BbInventoryLogMapper extends BaseMapper<BbInventoryLog> {

}




