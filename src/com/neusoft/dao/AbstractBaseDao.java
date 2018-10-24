package com.neusoft.dao;

import java.util.List;
import java.util.Map;

public abstract class AbstractBaseDao implements BaseDao
{
    protected String tableName;
    protected String priName;
    protected String seqName;
    protected AbstractBaseDao(String tableName, String priName, String seqName)
    {
        this.tableName = tableName;
        this.priName = priName;
        this.seqName = seqName;
    }
    /**
     * 查询所有相关信息
     * @param dto
     * @return
     */
    @Override
    public List<Map<String, Object>> searchForList(Map<String, String> dto) {
        return null;
    }

    /**
     * 添加相关信息
     * @param dto
     * @return
     */
    @Override
    public boolean add(Map<String, String> dto) {
        return false;
    }

    /**
     * 修改相关信息
     * @param dto
     * @return
     */
    @Override
    public boolean update(Map<String, String> dto) {
        return false;
    }
}
