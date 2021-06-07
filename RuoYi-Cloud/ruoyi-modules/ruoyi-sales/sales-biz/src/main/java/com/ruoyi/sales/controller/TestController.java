package com.ruoyi.sales.controller;

import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.sales.entity.domain.SalesTest;
import com.ruoyi.sales.service.SalesTestService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 测试Controller
 * 
 * @author ruoyi
 */
@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    @Autowired
    private SalesTestService salesTestService;

    @GetMapping
    public AjaxResult list(Integer id) {

        SalesTest salesTest = new SalesTest();
        salesTest.setName("测试"+id);
        salesTest.setType("类型");
        salesTestService.save(salesTest);

        List<SalesTest> list = salesTestService.list();

        return AjaxResult.success(list);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class TestDTO {
        private Integer id;
        private String name;
    }

}
