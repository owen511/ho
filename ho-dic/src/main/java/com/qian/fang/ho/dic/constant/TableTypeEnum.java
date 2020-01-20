/**
 * @Title: TableTypeEnum.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月24日  owen
 */

package com.qian.fang.ho.dic.constant;

/**
 * 表类型枚举类.
 * 
 * @ClassName: TableTypeEnum
 * @Description: Description of this class
 * @author owen 于 2019年11月24日 下午9:15:30
 */

public enum TableTypeEnum {
	// 表类型 1-物理表 2-逻辑表 3-模板表4-枚举项表
	PHYSICAL("物理表", 'P'), LOGICAL("逻辑表", 'L'), TEMPLATE("模板表", 'T'), ENUM("枚举表", 'E');

	private String name;

	private char value;

	private TableTypeEnum(String name, char value) {
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
