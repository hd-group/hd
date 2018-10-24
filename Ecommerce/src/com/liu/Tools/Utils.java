package com.liu.Tools;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Utils
{
    public static Map<String,String> convertToMap(Map<String,String[]> map)
    {
        Map<String,String> item = new HashMap<>();
        if(map!=null)
        {
            for(Map.Entry<String,String[]> entry:map.entrySet())
            {
                String key = entry.getKey();
                String[] values = entry.getValue();
                if(values!=null)
                {
                    String value = Arrays.toString(values).replace("[","")
                            .replace("]","")
                            .replace(", ",",");
                    item.put(key,value);
                }

            }
        }
        return item;
    }
}
