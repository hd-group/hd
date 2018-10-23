package com.ms.service.goods;

import java.util.List;
import java.util.Map;

public abstract class GoodsService
{

	/**
	  *  用户端首页推荐商品
	 * @param dto
	 * @return
	 */
    public abstract List<Map<String,Object>> searchGoodsListforHome(Map<String,Object> dto);
    
	/**
	  *  用户端查找商品
	 * @param dto
	 * @return
	 */
   public abstract List<Map<String,Object>> searchGoodsListforUser(Map<String,Object> dto);
    
    /**
                *    商品详情
     * @param dto
     * @return
     */
    public abstract List<Map<String,Object>> searchGoodsListforOne(Map<String,Object> dto);
    
    /**
                * 管理员端查找商品
     * @param dto
     * @return
     */
    public abstract List<Map<String,Object>> searchGoodsListforAdmin(Map<String,Object> dto);

    /**
                *  管理员端添加商品信息
     * @param dto
     * @return
     */
	public abstract boolean addGoods(Map<String,Object> dto);
	
	/**
                *  管理员端修改商品信息
	 * @param dto
	 * @return
	 */
	public abstract boolean updateGoods(Map<String,Object> dto);
	
	/**
                *  管理员端删除商品信息
	 * @param dto
	 * @return
	 */
	public abstract boolean deleteGoods(Map<String,Object> dto);
}
