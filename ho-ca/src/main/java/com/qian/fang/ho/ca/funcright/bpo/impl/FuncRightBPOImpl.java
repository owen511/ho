/**
 * @Title: FuncRightBPOImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月20日 下午1:57:06
 * @author owen
 */
 

package com.qian.fang.ho.ca.funcright.bpo.impl;

import java.util.List;

import com.qian.fang.ho.ca.funcright.bpo.IFuncRightBPO;
import com.qian.fang.ho.ca.funcright.dao.IFuncRightDAO;
import com.qian.fang.ho.ca.funcright.entity.FuncRightEntity;
import com.qian.fang.ho.ca.role.entity.RoleEntity;

/**
 * 功能权限业务处理类.
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

	public List<FuncRightEntity> findByRoleId(int roleId) {
		return funcRightDAO.findByRoleId(roleId);
	}

	public List<FuncRightEntity> findByRoles(List<RoleEntity> roles) {
		return funcRightDAO.findByRoles(roles);
	}

	public void addFuncRight(FuncRightEntity func) {
		funcRightDAO.addFuncRight(func);
	}

	public void addFuncRights(List<FuncRightEntity> funcs) {
		funcRightDAO.addFuncRights(funcs);
	}

	public void updateFuncRight(FuncRightEntity func) {
		funcRightDAO.updateFuncRight(func);
	}

	public void deleteFuncRights(List<FuncRightEntity> funcs) {
		funcRightDAO.deleteFuncRights(funcs);
	}
	

}
