package com.ruoyi.sales.entity.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.ruoyi.common.mybatisplus.domain.CommonEntity;
import lombok.Data;

/**
 * 【请填写功能名称】对象 sales_test
 * 
 * @author ruoyi
 * @date 2021-06-06
 */
@Data
public class SalesTest extends CommonEntity {

    @TableId(value = "test_id", type = IdType.ASSIGN_ID)
    private Long testId;

    private String name;

    private String type;

}
