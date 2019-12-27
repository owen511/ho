/**
 * @Title: TableTypeEnum.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月24日  owen
 */

package com.qian.fang.ho.dic.util;

/**
 * 表类型枚举类.
 * 
 * @ClassName: TableTypeEnum
 * @Description: Description of this class
 * @author owen 于 2019年11月24日 下午9:15:30
 */

public enum TableTypeEnum {
	// 表类型 1-物理表 2-逻辑表 3-模板表4-枚举项表
	PHYSICAL_TABLE("物理表", 'P'), LOGICAL_TABLE("逻辑表", 'L'), TEMPLATE_TABLE("模板表", 'T'), ENUM_TABLE("枚举表", 'E');

	private String name;

	private char type;

	private TableTypeEnum(String name, char type) {
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
