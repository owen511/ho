/**
 * @Title: FuncRightDAOImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月20日 下午1:51:00
 * @author owen
 */
 

package com.qian.fang.ho.ca.funcright.dao.impl;

import java.util.List;

import com.qian.fang.ho.ca.CaBaseCommonHibernateDaoSupportImpl;
import com.qian.fang.ho.ca.funcright.dao.IFuncRightDAO;
import com.qian.fang.ho.ca.funcright.entity.FuncRightEntity;
import com.qian.fang.ho.ca.role.entity.RoleEntity;

/**
 * @ClassName:FuncRightDAOImpl
 * @Description:
 * @author owen 于 2020年2月20日 下午1:51:00
 */

public class FuncRightDAOImpl extends CaBaseCommonHibernateDaoSupportImpl<FuncRightEntity> implements IFuncRightDAO {

	public FuncRightEntity findById(int id) {
		FuncRightEntity t = new FuncRightEntity();
		return super.findById(t, id);
	}

	public List<FuncRightEntity> findByRoleId(int roleId) {
		return null;
	}

	public List<FuncRightEntity> findByRoles(List<RoleEntity> roles) {
		return null;
	}

}
