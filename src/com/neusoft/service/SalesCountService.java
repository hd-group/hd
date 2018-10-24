package com.neusoft.service;

import com.neusoft.dao.impl.SalesCountDao;

import java.util.List;
import java.util.Map;

public class SalesCountService
{
    private SalesCountDao dao = new SalesCountDao();

    /**
     * 商品销售统计
     * @param dto
     * @return
     */
    public List<Map<String, Object>> searchSalesCount(Map<String, String[]> dto)
    {
        return null;
    }
}
