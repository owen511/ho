/**
 * @Title: FuncRightSubEntity.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月19日 下午5:08:40
 * @author owen
 */
 

package com.qian.fang.ho.ca.funcright.entity;

import java.io.Serializable;

import com.qian.fang.ho.ca.CaBaseEntity;

/**
 * 功能权限实体类
 * @ClassName:FuncRightSubEntity
 * @Description:
 * @author owen 于 2020年2月19日 下午5:08:40
 */

public class FuncRightSubEntity extends CaBaseEntity implements Serializable{

	/**
	 * @Fields serialVersionUID : Description
	 */
	
	private static final long serialVersionUID = 8518278337861827164L;
	
	//功能权限子表流水号PK
	private int funcrightsubid;
	
	private FuncRightEntity func;

	/**
	 * @return funcrightsubid
	 */
	public int getFuncrightsubid() {
		return funcrightsubid;
	}

	/**
	 * @param funcrightsubid 要设置的 funcrightsubid
	 */
	public void setFuncrightsubid(int funcrightsubid) {
		this.funcrightsubid = funcrightsubid;
	}

	/**
	 * @return func
	 */
	public FuncRightEntity getFunc() {
		return func;
	}

	/**
	 * @param func 要设置的 func
	 */
	public void setFunc(FuncRightEntity func) {
		this.func = func;
	}
	

}
