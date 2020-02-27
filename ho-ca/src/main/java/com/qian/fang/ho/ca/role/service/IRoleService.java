/**
 * @Title: IRoleService.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月21日 下午4:54:00
 * @author owen
 */
 

package com.qian.fang.ho.ca.role.service;

import java.util.List;

import com.qian.fang.ho.ca.cls.entity.ClsEntity;
import com.qian.fang.ho.ca.role.entity.RoleEntity;
import com.qian.fang.ho.ca.user.entity.UserEntity;

/**
 * 角色业务服务接口.
 * @ClassName:IRoleService
 * @Description:
 * @author owen 于 2020年2月21日 下午4:54:00
 */

public interface IRoleService {

	/**
	 * 新增.
	 * @param role 角色
	 */
	void addRole(RoleEntity role);
	
	/**
	 * 批量新增.
	 * @param roles 角色集合
	 */
	void addRoles(List<RoleEntity> roles);
	
	/**
	 * 修改.
	 * @param role 角色
	 */
	void updateRole(RoleEntity role);
	
	/**
	 * 查找.
	 * @param role
	 * @param id 角色PK
	 * @return RoleEntity
	 */
	RoleEntity findRoleById(RoleEntity role,int id);
	
	/**
	 * 查找.
	 * @param cls 角色类别
	 * @return List<RoleEntity>
	 */
	List<RoleEntity> findRolesByCls(ClsEntity cls);
	
	/**
	 * 查找.
	 * @param clss 角色类别集合
	 * @return List<RoleEntity>
	 */
	List<RoleEntity> findRolesByClss(List<ClsEntity> clss);
	
	/**
	 * 查找用户角色.
	 * @param user 用户
	 * @return List<RoleEntity>
	 */
	List<RoleEntity> findRolesByUser(UserEntity user);
	
	/**
	 * 查找所有角色.
	 * @return List<RoleEntity>
	 */
	List<RoleEntity> findAllRoles();
}
