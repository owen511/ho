/**
 * @Title: CaBaseEntity.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年1月16日  owen
 */

package com.qian.fang.ho.ca;

import javax.persistence.MappedSuperclass;

import com.qian.fang.ho.common.entity.HOBaseEntity;

/**
 * 用户、角色通用实体类.
 * @author owen 于 2020年1月16日 下午6:03:00
 */
@MappedSuperclass
public abstract class CaBaseEntity extends HOBaseEntity {

	// Hibernate用于控制并发的属性，乐观锁。
	private int version;

	// 编码.
	private String code;

	// 名称.
	private String name;
	
	//创建日期.
	private String createdate;
	
	//修改日期.
	private String updatedate;

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

	/**
	 * @return createdate
	 */
	public String getCreatedate() {
		return createdate;
	}

	/**
	 * @param createdate 要设置的 createdate
	 */
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	/**
	 * @return updatedate
	 */
	public String getUpdatedate() {
		return updatedate;
	}

	/**
	 * @param updatedate 要设置的 updatedate
	 */
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

}
