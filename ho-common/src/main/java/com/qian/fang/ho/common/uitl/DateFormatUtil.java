/**
 * @Title: DateFormatUtil.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年01月13日  owen
 */

package com.qian.fang.ho.common.uitl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 ** 日期时间格式工具类.
 *  
 * @author owen 于 2020年1月13日 上午10:10:42
 */

public class DateFormatUtil {

	public static final String TIME_PATTON_DEFAULT = "yyyyMMdd HH:mm:ss";
	public static final String DATE_PATTON_DEFAULT = "yyyyMMdd";
	public static final String TIME_PATTON_HHMMSS = "HH:mm:ss";

	public static final int ONE_SECOND = 1000;
	public static final int ONE_MINUTE = 60 * ONE_SECOND;
	public static final int ONE_HOUR = 60 * ONE_MINUTE;
	public static final long ONE_DAY = 24 * ONE_HOUR;
	
	static SimpleDateFormat dateFormat = null;
	
	public static SimpleDateFormat dateFormat(String pattern) {
		dateFormat = new SimpleDateFormat(pattern);
		return dateFormat;
	}
	
	/**
	 * 获取年度.
	 * @return
	 */
	public static int getYear() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.YEAR);
	}
	
	/**
	 * 获取当前日期.
	 * @return
	 */
	public static String getCurrentDate() {
		return dateFormat(DATE_PATTON_DEFAULT).format(new Date());
	}
	
	/**
	 * 获取当前日期时间.
	 * @return
	 */
	public static String getCurrentDateTime() {
		return dateFormat(TIME_PATTON_DEFAULT).format(new Date());
	}
	
	
	/**
	 * 获取当前时间.
	 * @return
	 */
	public static String getCurrentTime() {
		return dateFormat(TIME_PATTON_HHMMSS).format(new Date());
	}
	
	public static void main(String args []) {
		System.out.println(DateFormatUtil.getCurrentDate());
		System.out.println(DateFormatUtil.getCurrentDateTime());
		System.out.println(DateFormatUtil.getCurrentTime());
	}

}
