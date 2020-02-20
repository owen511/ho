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
import com.qian.fang.ho.ca.cls.entity.ClsEntity;

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
	
	// 功能权限ID
	private int funcright;
	
	//归属哪个类别. ClsTypeEnum.CLS_FUNC=2
	private ClsEntity cls;

	/**
	 * @return funcright
	 */
	public int getFuncright() {
		return funcright;
	}

	/**
	 * @param funcright 要设置的 funcright
	 */
	public void setFuncright(int funcright) {
		this.funcright = funcright;
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
