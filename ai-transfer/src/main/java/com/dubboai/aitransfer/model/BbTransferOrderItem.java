package com.dubboai.aitransfer.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 调拨单明细表
 * @TableName bb_transfer_order_item
 */
@TableName(value ="bb_transfer_order_item")
@Data
public class BbTransferOrderItem {
    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 调拨单ID
     */
    private Long transferOrderId;

    /**
     * 商品ID
     */
    private Long productId;

    /**
     * 调拨数量
     */
    private BigDecimal transferQuantity;

    /**
     * 实际到货数量
     */
    private BigDecimal actualQuantity;

    /**
     * 备注
     */
    private String remark;
}