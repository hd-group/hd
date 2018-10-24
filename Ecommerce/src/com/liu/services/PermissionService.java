package com.liu.services;

import java.util.List;
import java.util.Map;

public class PermissionService
{

    //查询管理员拥有的权限
    public List<Map<String,Object>> findByAdminType(Map<String,String[]> map)
    {
        return null;
    }

    //增加管理员权限
    public boolean addAdminPermission(Map<String,String[]> map)
    {
        return false;
    }

    //修改管理员权限
    public boolean updateAdminPermission(Map<String,String[]> map)
    {
        return  false;
    }

    //删除管理员权限
    public boolean deleteAdminPermission(Map<String,String[]> map)
    {
        return false;
    }
}
