/**
 * @Title: DataRightEntity.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年3月6日 上午10:10:08
 * @author owen
 */
 

package com.qian.fang.ho.ca.dataright.entity;

import java.io.Serializable;

import com.qian.fang.ho.ca.CaBaseEntity;
import com.qian.fang.ho.ca.role.entity.RoleEntity;

/**
 * 数据权限实体类.
 * @ClassName:DataRightEntity
 * @Description:
 * @author owen 于 2020年3月6日 上午10:10:08
 */

public class DataRightEntity extends CaBaseEntity implements Serializable {

	/**
	 * @Fields serialVersionUID : Description
	 */
	
	private static final long serialVersionUID = 5458472121222444067L;
	
	//数据权限ID
	private int datarightid;
	
	//属于哪个角色
	private RoleEntity role;

	/**
	 * @return datarightid
	 */
	public int getDatarightid() {
		return datarightid;
	}

	/**
	 * @param datarightid 要设置的 datarightid
	 */
	public void setDatarightid(int datarightid) {
		this.datarightid = datarightid;
	}

	/**
	 * @return role
	 */
	public RoleEntity getRole() {
		return role;
	}

	/**
	 * @param role 要设置的 role
	 */
	public void setRole(RoleEntity role) {
		this.role = role;
	}

}
