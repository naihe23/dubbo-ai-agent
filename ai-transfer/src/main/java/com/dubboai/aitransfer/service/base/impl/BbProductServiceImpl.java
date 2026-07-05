package com.dubboai.aitransfer.service.base.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dubboai.aitransfer.model.BbProduct;
import com.dubboai.aitransfer.service.base.BbProductService;
import com.dubboai.aitransfer.mapper.BbProductMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangjw
* @description 针对表【bb_product(商品信息表)】的数据库操作Service实现
* @createDate 2026-07-04 14:11:24
*/
@Service
public class BbProductServiceImpl extends ServiceImpl<BbProductMapper, BbProduct>
    implements BbProductService{

}




