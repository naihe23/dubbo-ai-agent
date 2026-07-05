package com.dubboai.aitransfer.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 库存操作日志表
 * @TableName bb_inventory_log
 */
@TableName(value ="bb_inventory_log")
@Data
public class BbInventoryLog {
    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 仓库ID
     */
    private Long warehouseId;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 变动类型（IN：入库，OUT：出库，TRANSFER_OUT：调拨出库，TRANSFER_IN：调拨入库）
     */
    private String changeType;

    /**
     * 变动数量（正为增加，负为减少）
     */
    private BigDecimal quantityChange;

    /**
     * 关联单据号（如调拨单号）
     */
    private String referenceNo;

    /**
     * 操作时间
     */
    private Date createdTime;

    /**
     * 备注
     */
    private String remark;
}