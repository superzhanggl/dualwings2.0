package com.ruoyi.sales.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.sales.entity.domain.SalesTest;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2021-06-06
 */
public interface SalesTestService extends IService<SalesTest> {
    /**
     * 查询【请填写功能名称】
     * 
     * @param testId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public SalesTest selectSalesTestById(Long testId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param salesTest 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SalesTest> selectSalesTestList(SalesTest salesTest);

    /**
     * 新增【请填写功能名称】
     * 
     * @param salesTest 【请填写功能名称】
     * @return 结果
     */
    public int insertSalesTest(SalesTest salesTest);

    /**
     * 修改【请填写功能名称】
     * 
     * @param salesTest 【请填写功能名称】
     * @return 结果
     */
    public int updateSalesTest(SalesTest salesTest);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param testIds 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteSalesTestByIds(Long[] testIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param testId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteSalesTestById(Long testId);
}
