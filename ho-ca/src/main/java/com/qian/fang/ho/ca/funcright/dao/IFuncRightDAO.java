/**
 * @Title: IFuncRightDAO.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月20日 下午1:50:09
 * @author owen
 */
 

package com.qian.fang.ho.ca.funcright.dao;

import java.util.List;

import com.qian.fang.ho.ca.funcright.entity.FuncRightEntity;
import com.qian.fang.ho.ca.role.entity.RoleEntity;

/**
 * 功能权限访问接口.
 * @ClassName:IFuncRightDAO
 * @Description:
 * @author owen 于 2020年2月20日 下午1:50:09
 */

public interface IFuncRightDAO {

	FuncRightEntity findById(int id);
	
	List<FuncRightEntity> findByRoleId(int roleId);
	
	List<FuncRightEntity> findByRoles(List<RoleEntity> roles);
}
