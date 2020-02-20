/**
 * @Title: ClsEntity.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月8日 下午9:51:09
 * @author owen
 */
 

package com.qian.fang.ho.ca.cls.entity;

import java.io.Serializable;

import com.qian.fang.ho.ca.CaBaseEntity;

/**
 * 类别实体.
 * @ClassName:ClsEntity
 * @Description:
 * @author owen 于 2020年2月8日 下午9:51:09
 */

public class ClsEntity extends CaBaseEntity implements Serializable{

	/**
	 * @Fields serialVersionUID : Description
	 */
	
	private static final long serialVersionUID = -900807117947828529L;
	
	//类别id
	private int clsid;
	
	//类别类型 0-角色组 1-数据权限组 2-功能权限
	private int type;
	
	//上级类别ID
	private int superid;
	
	//系统模块ID
	private int appid;

	/**
	 * @return clsid
	 */
	public int getClsid() {
		return clsid;
	}

	/**
	 * @param clsid 要设置的 clsid
	 */
	public void setClsid(int clsid) {
		this.clsid = clsid;
	}

	/**
	 * @return type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type 要设置的 type
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return superid
	 */
	public int getSuperid() {
		return superid;
	}

	/**
	 * @param superid 要设置的 superid
	 */
	public void setSuperid(int superid) {
		this.superid = superid;
	}

	/**
	 * @return appid
	 */
	public int getAppid() {
		return appid;
	}

	/**
	 * @param appid 要设置的 appid
	 */
	public void setAppid(int appid) {
		this.appid = appid;
	}

}
