/**
 * @Title: UserTypeEnum.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年1月17日  owen
 */
 

package com.qian.fang.ho.ca.user.constant;

/**
 * 用户类型枚举类.
 * @ClassName: UserTypeEnum
 * @Description: Description of this class
 * @author owen 于 2020年1月17日 上午10:15:29
 */

public enum UserTypeEnum {

	// 用户类型 0-普通用户 1-管理用户 2-超级用户
	COMMON("普通用户", 0), MANAGER("管理用户 ", 1), ADMIN("超级用户", 2);
	private String name;

	private int value;
	
	private UserTypeEnum(String name,int value) {
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
	public int getValue() {
		return value;
	}

	/**
	 * @param value 要设置的 value
	 */
	public void setValue(int value) {
		this.value = value;
	}
}
