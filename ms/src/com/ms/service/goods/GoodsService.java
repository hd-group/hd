package com.ms.service.goods;

import java.util.List;
import java.util.Map;

public abstract class GoodsService
{

	/**
	  *  �û�����ҳ�Ƽ���Ʒ
	 * @param dto
	 * @return
	 */
    public abstract List<Map<String,Object>> searchGoodsListforHome(Map<String,Object> dto);
    
	/**
	  *  �û��˲�����Ʒ
	 * @param dto
	 * @return
	 */
   public abstract List<Map<String,Object>> searchGoodsListforUser(Map<String,Object> dto);
    
    /**
                *    ��Ʒ����
     * @param dto
     * @return
     */
    public abstract List<Map<String,Object>> searchGoodsListforOne(Map<String,Object> dto);
    
    /**
                * ����Ա�˲�����Ʒ
     * @param dto
     * @return
     */
    public abstract List<Map<String,Object>> searchGoodsListforAdmin(Map<String,Object> dto);

    /**
                *  ����Ա�������Ʒ��Ϣ
     * @param dto
     * @return
     */
	public abstract boolean addGoods(Map<String,Object> dto);
	
	/**
                *  ����Ա���޸���Ʒ��Ϣ
	 * @param dto
	 * @return
	 */
	public abstract boolean updateGoods(Map<String,Object> dto);
	
	/**
                *  ����Ա��ɾ����Ʒ��Ϣ
	 * @param dto
	 * @return
	 */
	public abstract boolean deleteGoods(Map<String,Object> dto);
}
