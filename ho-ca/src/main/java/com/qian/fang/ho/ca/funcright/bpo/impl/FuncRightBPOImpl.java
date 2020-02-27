/**
 * @Title: FuncRightBPOImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月20日 下午1:57:06
 * @author owen
 */
 

package com.qian.fang.ho.ca.funcright.bpo.impl;

import com.qian.fang.ho.ca.funcright.bpo.IFuncRightBPO;
import com.qian.fang.ho.ca.funcright.dao.IFuncRightDAO;
import com.qian.fang.ho.ca.funcright.entity.FuncRightEntity;

/**
 * @ClassName:FuncRightBPOImpl
 * @Description:
 * @author owen 于 2020年2月20日 下午1:57:06
 */

public class FuncRightBPOImpl implements IFuncRightBPO {
	
	/**
	 * 功能权限访问接口.
	 */
	private IFuncRightDAO funcRightDAO;

	/**
	 * @return funcRightDAO
	 */
	public IFuncRightDAO getFuncRightDAO() {
		return funcRightDAO;
	}

	/**
	 * @param funcRightDAO 要设置的 funcRightDAO
	 */
	public void setFuncRightDAO(IFuncRightDAO funcRightDAO) {
		this.funcRightDAO = funcRightDAO;
	}

	public FuncRightEntity findById(int id) {
		return funcRightDAO.findById(id);
	}
	

}
