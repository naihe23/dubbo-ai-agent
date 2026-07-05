package com.dubboai.aitransfer.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 商品信息表
 * @TableName bb_product
 */
@TableName(value ="bb_product")
@Data
public class BbProduct {
    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 商品编码
     */
    private String productCode;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 规格型号
     */
    private String spec;

    /**
     * 计量单位
     */
    private String unit;

    /**
     * 分类
     */
    private String category;

    /**
     * 状态（1：启用，0：停用）
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新时间
     */
    private Date updatedTime;
}