package com.ms.service.goods;

import java.util.List;
import java.util.Map;

public abstract class SmallCategoryService
{

	/**
	 * ��ô�����µ�С�����б�
	 * @return
	 */
	public abstract List<Map<String,Object>> getSmallCategoryList(Map<String,Object> dto);

	/**
	 * ���С����
	 * @param dto
	 * @return
	 */
	public abstract boolean addSmallCategory(Map<String,Object> dto);
	
	/**
	 * �޸�С����
	 * @param dto
	 * @return
	 */
	public abstract boolean updateSmallCategory(Map<String,Object> dto);
	
	/**
	 * ɾ��С����
	 * @param dto
	 * @return
	 */
	public abstract boolean deleteSmallCategory(Map<String,Object> dto);
}
