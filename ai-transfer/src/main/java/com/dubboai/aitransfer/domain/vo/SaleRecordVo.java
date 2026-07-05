package com.dubboai.aitransfer.domain.vo;

import lombok.Data;

/**
 *
 *@author zhang_jiawang
 *@date 2026/7/4
 *@description
 */
@Data
public class SaleRecordVo {

    private Integer productId;

    private String productCode;

    private String productName;

    private Integer sourceWarehouseId;

    private String warehouseCode;

    private String warehouseName;

    private Integer targetWarehouseId;

    private String targetWarehouseCode;

    private String targetWarehouseName;

    private String year;

    private Integer quarter;

    private Long totalSaleQty;

    public SaleRecordVo(Integer productId, String productCode, String productName,
                        Integer sourceWarehouseId, String warehouseCode, String warehouseName,
                        Integer targetWarehouseId, String targetWarehouseCode, String targetWarehouseName,
                        String year, Integer quarter, Long totalSaleQty) {
        this.productId = productId;
        this.productCode = productCode;
        this.productName = productName;
        this.sourceWarehouseId = sourceWarehouseId;
        this.warehouseCode = warehouseCode;
        this.warehouseName = warehouseName;
        this.targetWarehouseId = targetWarehouseId;
        this.targetWarehouseCode = targetWarehouseCode;
        this.targetWarehouseName = targetWarehouseName;
        this.year = year;
        this.quarter = quarter;
        this.totalSaleQty = totalSaleQty;
    }
}
