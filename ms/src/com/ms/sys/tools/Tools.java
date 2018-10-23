package com.ms.sys.tools;

import java.math.BigDecimal;

public final class Tools
{

	private final static int MATCH_SCALE=2;         //四舍五入默认小数位数
	/**
	 * 以下四个方法为精度转换方法
	 * @param dol double
	 * @param scale int
	 * @return String
	 */
	public static double ObjToDouble(Object dol, int scale)
	{
		  return Tools.ObjectToBigDecimal(dol, scale).doubleValue();
	}
	public static double ObjToDouble(Object dol)
	{
	   return Tools.ObjToDouble(dol, MATCH_SCALE);	
	}
	
	public static String DoubleToStr(double dol, int scale)
	{
	    return Tools.ObjectToBigDecimal(dol, scale).toString();
	}
	public static String DoubleToStr(double dol)
	{
	    return Tools.DoubleToStr(dol, MATCH_SCALE);
	}

	public static double DoubleToDouble(double dol, int scale)
	{
	    return Tools.ObjectToBigDecimal(dol, scale).doubleValue();
	}
	public static double DoubleToDouble(double dol)
	{
	    return Tools.DoubleToDouble(dol,  MATCH_SCALE);
	}

	public static double StrToDouble(String dol, int scale)
	{
	    return Tools.ObjectToBigDecimal(dol, scale).doubleValue();
	}
	public static double StrToDouble(String dol)
	{
	    return Tools.StrToDouble(dol, MATCH_SCALE);
	}
	public static String StrToStr(String dol, int scale)
	{
	   return Tools.ObjectToBigDecimal(dol, scale).toString();
	}
	public static String StrToStr(String dol)
	{
	  return Tools.StrToStr(dol,MATCH_SCALE);
	}
	
	private static BigDecimal ObjectToBigDecimal(Object dol,int scale)
	{
		BigDecimal decimal=null;
		if(dol==null || dol.equals(""))
		{
			return new BigDecimal(0);
		}
		decimal = new BigDecimal(dol.toString());
		decimal = decimal.setScale(scale, BigDecimal.ROUND_HALF_UP);
		return decimal;
	}
	
	public static final boolean isNotNull(Object o) 
	{
		return !o.equals(null)&&o!=" ";
	}
}
