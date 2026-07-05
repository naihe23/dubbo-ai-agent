package com.dubboai.aitransfer.mapper;

import com.dubboai.aitransfer.domain.vo.SaleRecordVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 *@author zhang_jiawang
 *@date 2026/7/4
 *@description 商品销售记录
 */
@Mapper
public interface SaleRecordDao {
    
    @Select("SELECT " +
            "    p.id AS product_id," +
            "    p.product_code," +
            "    p.product_name," +
            "    o.source_warehouse_id," +
            "    w.warehouse_code," +
            "    w.warehouse_name," +
            "    o.target_warehouse_id," +
            "    ww.warehouse_code as warehouseCode," +
            "    ww.warehouse_name as warehouseName," +
            "    YEAR(o.transfer_date) AS year," +
            "    QUARTER(o.transfer_date) AS quarter," +
            "    SUM(i.transfer_quantity) AS total_transfer_qty" +
            " FROM bb_transfer_order o" +
            " JOIN bb_transfer_order_item i ON o.id = i.transfer_order_id" +
            " JOIN bb_product p ON p.id = i.product_id" +
            " JOIN bb_warehouse w on o.source_warehouse_id=w.id" +
            " JOIN bb_warehouse ww on o.target_warehouse_id=ww.id" +
            " WHERE p.id=#{productId} and o.`status`=3" +
            " GROUP BY p.id, YEAR(o.transfer_date), QUARTER(o.transfer_date),w.id,ww.id")
    List<SaleRecordVo> getSaleRecordList(@Param("productId") Integer productId);
}
