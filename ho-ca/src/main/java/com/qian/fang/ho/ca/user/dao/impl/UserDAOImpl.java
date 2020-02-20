/**
 * @Title: UserDAOImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年1月17日 下午2:12:28
 * @author owen
 */
 

package com.qian.fang.ho.ca.user.dao.impl;

import java.util.List;

import com.qian.fang.ho.ca.CaBaseCommonHibernateDaoSupportImpl;
import com.qian.fang.ho.ca.user.dao.IUserDAO;
import com.qian.fang.ho.ca.user.entity.UserEntity;

/**
 * 用户数据访问实现类.
 * @ClassName: UserDAOImpl
 * @Description:
 * @author owen 于 2020年1月17日 下午2:12:28
 */

public class UserDAOImpl extends CaBaseCommonHibernateDaoSupportImpl<UserEntity> implements IUserDAO {

	public void addUser(UserEntity user) {
		this.save(user);
	}

	public void addUsers(List<UserEntity> users) {
		this.save(users);
	}

	public List<UserEntity> deleteUsers(List<UserEntity> users) {
		return this.delete(users);
	}

	public List<UserEntity> updateUsers(List<UserEntity> users) {
		return this.update(users);
	}

	public UserEntity updateUser(UserEntity user) {
		return this.update(user);
	}

	public List<UserEntity> findAllUsers() {
		return this.findAll("from UserEntity");
	}

	public UserEntity findUserById(UserEntity user, int pkId) {
		return this.findById(user, pkId);
	}

	public UserEntity findUserByCode(String code) {
		UserEntity entity = new UserEntity();
		return this.find(entity, "code", code);
	}

}
