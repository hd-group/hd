package com.ms.dao;

import java.util.List;
import java.util.Map;

public abstract class DAOSupport
{
	public abstract List<Map<String,Object>> searchForList(Map<String,Object> dto);
	
	public abstract Map<String,Object> searchForOne(Map<String,Object> dto);

	public abstract boolean add(Map<String,Object> dto);
	
	public abstract boolean update(Map<String,Object> dto);
}