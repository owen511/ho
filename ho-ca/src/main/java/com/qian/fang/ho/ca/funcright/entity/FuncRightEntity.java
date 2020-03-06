/**
 * @Title: FuncRightEntity.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月19日 下午4:41:22
 * @author owen
 */
 

package com.qian.fang.ho.ca.funcright.entity;

import java.io.Serializable;

import com.qian.fang.ho.ca.CaBaseEntity;
import com.qian.fang.ho.ca.role.entity.RoleEntity;

/**
 * 功能权限实体类 .
 * @ClassName:FuncRightEntity
 * @Description:
 * @author owen 于 2020年2月19日 下午4:41:22
 */

public class FuncRightEntity extends CaBaseEntity implements Serializable{

	/**
	 * @Fields serialVersionUID : Description
	 */
	
	private static final long serialVersionUID = 5507544888797263370L;
	
	// 功能权限流水号ID
	private int funcrightid;

	//归属哪个角色
	private RoleEntity role;

	/**
	 * @return funcrightid
	 */
	public int getFuncrightid() {
		return funcrightid;
	}

	/**
	 * @param funcrightid 要设置的 funcrightid
	 */
	public void setFuncrightid(int funcrightid) {
		this.funcrightid = funcrightid;
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
