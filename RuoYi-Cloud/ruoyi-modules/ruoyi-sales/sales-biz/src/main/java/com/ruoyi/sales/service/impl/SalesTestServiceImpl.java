package com.ruoyi.sales.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.sales.entity.domain.SalesTest;
import com.ruoyi.sales.mapper.SalesTestMapper;
import com.ruoyi.sales.service.SalesTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-06-06
 */
@Service
public class SalesTestServiceImpl extends ServiceImpl<SalesTestMapper, SalesTest> implements SalesTestService {

    @Autowired
    private SalesTestMapper salesTestMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param testId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public SalesTest selectSalesTestById(Long testId)
    {
        return salesTestMapper.selectSalesTestById(testId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param salesTest 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SalesTest> selectSalesTestList(SalesTest salesTest)
    {
        return salesTestMapper.selectSalesTestList(salesTest);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param salesTest 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSalesTest(SalesTest salesTest)
    {
        return salesTestMapper.insertSalesTest(salesTest);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param salesTest 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSalesTest(SalesTest salesTest)
    {
        return salesTestMapper.updateSalesTest(salesTest);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param testIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteSalesTestByIds(Long[] testIds)
    {
        return salesTestMapper.deleteSalesTestByIds(testIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param testId 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteSalesTestById(Long testId)
    {
        return salesTestMapper.deleteSalesTestById(testId);
    }
}
