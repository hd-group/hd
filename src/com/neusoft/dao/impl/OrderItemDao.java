package com.neusoft.dao.impl;

import com.neusoft.dao.AbstractBaseDao;

import java.util.List;
import java.util.Map;

public class OrderItemDao extends AbstractBaseDao
{
    public OrderItemDao()
    {
        super("", "", "");
    }

    /**
     * 以事务的方式进行处理
     * 向订单表和订单详情表中添加数据
     * 修改购物车表中的商品信息
     * 更改商品表中的商品数量
     * @param dto
     * @return
     */
    @Override
    public boolean add(Map<String, String> dto) {
        return super.add(dto);
    }

    /**
     * 多表关联查询
     * 要查询的表包括订单表、订单详情表、商品表，邮寄信息表，支付方式表等表
     * @param dto
     * @return
     */
    @Override
    public List<Map<String, Object>> searchForList(Map<String, String> dto) {
        return super.searchForList(dto);
    }

    /**
     * 管理员删除订单功能
     * 注意作废订单的条件
     * @param dto
     * @return
     */
    public boolean delete(Map<String, String> dto)
    {
        return false;
    }
}
