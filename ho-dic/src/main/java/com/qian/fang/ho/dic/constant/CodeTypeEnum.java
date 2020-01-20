/**
 * @Title: CodeTypeEnum.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月27日  owen
 */
 

package com.qian.fang.ho.dic.constant;

/**
 * 代码类型枚举类.
 * @author owen 于 2019年11月27日 下午2:17:26
 */

public enum CodeTypeEnum {
	
	ORDER("顺序码",'O'),LAYER("层码",'L');

	private String name;
	
	private char value;
	
	private CodeTypeEnum(String name, char value) {
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
