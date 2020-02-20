/**
 * @Title: ClsBPOImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月8日 下午10:13:28
 * @author owen
 */
 

package com.qian.fang.ho.ca.cls.bpo.impl;

import java.util.List;

import com.qian.fang.ho.ca.cls.bpo.IClsBPO;
import com.qian.fang.ho.ca.cls.dao.IClsDAO;
import com.qian.fang.ho.ca.cls.entity.ClsEntity;

/**
 * @ClassName:ClsBPOImpl
 * @Description:
 * @author owen 于 2020年2月8日 下午10:13:28
 */

public class ClsBPOImpl implements IClsBPO {

	private IClsDAO clsDAO;

	/**
	 * @return clsDAO
	 */
	public IClsDAO getClsDAO() {
		return clsDAO;
	}

	/**
	 * @param clsDAO 要设置的 clsDAO
	 */
	public void setClsDAO(IClsDAO clsDAO) {
		this.clsDAO = clsDAO;
	}

	public ClsEntity findCls(int pk) {
		return clsDAO.findCls(pk);
	}

	public ClsEntity findCls(String uk) {
		return clsDAO.findCls(uk);
	}

	public List<ClsEntity> findAllClss() {
		return clsDAO.findAllClss();
	}

	public void addCls(ClsEntity cls) {
		clsDAO.addCls(cls);
	}

	public ClsEntity updateCls(ClsEntity cls) {
		return clsDAO.updateCls(cls);
	}

	public void deleteCls(ClsEntity cls) {
		clsDAO.deleteCls(cls);
	}

	public boolean isExistsRoleByCls(ClsEntity cls) {
		return false;
	}
	
	
}
