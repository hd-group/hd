package com.neusoft.service;

import com.neusoft.dao.impl.OrderItemDao;

import java.util.List;
import java.util.Map;

public class OrderItemService
{
    private OrderItemDao dao = new OrderItemDao();

    /**
     * 查询详细订单信息
     * 可用于用户订单页面以及管理员管理页面
     * @param dto
     * @return
     */
    public List<Map<String, Object>> searchOrderItems(Map<String, String[]> dto)
    {
        return null;
    }

    /**
     * 提交订单
     * @param dto
     * @return
     */
    public boolean addOrder(Map<String, String[]> dto)
    {
        return false;
    }

    /**
     * 删除作废订单，管理员使用
     * @param dto
     * @return
     */
    public boolean deleteUnuseOrder(Map<String, String[]> dto)
    {
        return false;
    }

    /**
     * 修改订单状态---管理员使用
     * @param dto
     * @return
     */
    public boolean updateOrderState(Map<String, String[]> dto)
    {
        return false;
    }
}
