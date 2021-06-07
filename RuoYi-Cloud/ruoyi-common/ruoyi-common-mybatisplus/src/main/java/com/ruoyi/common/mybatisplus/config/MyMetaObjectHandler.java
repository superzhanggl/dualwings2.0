package com.ruoyi.common.mybatisplus.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.ruoyi.common.core.utils.SecurityUtils;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        String userName = SecurityUtils.getUsername();
        LocalDateTime currTime = LocalDateTime.now();

        this.setFieldValByName("crtAcct", userName, metaObject);
        this.setFieldValByName("crtDt", currTime, metaObject);
        this.setFieldValByName("mdfAcct", userName, metaObject);
        this.setFieldValByName("mdfDt", currTime, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        String userName = SecurityUtils.getUsername();
        LocalDateTime currTime = LocalDateTime.now();

        this.setFieldValByName("mdfAcct", userName, metaObject);
        this.setFieldValByName("mdfDt", currTime, metaObject);
    }
}
