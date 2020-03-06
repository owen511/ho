/**
 * @Title: FuncRightServiceImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年3月5日 下午3:26:29
 * @author owen
 */
 

package com.qian.fang.ho.ca.funcright.service.impl;

import java.util.List;

import com.qian.fang.ho.ca.funcright.bpo.IFuncRightBPO;
import com.qian.fang.ho.ca.funcright.entity.FuncRightEntity;
import com.qian.fang.ho.ca.funcright.service.IFuncRightService;
import com.qian.fang.ho.ca.role.entity.RoleEntity;

/**
 * 功能权限服务类.
 * @ClassName:FuncRightServiceImpl
 * @Description:
 * @author owen 于 2020年3月5日 下午3:26:29
 */

public class FuncRightServiceImpl implements IFuncRightService{
	
	/**
	 * 数据权限业务处理接口.
	 */
	private IFuncRightBPO funcRightBPO;

	/**
	 * @return funcRightBPO
	 */
	public IFuncRightBPO getFuncRightBPO() {
		return funcRightBPO;
	}

	/**
	 * @param funcRightBPO 要设置的 funcRightBPO
	 */
	public void setFuncRightBPO(IFuncRightBPO funcRightBPO) {
		this.funcRightBPO = funcRightBPO;
	}

	public FuncRightEntity findById(int id) {
		return funcRightBPO.findById(id);
	}

	public List<FuncRightEntity> findByRoleId(int roleId) {
		return funcRightBPO.findByRoleId(roleId);
	}

	public List<FuncRightEntity> findByRoles(List<RoleEntity> roles) {
		return funcRightBPO.findByRoles(roles);
	}

	public void addFuncRight(FuncRightEntity func) {
		funcRightBPO.addFuncRight(func);
	}

	public void addFuncRights(List<FuncRightEntity> funcs) {
		funcRightBPO.addFuncRights(funcs);
	}

	public void updateFuncRight(FuncRightEntity func) {
		funcRightBPO.updateFuncRight(func);
	}

	public void deleteFuncRights(List<FuncRightEntity> funcs) {
		funcRightBPO.deleteFuncRights(funcs);
	}

}
