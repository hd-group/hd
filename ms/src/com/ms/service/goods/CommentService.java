package com.ms.service.goods;

import java.util.List;
import java.util.Map;

public abstract class CommentService
{

	/**
	 * 获得商品评论列表
	 * @return
	 */
	public abstract List<Map<String,Object>> searchCommentList(Map<String,Object> dto);

	/**
	 * 添加评论
	 * @param dto
	 * @return
	 */
	public abstract boolean addComment(Map<String,Object> dto);
	
	/**
	 * 删除一条评论
	 * @param dto
	 * @return
	 */
	public abstract boolean deleteComment(Map<String,Object> dto);
	
	/**
	 * 删除所有评论
	 * @param dto
	 * @return
	 */
	public abstract boolean deleteAllComment(Map<String,Object> dto);
}
