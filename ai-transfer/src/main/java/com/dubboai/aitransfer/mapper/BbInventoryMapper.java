package com.dubboai.aitransfer.mapper;

import com.dubboai.aitransfer.model.BbInventory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author zhangjw
* @description 针对表【bb_inventory(库存表)】的数据库操作Mapper
* @createDate 2026-07-04 14:12:00
* @Entity com.dubboai.aitransfer.model.BbInventory
*/
@Mapper
public interface BbInventoryMapper extends BaseMapper<BbInventory> {

}




