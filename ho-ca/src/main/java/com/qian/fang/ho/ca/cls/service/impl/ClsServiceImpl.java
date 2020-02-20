/**
 * @Title: ClsServiceImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月8日 下午10:14:39
 * @author owen
 */
 

package com.qian.fang.ho.ca.cls.service.impl;

import java.util.List;

import com.qian.fang.ho.ca.cls.bpo.IClsBPO;
import com.qian.fang.ho.ca.cls.entity.ClsEntity;
import com.qian.fang.ho.ca.cls.service.IClsService;

/**
 * @ClassName:ClsServiceImpl
 * @Description:
 * @author owen 于 2020年2月8日 下午10:14:39
 */

public class ClsServiceImpl implements IClsService {

	private IClsBPO clsBPO;

	/**
	 * @return clsBPO
	 */
	public IClsBPO getClsBPO() {
		return clsBPO;
	}

	/**
	 * @param clsBPO 要设置的 clsBPO
	 */
	public void setClsBPO(IClsBPO clsBPO) {
		this.clsBPO = clsBPO;
	}

	public ClsEntity findCls(int pk) {
		return clsBPO.findCls(pk);
	}

	public ClsEntity findCls(String uk) {
		return clsBPO.findCls(uk);
	}

	public List<ClsEntity> findAllClss() {
		return clsBPO.findAllClss();
	}

	public void addCls(ClsEntity cls) {
		clsBPO.addCls(cls);
	}

	public ClsEntity updateCls(ClsEntity cls) {
		return clsBPO.updateCls(cls);
	}

	public void deleteCls(ClsEntity cls) {
		clsBPO.deleteCls(cls);
	}
	
}
