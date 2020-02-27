/**
 * @Title: RoleBPOImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月21日 下午3:07:35
 * @author owen
 */
 

package com.qian.fang.ho.ca.role.bpo.impl;

import java.util.List;

import com.qian.fang.ho.ca.cls.entity.ClsEntity;
import com.qian.fang.ho.ca.role.bpo.IRoleBPO;
import com.qian.fang.ho.ca.role.dao.IRoleDAO;
import com.qian.fang.ho.ca.role.entity.RoleEntity;
import com.qian.fang.ho.ca.user.entity.UserEntity;

/**
 * 角色业务处理实现类.
 * @ClassName:RoleBPOImpl
 * @Description:
 * @author owen 于 2020年2月21日 下午3:07:35
 */

public class RoleBPOImpl implements IRoleBPO {
	
	//角色数据操作接口.
	private IRoleDAO roleDAO;
	
	/**
	 * @return roleDAO
	 */
	public IRoleDAO getRoleDAO() {
		return roleDAO;
	}

	/**
	 * @param roleDAO 要设置的 roleDAO
	 */
	public void setRoleDAO(IRoleDAO roleDAO) {
		this.roleDAO = roleDAO;
	}

	public void addRole(RoleEntity role) {
		roleDAO.addRole(role);
	}

	public void addRoles(List<RoleEntity> roles) {
		roleDAO.addRoles(roles);
	}

	public void updateRole(RoleEntity role) {
		roleDAO.updateRole(role);
	}

	public RoleEntity findRoleById(RoleEntity role, int id) {
		return roleDAO.findRoleById(role, id);
	}

	public List<RoleEntity> findRolesByCls(ClsEntity cls) {
		return roleDAO.findRolesByCls(cls);
	}

	public List<RoleEntity> findRolesByClss(List<ClsEntity> clss) {
		return roleDAO.findRolesByClss(clss);
	}

	public List<RoleEntity> findRolesByUser(UserEntity user) {
		return roleDAO.findRolesByUser(user);
	}

	public List<RoleEntity> findAllRoles() {
		return roleDAO.findAllRoles();
	}

}
