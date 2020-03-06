/**
 * @Title: SQLParserEnum.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月21日 下午4:01:11
 * @author owen
 */

package com.qian.fang.ho.common.uitl;

/**
 * SQL解析条件的操作符枚举类.
 * @ClassName:SQLParserEnum
 * @Description:
 * @author owen 于 2020年2月21日 下午4:01:11
 */

public enum SQLParserEnum {
	AND("and"), OR("or"), IN("in"), LIKE("like"), EQ("="), GT(">"), GE(">="), LT("<"), LE("<="), BETWEEN("between");

	private String name;

	private SQLParserEnum(String name) {
		this.name = name;
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

}
