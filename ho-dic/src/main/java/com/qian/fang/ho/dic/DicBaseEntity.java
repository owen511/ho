/**
 * @Title: DicBaseEntity.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月24日  owen
 */

package com.qian.fang.ho.dic;

import com.qian.fang.ho.common.entity.HOBaseEntity;

/**
 * 数字字典通用实体类.
 * 
 * @ClassName: DicBaseEntity
 * @Description: Description of this class
 * @author owen 于 2019年11月24日 下午9:01:14
 */

public class DicBaseEntity extends HOBaseEntity {

	/**
	 * @Fields serialVersionUID : Description
	 */
	private static final long serialVersionUID = -2659768815397237017L;

	// Hibernate用于控制并发的属性，乐观锁。
	private int version;
	
	/**
	 * @return version
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * @param version 要设置的 version
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		DicBaseEntity entity = new DicBaseEntity();
		return this.getFieldValueByName(entity) + super.toString();
	}
}
