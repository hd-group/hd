package com.neusoft.dao.impl;

import com.neusoft.dao.AbstractBaseDao;
import com.neusoft.dao.BaseDao;

import java.util.List;
import java.util.Map;

public class ShoppingCartDao extends AbstractBaseDao {

    public ShoppingCartDao()
    {
        super("", "", "");
    }

    /**
     *删除购物车中相关商品
     * 支持单个商品删除和批量删除
     * @param dto
     * @return
     */
    public boolean delete(Map<String, String> dto)
    {
        return false;
    }

}
