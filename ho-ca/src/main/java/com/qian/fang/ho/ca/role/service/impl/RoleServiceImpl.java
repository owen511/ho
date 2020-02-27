/**
 * @Title: RoleServiceImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月21日 下午4:55:00
 * @author owen
 */
 

package com.qian.fang.ho.ca.role.service.impl;

import java.util.List;

import com.qian.fang.ho.ca.cls.entity.ClsEntity;
import com.qian.fang.ho.ca.role.bpo.IRoleBPO;
import com.qian.fang.ho.ca.role.entity.RoleEntity;
import com.qian.fang.ho.ca.role.service.IRoleService;
import com.qian.fang.ho.ca.user.entity.UserEntity;

/**
 * 角色业务服务实现类.
 * @ClassName:RoleServiceImpl
 * @Description:
 * @author owen 于 2020年2月21日 下午4:55:00
 */

public class RoleServiceImpl implements IRoleService {
	
	//角色业务处理接口.
	private IRoleBPO roleBPO;

	/**
	 *
	 * @param role
	 * @see com.qian.fang.ho.ca.role.service.IRoleService#addRole(com.qian.fang.ho.ca.role.entity.RoleEntity)
	 */
	public void addRole(RoleEntity role) {
		roleBPO.addRole(role);
	}

	/**
	 *
	 * @param roles
	 * @see com.qian.fang.ho.ca.role.service.IRoleService#addRoles(java.util.List)
	 */
	public void addRoles(List<RoleEntity> roles) {
		roleBPO.addRoles(roles);
	}

	/**
	 *
	 * @param role
	 * @see com.qian.fang.ho.ca.role.service.IRoleService#updateRole(com.qian.fang.ho.ca.role.entity.RoleEntity)
	 */
	public void updateRole(RoleEntity role) {
		roleBPO.updateRole(role);
	}

	/**
	 *
	 * @param role
	 * @param id
	 * @return
	 * @see com.qian.fang.ho.ca.role.service.IRoleService#findRoleById(com.qian.fang.ho.ca.role.entity.RoleEntity, int)
	 */
	public RoleEntity findRoleById(RoleEntity role, int id) {
		return roleBPO.findRoleById(role, id);
	}

	/**
	 *
	 * @param cls
	 * @return
	 * @see com.qian.fang.ho.ca.role.service.IRoleService#findRolesByCls(com.qian.fang.ho.ca.cls.entity.ClsEntity)
	 */
	public List<RoleEntity> findRolesByCls(ClsEntity cls) {
		return roleBPO.findRolesByCls(cls);
	}

	/**
	 *
	 * @param clss
	 * @return
	 * @see com.qian.fang.ho.ca.role.service.IRoleService#findRolesByClss(java.util.List)
	 */
	public List<RoleEntity> findRolesByClss(List<ClsEntity> clss) {
		return roleBPO.findRolesByClss(clss);
	}

	/**
	 *
	 * @param user
	 * @return
	 * @see com.qian.fang.ho.ca.role.service.IRoleService#findRolesByUser(com.qian.fang.ho.ca.user.entity.UserEntity)
	 */
	public List<RoleEntity> findRolesByUser(UserEntity user) {
		return roleBPO.findRolesByUser(user);
	}

	/**
	 *
	 * @return
	 * @see com.qian.fang.ho.ca.role.service.IRoleService#findAllRoles()
	 */
	public List<RoleEntity> findAllRoles() {
		return roleBPO.findAllRoles();
	}

}
