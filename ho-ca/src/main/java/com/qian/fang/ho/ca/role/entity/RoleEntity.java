/**
 * @Title: RoleEntity.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月7日 下午8:21:28
 * @author owen
 */
 

package com.qian.fang.ho.ca.role.entity;

import java.io.Serializable;

import com.qian.fang.ho.ca.CaBaseEntity;
import com.qian.fang.ho.ca.cls.entity.ClsEntity;

/**
 * 角色实体类.
 * @ClassName:RoleEntity
 * @Description: 用户归属哪个角色，用户和角色是多对多关系
 * @author owen 于 2020年2月7日 下午8:21:28
 */

public class RoleEntity extends CaBaseEntity implements Serializable {

	/**
	 * @Fields serialVersionUID : Description
	 */
	
	private static final long serialVersionUID = 7003724186011696856L;
	
	//角色ID
	private int roleid;
	
	//状态
	private int state;
	
	//归属哪个类别. ClsTypeEnum.CLS_ROLE=0
	private ClsEntity cls;
	
	/**
	 * @return roleid
	 */
	public int getRoleid() {
		return roleid;
	}

	/**
	 * @param roleid 要设置的 roleid
	 */
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	/**
	 * @return state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state 要设置的 state
	 */
	public void setState(int state) {
		this.state = state;
	}

	/**
	 * @return cls
	 */
	public ClsEntity getCls() {
		return cls;
	}

	/**
	 * @param cls 要设置的 cls
	 */
	public void setCls(ClsEntity cls) {
		this.cls = cls;
	}
	
}
