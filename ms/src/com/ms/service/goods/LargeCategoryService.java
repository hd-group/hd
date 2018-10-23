package com.ms.service.goods;

import java.util.List;
import java.util.Map;

public abstract class LargeCategoryService
{
	/**
	 * ��ȡ������б�
	 * @return
	 */
	public abstract List<Map<String,Object>> getLargeCategoryList();

	/**
	 * ��Ӵ����
	 * @param dto
	 * @return
	 */
	public abstract boolean addLargeCategory(Map<String,Object> dto);
	
	/**
	 * �޸Ĵ����
	 * @param dto
	 * @return
	 */
	public abstract boolean updateLargeCategory(Map<String,Object> dto);
	
	/**
	 * ɾ�������
	 * @param dto
	 * @return
	 */
	public abstract boolean deleteLargeCategory(Map<String,Object> dto);
}
