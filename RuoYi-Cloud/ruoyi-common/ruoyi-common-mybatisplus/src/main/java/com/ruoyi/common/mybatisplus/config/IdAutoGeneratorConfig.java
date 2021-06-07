package com.ruoyi.common.mybatisplus.config;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.ruoyi.common.core.utils.UniqueUtils;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author weibf
 * @Date 2021/6/2 9:28
 */
@Component
public class IdAutoGeneratorConfig implements IdentifierGenerator {

    @Override
    public Long nextId(Object entity) {
        Long id = UniqueUtils.getKey();
        return id;
    }

}
