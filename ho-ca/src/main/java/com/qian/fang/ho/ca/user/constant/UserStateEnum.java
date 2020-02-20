/**
 * @Title: UserStateEnum.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年1月17日 上午11:16:27
 * @author owen
 */

package com.qian.fang.ho.ca.user.constant;

/**
 * 用户状态枚举类.
 * @ClassName:
 * @Description:
 * @author owen 于 2020年1月17日 上午11:16:27
 */

public enum UserStateEnum {

	INVALID("无效",0), ENABLED("启用",1), DISABLED("停用",2);

	private String name;
	private int value;

	private UserStateEnum(String name, int value) {
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
