/**
 * @Title: ClsTypeEnum.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月9日 下午6:17:07
 * @author owen
 */
 

package com.qian.fang.ho.ca.constant;

/**
 * 角色、权限分组枚举类.
 * @ClassName:ClsTypeEnum
 * @Description:
 * @author owen 于 2020年2月9日 下午6:17:07
 */

public enum ClsTypeEnum {

	CLS_ROLE("用户组", 0), CLS_DATA("数据权限组", 1),CLS_FUNC("功能权限组", 2);
	
	private String name;

	private int value;

	private ClsTypeEnum(String name, int value) {
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
