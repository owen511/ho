/**
 * @Title: RoleDAOImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月21日 下午3:13:32
 * @author owen
 */
 

package com.qian.fang.ho.ca.role.dao.impl;

import java.util.List;

import com.qian.fang.ho.ca.CaBaseCommonHibernateDaoSupportImpl;
import com.qian.fang.ho.ca.cls.entity.ClsEntity;
import com.qian.fang.ho.ca.role.dao.IRoleDAO;
import com.qian.fang.ho.ca.role.entity.RoleEntity;
import com.qian.fang.ho.ca.user.entity.UserEntity;

/**
 * 角色数据操作实现类.
 * @ClassName:RoleDAOImpl
 * @Description:
 * @author owen 于 2020年2月21日 下午3:13:32
 */

public class RoleDAOImpl extends CaBaseCommonHibernateDaoSupportImpl<RoleEntity> implements IRoleDAO {

	/**
	 *
	 * @param role
	 * @see com.qian.fang.ho.ca.role.dao.IRoleDAO#addRole(com.qian.fang.ho.ca.role.entity.RoleEntity)
	 */
	public void addRole(RoleEntity role) {
		this.save(role);
	}

	/**
	 *
	 * @param roles
	 * @see com.qian.fang.ho.ca.role.dao.IRoleDAO#addRoles(java.util.List)
	 */
	public void addRoles(List<RoleEntity> roles) {
		this.save(roles);
	}

	public void updateRole(RoleEntity role) {
		this.update(role);
		
	}

	public RoleEntity findRoleById(RoleEntity role, int id) {
		return this.findById(role, id);
	}

	public List<RoleEntity> findRolesByCls(ClsEntity cls) {
		String hql = "from RoleEntity where clsid=?0";
		Object[] values = new Object[] { cls.getClsid() };
		return this.find(hql, values);
	}

	public List<RoleEntity> findRolesByClss(List<ClsEntity> clss) {
		String hql = "from RoleEntity where clsid=?0";
		StringBuffer whereSql = new StringBuffer();
		Object[] values = new Object[clss.size()];
		int idx = 0;
		for (ClsEntity clsEntity : clss) {
			whereSql.append("clsid=?").append(idx).append(" or ");
			values[idx]= clsEntity.getClsid();
			idx++;
		}
		return this.find(hql, values);
	}

	public List<RoleEntity> findRolesByUser(UserEntity user) {
		return null;
	}

	public List<RoleEntity> findAllRoles() {
		// TODO Auto-generated method stub
		return null;
	}

}
