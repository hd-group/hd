package com.neusoft.util;

import javax.activation.DataSource;
import java.sql.Connection;

public class DBUtils
{
    private DBUtils(){}

    //private static final ComboPooledDataSource cpds;
    static
    {
   //     cpds = new ComboPooledDataSource();
    }

    public static DataSource getDataSource()
    {
//        return cpds;
        return null;
    }

    public static Connection getConnection()
    {
        return null;
    }

}
