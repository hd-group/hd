package com.neusoft.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tools
{
    private Tools(){}

    public static final boolean isNullValue(String value)
    {
        if(value.equals("") || value == null || value.trim().length() == 0)
        {
            return true;
        }
        return false;
    }

    public static final Map<String, String> getMap(Map<String, String[]> map)
    {
        Map<String, String> item = new HashMap<>();
        for (Map.Entry<String, String[]> entry : map.entrySet())
        {
            String key = entry.getKey();
            String value = getValue(entry.getValue());
            item.put(key, value);
        }
        return  item;
    }

    private static String getValue(String[] val)
    {
        String value = Arrays.toString(val);
        value = value.replace("[", "").replace("]", "");
        return value;
    }
}
