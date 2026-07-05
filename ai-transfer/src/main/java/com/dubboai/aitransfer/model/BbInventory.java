package com.dubboai.aitransfer.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 库存表
 * @TableName bb_inventory
 */
@TableName(value ="bb_inventory")
@Data
public class BbInventory {
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
     * 当前库存数量
     */
    private BigDecimal quantity;

    /**
     * 锁定库存数量（例如调拨中未完成的部分）
     */
    private BigDecimal lockedQuantity;

    /**
     * 更新时间
     */
    private Date updatedTime;
}