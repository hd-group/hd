package com.ms.service.goods;

import java.util.List;
import java.util.Map;

public abstract class LargeCategoryService
{
	/**
	 * 获取大分类列表
	 * @return
	 */
	public abstract List<Map<String,Object>> getLargeCategoryList();

	/**
	 * 添加大分类
	 * @param dto
	 * @return
	 */
	public abstract boolean addLargeCategory(Map<String,Object> dto);
	
	/**
	 * 修改大分类
	 * @param dto
	 * @return
	 */
	public abstract boolean updateLargeCategory(Map<String,Object> dto);
	
	/**
	 * 删除大分类
	 * @param dto
	 * @return
	 */
	public abstract boolean deleteLargeCategory(Map<String,Object> dto);
}
