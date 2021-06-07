package com.ruoyi.common.mybatisplus.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Description
 * @Author weibf
 * @Date 2021/6/1 10:26
 */
@Data
public class CommonEntity implements Serializable {

    /** 创建者 */
    @TableField(fill = FieldFill.INSERT)
    private String crtAcct;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime crtDt;

    /** 更新者 */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String mdfAcct;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime mdfDt;
}
