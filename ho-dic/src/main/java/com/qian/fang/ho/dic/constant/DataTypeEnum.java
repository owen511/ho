/**
 * @Title: DataTypeEnum.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月24日  owen
 */
 

package com.qian.fang.ho.dic.constant;

/**
 * 	字段类型枚举类.
 * @ClassName: DataTypeEnum
 * @Description: Description of this class
 * @author owen 于 2019年11月24日 下午9:21:01
 */

public enum DataTypeEnum {

	NUMBER("数字型", 'N'), VARCHAR("字符型", 'S'), TIME("时间型", 'T'), DATE("日期型", 'D');
	
	private String name;

	private char value;

	private DataTypeEnum(String name, char value) {
		this.name = name;
		this.value = value;
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
	 * @return value
	 */
	public char getValue() {
		return value;
	}

	/**
	 * @param value 要设置的 value
	 */
	public void setValue(char value) {
		this.value = value;
	}

}
