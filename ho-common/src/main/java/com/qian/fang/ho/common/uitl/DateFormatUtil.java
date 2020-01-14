/**
 * @Title: DateFormatUtil.java
 * @Copyright (C) 2020 ǰ�����
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020��1��13��  owen
 */

package com.qian.fang.ho.common.uitl;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * ʱ���ʽ������.
 *  
 * @author owen �� 2020��1��13�� ����10:10:42
 */

public class DateFormatUtil {
	public static final String DATE_DIVISION = "-";

	public static final String TIME_PATTON_DEFAULT = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_PATTON_DEFAULT = "yyyy-MM-dd";
	public static final String DATE_PATTON_YYYYMMDD = "yyyyMMdd";
	public static final String DATE_PATTON_YYYY = "yyyy";
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
	 * ��ȡ��ǰ���.
	 * @return
	 */
	public static int getYear() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.YEAR);
	}
	
	public static void main(String args []) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(Calendar.YEAR);
		System.out.println(calendar.get(1));
	}

}
