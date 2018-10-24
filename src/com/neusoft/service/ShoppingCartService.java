package com.neusoft.service;

import com.neusoft.dao.impl.ShoppingCartDao;
import com.neusoft.util.Tools;

import java.util.List;
import java.util.Map;

public class ShoppingCartService
{
    private ShoppingCartDao dao = new ShoppingCartDao();

    /**
     * 查询购物车中商品,显示在购物车页面
     * @param dto
     * @return
     */
    public List<Map<String, Object>> searchGoodsForCart(Map<String, String[]> dto)
    {
        return null;
    }

    /**
     * 向购物车中添加商品
     * @param dto
     * @return
     */
    public boolean addGoodsToCart(Map<String, String[]> dto)
    {
        return false;
    }

    /**
     * 删除购物车中的商品
     * @param dto
     * @return
     */
    public boolean deleteGoodsFromCart(Map<String, String[]> dto)
    {
        return false;
    }

    /**
     * 修改购物车中商品的信息
     * @param dto
     * @return
     */
    public boolean updateGoodsFromCart(Map<String, String[]> dto)
    {
        return false;
    }
}
