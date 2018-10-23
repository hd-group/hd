package com.ms.service.goods;

import java.util.List;
import java.util.Map;

public abstract class SmallCategoryService
{

	/**
	 * 获得大分类下的小分类列表
	 * @return
	 */
	public abstract List<Map<String,Object>> getSmallCategoryList(Map<String,Object> dto);

	/**
	 * 添加小分类
	 * @param dto
	 * @return
	 */
	public abstract boolean addSmallCategory(Map<String,Object> dto);
	
	/**
	 * 修改小分类
	 * @param dto
	 * @return
	 */
	public abstract boolean updateSmallCategory(Map<String,Object> dto);
	
	/**
	 * 删除小分类
	 * @param dto
	 * @return
	 */
	public abstract boolean deleteSmallCategory(Map<String,Object> dto);
}
