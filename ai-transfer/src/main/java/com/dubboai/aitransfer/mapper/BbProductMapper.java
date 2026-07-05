package com.dubboai.aitransfer.mapper;

import com.dubboai.aitransfer.model.BbProduct;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author zhangjw
* @description 针对表【bb_product(商品信息表)】的数据库操作Mapper
* @createDate 2026-07-04 14:11:24
* @Entity com.dubboai.aitransfer.model.BbProduct
*/
@Mapper
public interface BbProductMapper extends BaseMapper<BbProduct> {

}




