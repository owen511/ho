/**
 * @Title: UserBPOImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年1月17日 下午2:59:30
 * @author owen
 */
 

package com.qian.fang.ho.ca.user.bpo.impl;

import java.util.List;

import com.qian.fang.ho.ca.user.bpo.IUserBPO;
import com.qian.fang.ho.ca.user.dao.IUserDAO;
import com.qian.fang.ho.ca.user.entity.UserEntity;

/**
 * @ClassName:UserBPOImpl
 * @Description:
 * @author owen 于 2020年1月17日 下午2:59:30
 */

public class UserBPOImpl implements IUserBPO {
	
	private IUserDAO userDAO;

	/**
	 * @return userDAO
	 */
	public IUserDAO getUserDAO() {
		return userDAO;
	}

	/**
	 * @param userDAO 要设置的 userDAO
	 */
	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	/**
	 *
	 * @param user
	 * @see com.qian.fang.ho.ca.user.bpo.IUserBPO#addUser(com.qian.fang.ho.ca.user.entity.UserEntity)
	 */
	public void addUser(UserEntity user) {
		this.userDAO.addUser(user);
	}

	/**
	 *
	 * @param users
	 * @see com.qian.fang.ho.ca.user.bpo.IUserBPO#addUsers(java.util.List)
	 */
	public void addUsers(List<UserEntity> users) {
		this.userDAO.addUsers(users);
	}

	/**
	 *
	 * @param users
	 * @return
	 * @see com.qian.fang.ho.ca.user.bpo.IUserBPO#deleteUsers(java.util.List)
	 */
	public List<UserEntity> deleteUsers(List<UserEntity> users) {
		return this.userDAO.deleteUsers(users);
	}

	/**
	 *
	 * @param users
	 * @return
	 * @see com.qian.fang.ho.ca.user.bpo.IUserBPO#updateUsers(java.util.List)
	 */
	public List<UserEntity> updateUsers(List<UserEntity> users) {
		return this.userDAO.deleteUsers(users);
	}

	/**
	 *
	 * @param user
	 * @return
	 * @see com.qian.fang.ho.ca.user.bpo.IUserBPO#updateUser(com.qian.fang.ho.ca.user.entity.UserEntity)
	 */
	public UserEntity updateUser(UserEntity user) {
		return this.userDAO.updateUser(user);
	}

	/**
	 *
	 * @return
	 * @see com.qian.fang.ho.ca.user.bpo.IUserBPO#findAllUsers()
	 */
	public List<UserEntity> findAllUsers() {
		return this.userDAO.findAllUsers();
	}

	/**
	 *
	 * @param user
	 * @param pkId
	 * @return
	 * @see com.qian.fang.ho.ca.user.bpo.IUserBPO#findUserById(com.qian.fang.ho.ca.user.entity.UserEntity, int)
	 */
	public UserEntity findUserById(UserEntity user, int pkId) {
		return this.userDAO.findUserById(user, pkId);
	}

	/**
	 *
	 * @param code
	 * @return
	 * @see com.qian.fang.ho.ca.user.bpo.IUserBPO#findUserByCode(java.lang.String)
	 */
	public UserEntity findUserByCode(String code) {
		return this.userDAO.findUserByCode(code);
	}

}
