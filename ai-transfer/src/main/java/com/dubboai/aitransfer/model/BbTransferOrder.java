package com.dubboai.aitransfer.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 调拨单主表
 * @TableName bb_transfer_order
 */
@TableName(value ="bb_transfer_order")
@Data
public class BbTransferOrder {
    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 调拨单号
     */
    private String orderNo;

    /**
     * 调出仓库ID
     */
    private Long sourceWarehouseId;

    /**
     * 调入仓库ID
     */
    private Long targetWarehouseId;

    /**
     * 状态（0：待审核，1：已审核，2：调拨中，3：已完成，4：已取消）
     */
    private Integer status;

    /**
     * 调拨类型：1智能，0人工
     */
    private Integer transferType;

    /**
     * 调拨日期
     */
    private Date transferDate;

    /**
     * 说明
     */
    private String comment;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 审核人
     */
    private String approvedBy;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新时间
     */
    private Date updatedTime;
}