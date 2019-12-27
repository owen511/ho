/**
 * @Title: DataTypeEnum.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月24日  owen
 */
 

package com.qian.fang.ho.dic.util;

/**
 * 	字段类型枚举类.
 * @ClassName: DataTypeEnum
 * @Description: Description of this class
 * @author owen 于 2019年11月24日 下午9:21:01
 */

public enum DataTypeEnum {

	NUMBER_DATATYPE("数字型", 'N'), STRING_DATATYPE("字符型", 'S'), TIME_DATATYPE("时间型", 'T'), DATE_DATATYPE("日期型", 'D');
	
	private String name;

	private char type;

	private DataTypeEnum(String name, char type) {
		this.name = name;
		this.type = type;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return type
	 */
	public char getType() {
		return type;
	}

	/**
	 * @param type 要设置的 type
	 */
	public void setType(char type) {
		this.type = type;
	}
}
