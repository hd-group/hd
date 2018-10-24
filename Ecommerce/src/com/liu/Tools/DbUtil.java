package com.liu.Tools;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;

public class DbUtil
{
    private  final static ComboPooledDataSource ds;

    static
    {
        ds = new ComboPooledDataSource();
    }

    public static DataSource getDataSource()
    {
        return  ds;
    }

    public static void main(String[] args) {
        System.out.println(getDataSource());
        System.out.println(getDataSource());
    }
}
