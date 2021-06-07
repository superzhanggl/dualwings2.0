package com.ruoyi.sales.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.sales.entity.domain.SalesTest;

public interface SalesTestMapper extends BaseMapper<SalesTest> {

    public SalesTest selectSalesTestById(Long testId);

    public List<SalesTest> selectSalesTestList(SalesTest salesTest);

    public int insertSalesTest(SalesTest salesTest);

    public int updateSalesTest(SalesTest salesTest);

    public int deleteSalesTestById(Long testId);

    public int deleteSalesTestByIds(Long[] testIds);
}
