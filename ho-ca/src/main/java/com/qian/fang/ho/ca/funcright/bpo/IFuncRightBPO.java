/**
 * @Title: IFuncRightBPO.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月20日 下午1:56:34
 * @author owen
 */
 

package com.qian.fang.ho.ca.funcright.bpo;

import java.util.List;

import com.qian.fang.ho.ca.funcright.entity.FuncRightEntity;
import com.qian.fang.ho.ca.role.entity.RoleEntity;

/**
 * 功能权限业务处理接口.
 * @ClassName:IFuncRightBPO
 * @Description:
 * @author owen 于 2020年2月20日 下午1:56:34
 */

public interface IFuncRightBPO {

	/**
	 *  根据功能权限ID查找功能权限.
	 * @param id 功能权限ID
	 * @return FuncRightEntity
	 */
	FuncRightEntity findById(int id);
	
	/**
	 * 根据角色ID查找功能权限.
	 * @param roleId 角色ID
	 * @return List<FuncRightEntity>
	 */
	List<FuncRightEntity> findByRoleId(int roleId);
	
	/**
	 * 根据多个角色查找功能权限
	 * @param roles 角色集合
	 * @return List<FuncRightEntity>
	 */
	List<FuncRightEntity> findByRoles(List<RoleEntity> roles);
	
	/**
	 * 新增.
	 * @param func
	 */
	void addFuncRight(FuncRightEntity func);
	
	/**
	 * 批量新增.
	 * @param funcs
	 */
	void addFuncRights(List<FuncRightEntity> funcs);
	
	/**
	 * 修改.
	 * @param func
	 */
	void updateFuncRight(FuncRightEntity func);
	
	/**
	 * 批量删除.
	 * @param funcs
	 */
	void deleteFuncRights(List<FuncRightEntity> funcs);
}
