/**
 * @Title: ModuleEntity.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月21日 下午2:32:22
 * @author owen
 */
 

package com.qian.fang.ho.module.entity;

import java.io.Serializable;

import com.qian.fang.ho.common.entity.HOBaseEntity;

/**
 * 模块实体类.
 * @ClassName:ModuleEntity
 * @Description:
 * @author owen 于 2020年2月21日 下午2:32:22
 */

public class ModuleEntity extends HOBaseEntity implements Serializable {

	/**
	 * @Fields serialVersionUID : Description
	 */
	
	private static final long serialVersionUID = -3226031191786456837L;
	
	//流水号PK
	private int moduleid;
	
	//编码
	private String code;
	
	//名称
	private String name;

	/**
	 * @return moduleid
	 */
	public int getModuleid() {
		return moduleid;
	}

	/**
	 * @param moduleid 要设置的 moduleid
	 */
	public void setModuleid(int moduleid) {
		this.moduleid = moduleid;
	}

	/**
	 * @return code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code 要设置的 code
	 */
	public void setCode(String code) {
		this.code = code;
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
