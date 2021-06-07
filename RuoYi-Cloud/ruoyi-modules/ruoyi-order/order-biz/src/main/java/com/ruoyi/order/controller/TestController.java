package com.ruoyi.order.controller;

import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 测试Controller
 * 
 * @author ruoyi
 */
@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    @GetMapping
    public AjaxResult list(Integer id) {
        TestDTO test = new TestDTO(2, "张三");
        return AjaxResult.success(test);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class TestDTO {
        private Integer id;
        private String name;
    }

}
