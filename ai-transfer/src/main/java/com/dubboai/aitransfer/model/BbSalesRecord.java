package com.dubboai.aitransfer.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 商品销售记录表
 * @TableName bb_sales_record
 */
@TableName(value ="bb_sales_record")
@Data
public class BbSalesRecord {
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
     * 销售日期
     */
    private Date saleDate;

    /**
     * 销售数量
     */
    private BigDecimal quantity;

    /**
     * 销售金额
     */
    private BigDecimal revenue;

    /**
     * 创建时间
     */
    private Date createdTime;
}