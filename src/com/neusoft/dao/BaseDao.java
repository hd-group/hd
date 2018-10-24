package com.neusoft.dao;

import java.util.List;
import java.util.Map;

public interface BaseDao
{
    List<Map<String, Object>> searchForList(Map<String, String> dto);
    boolean add(Map<String, String> dto);
    boolean update(Map<String, String> dto);
}
