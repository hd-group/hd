package com.ms.service.goods;

import java.util.List;
import java.util.Map;

public abstract class CommentService
{

	/**
	 * �����Ʒ�����б�
	 * @return
	 */
	public abstract List<Map<String,Object>> searchCommentList(Map<String,Object> dto);

	/**
	 * �������
	 * @param dto
	 * @return
	 */
	public abstract boolean addComment(Map<String,Object> dto);
	
	/**
	 * ɾ��һ������
	 * @param dto
	 * @return
	 */
	public abstract boolean deleteComment(Map<String,Object> dto);
	
	/**
	 * ɾ����������
	 * @param dto
	 * @return
	 */
	public abstract boolean deleteAllComment(Map<String,Object> dto);
}
