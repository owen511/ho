/**
 * @Title: IFuncRightService.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年3月5日 下午3:26:00
 * @author owen
 */
 

package com.qian.fang.ho.ca.funcright.service;

import java.util.List;

import com.qian.fang.ho.ca.funcright.entity.FuncRightEntity;
import com.qian.fang.ho.ca.role.entity.RoleEntity;

/**
 * 功能权限服务接口.
 * @ClassName:IFuncRightService
 * @Description:
 * @author owen 于 2020年3月5日 下午3:26:00
 */

public interface IFuncRightService {

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
