/**
 * @Title: IUserService.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年1月17日 下午3:02:48
 * @author owen
 */
 

package com.qian.fang.ho.ca.user.service;

import java.util.List;

import com.qian.fang.ho.ca.user.entity.UserEntity;

/**
 * @ClassName:IUserService
 * @Description:
 * @author owen 于 2020年1月17日 下午3:02:48
 */

public interface IUserService {

	/**
	 * 新增.
	 * @param user
	 */
	void addUser(UserEntity user);
	
	/**
	 * 新增.
	 * @param users
	 */
	void addUsers(List<UserEntity> users);
	
	/**
	 * 删除.
	 * @param users
	 * @return List<UserEntity>
	 */
	List<UserEntity> deleteUsers(List<UserEntity> users);
	
	/**
	 * 修改.
	 * @param users
	 * @return List<UserEntity>
	 */
	List<UserEntity> updateUsers(List<UserEntity> users);
	
	/**
	 * 修改.
	 * @param user
	 * @return UserEntity
	 */
	UserEntity updateUser(UserEntity user);
	
	/**
	 * 查找.
	 * @return List<UserEntity>
	 */
	List<UserEntity> findAllUsers();
	
	/**
	 * 根据pkId查找
	 * @param user
	 * @param pkId
	 * @return UserEntity
	 */
	UserEntity findUserById(UserEntity user,int pkId);

	/**
	 * 根据编码查找.
	 * @param code 用户编码
	 * @return UserEntity
	 */
	UserEntity findUserByCode(String code);
}
