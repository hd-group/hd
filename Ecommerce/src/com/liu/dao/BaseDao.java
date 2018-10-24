package com.liu.dao;

import com.liu.Tools.DbUtil;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//懒 巧
public class BaseDao {

    private String table;
    private String pkName;
    private String seqName;
    public BaseDao(String table,String pkName,String seqName){
        this.table=table;
        this.seqName=seqName;
        this.pkName=pkName;
    }
    public int insert(Map<String,String> map){
        int row=0;
        String sql="insert into "+table+"("+pkName;
        String cols="";// 列名的列表
        String values=")values("+seqName+".nextval";
        //存放问号对应的值
        List<String> param=new ArrayList<>();
        for (Map.Entry<String,String> entry:map.entrySet()){
            cols+=","+entry.getKey();
            values+=",?";
            param.add(entry.getValue());
        }
        sql+=cols;
        sql+=values;
        sql+=")";
        //System.out.println(sql);
        QueryRunner qr=new QueryRunner(DbUtil.getDataSource());
        try {
            row=qr.update(sql,param.toArray());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return row;
    }

    //只要map中存在 列名 都是我们作为查询的条件使用
    public List<Map<String,Object>> findByParam(Map<String,String> map){
        List<Map<String,Object>> list=null;
        StringBuilder sql=new StringBuilder();
        sql.append("select * from ");
        sql.append(table);
        sql.append(" where 1=1 ");
        List<String> param=new ArrayList<>();
        if(map!=null){
            //多条件组合查询
            for (Map.Entry<String,String> entry:map.entrySet()){
                sql.append(" and ");
                sql.append(entry.getKey());
                sql.append(" =? ");
                param.add(entry.getValue());
            }
        }
        QueryRunner qr=new QueryRunner(DbUtil.getDataSource());
        try {
            list=qr.query(sql.toString(),new MapListHandler(),param.toArray());
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }

    public int delete(Map<String,String> map){
        int row=0;
        StringBuilder sql=new StringBuilder();
        sql.append("delete from ");
        sql.append(table);
        sql.append(" where 1=1 ");
        if(map!=null){
            sql.append(" and ");
            sql.append(pkName);
            sql.append(" in (");
            sql.append(map.get(pkName));//1,3,4
            sql.append(")");
        }
        QueryRunner qr=new QueryRunner(DbUtil.getDataSource());
        try {
            row=qr.update(sql.toString());
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return row;
    }
}
