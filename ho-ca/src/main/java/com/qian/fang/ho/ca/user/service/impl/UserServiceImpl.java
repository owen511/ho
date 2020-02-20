/**
 * @Title: UserServiceImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年1月17日 下午3:03:40
 * @author owen
 */

package com.qian.fang.ho.ca.user.service.impl;

import java.util.List;

import com.qian.fang.ho.ca.user.bpo.IUserBPO;
import com.qian.fang.ho.ca.user.entity.UserEntity;
import com.qian.fang.ho.ca.user.service.IUserService;

/**
 * @ClassName:UserServiceImpl
 * @Description:
 * @author owen 于 2020年1月17日 下午3:03:40
 */

public class UserServiceImpl implements IUserService {

	private IUserBPO userBPO;

	/**
	 * @return userBPO
	 */
	public IUserBPO getUserBPO() {
		return userBPO;
	}

	/**
	 * @param userBPO 要设置的 userBPO
	 */
	public void setUserBPO(IUserBPO userBPO) {
		this.userBPO = userBPO;
	}

	/**
	 *
	 * @param user
	 * @see com.qian.fang.ho.ca.user.service.IUserService#addUser(com.qian.fang.ho.ca.user.entity.UserEntity)
	 */
	public void addUser(UserEntity user) {
		this.userBPO.addUser(user);
	}

	/**
	 *
	 * @param users
	 * @see com.qian.fang.ho.ca.user.service.IUserService#addUsers(java.util.List)
	 */
	public void addUsers(List<UserEntity> users) {
		this.userBPO.addUsers(users);
	}

	/**
	 *
	 * @param users
	 * @return
	 * @see com.qian.fang.ho.ca.user.service.IUserService#deleteUsers(java.util.List)
	 */
	public List<UserEntity> deleteUsers(List<UserEntity> users) {
		return this.userBPO.deleteUsers(users);
	}

	/**
	 *
	 * @param users
	 * @return
	 * @see com.qian.fang.ho.ca.user.service.IUserService#updateUsers(java.util.List)
	 */
	public List<UserEntity> updateUsers(List<UserEntity> users) {
		return this.userBPO.updateUsers(users);
	}

	/**
	 *
	 * @param user
	 * @return
	 * @see com.qian.fang.ho.ca.user.service.IUserService#updateUser(com.qian.fang.ho.ca.user.entity.UserEntity)
	 */
	public UserEntity updateUser(UserEntity user) {
		return this.userBPO.updateUser(user);
	}

	/**
	 *
	 * @return
	 * @see com.qian.fang.ho.ca.user.service.IUserService#findAllUsers()
	 */
	public List<UserEntity> findAllUsers() {
		return this.userBPO.findAllUsers();
	}

	/**
	 *
	 * @param user
	 * @param pkId
	 * @return
	 * @see com.qian.fang.ho.ca.user.service.IUserService#findUserById(com.qian.fang.ho.ca.user.entity.UserEntity,
	 *      int)
	 */
	public UserEntity findUserById(UserEntity user, int pkId) {
		return this.userBPO.findUserById(user, pkId);
	}

	/**
	 *
	 * @param code
	 * @return
	 * @see com.qian.fang.ho.ca.user.service.IUserService#findUserByCode(java.lang.String)
	 */
	public UserEntity findUserByCode(String code) {
		return this.userBPO.findUserByCode(code);
	}

}
