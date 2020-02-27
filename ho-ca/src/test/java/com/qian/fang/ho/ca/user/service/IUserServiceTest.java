/**
 * @Title: IUserServiceTest.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月7日 下午4:16:46
 * @author owen
 */
 

package com.qian.fang.ho.ca.user.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qian.fang.ho.ca.cls.service.IClsService;
import com.qian.fang.ho.ca.cls.service.impl.ClsServiceImpl;
import com.qian.fang.ho.ca.constant.UserStateEnum;
import com.qian.fang.ho.ca.constant.UserTypeEnum;
import com.qian.fang.ho.ca.user.entity.UserEntity;
import com.qian.fang.ho.ca.user.service.impl.UserServiceImpl;
import com.qian.fang.ho.common.uitl.DateFormatUtil;

/**
 * @ClassName:IUserServiceTest
 * @Description:
 * @author owen 于 2020年2月7日 下午4:16:46
 */

public class IUserServiceTest {
	
	private static String conf = "classpath:applicationContext.xml";
	private static ApplicationContext context = null;
	private static IUserService userService;
	private static IClsService clsService;
	static {
		context = new ClassPathXmlApplicationContext(conf);
		userService = context.getBean(UserServiceImpl.class);
		clsService = context.getBean(ClsServiceImpl.class);
	}

	/**
	 * Test method for {@link com.qian.fang.ho.ca.user.service.IUserService#addUser(com.qian.fang.ho.ca.user.entity.UserEntity)}.
	 */
	//@Test
	public void testAddUser() {
		UserEntity user = new UserEntity();
		user.setCode("admin");
		user.setName("超级管理员");
		user.setType(UserTypeEnum.ADMIN.getValue());
		user.setState(UserStateEnum.ENABLED.getValue());
		userService.addUser(user);
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.ca.user.service.IUserService#addUsers(java.util.List)}.
	 */
	@Test
	public void testAddUsers() {
		List<UserEntity> users = new ArrayList<UserEntity>();
		UserEntity user = new UserEntity();
		user.setCode("wangwu");
		user.setName("王五");
		user.setType(UserTypeEnum.COMMON.getValue());
		user.setState(UserStateEnum.ENABLED.getValue());
		user.setCls(clsService.findCls(24));
		users.add(user);
//		UserEntity user2 = new UserEntity();
//		user2.setCode("lisi");
//		user2.setName("系统管理员");
//		user2.setType(UserTypeEnum.ADMIN.getValue());
//		user2.setState(UserStateEnum.ENABLED.getValue());
//		users.add(user2);
		userService.addUsers(users);
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.ca.user.service.IUserService#deleteUsers(java.util.List)}.
	 */
	//@Test
	public void testDeleteUsers() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.ca.user.service.IUserService#updateUsers(java.util.List)}.
	 */
	//@Test
	public void testUpdateUsers() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.ca.user.service.IUserService#updateUser(com.qian.fang.ho.ca.user.entity.UserEntity)}.
	 */
	//@Test
	public void testUpdateUser() {
		UserEntity user = new UserEntity();
		//user.setUserid(152);
		user=userService.findUserById(user, 152);
		user.setCreatedate(DateFormatUtil.getCurrentDate());
		userService.updateUser(user);
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.ca.user.service.IUserService#findAllUsers()}.
	 */
	//@Test
	public void testFindAllUsers() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.ca.user.service.IUserService#findUserById(com.qian.fang.ho.ca.user.entity.UserEntity, int)}.
	 */
	//@Test
	public void testFindUserById() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.ca.user.service.IUserService#findUserByCode(java.lang.String)}.
	 */
	//@Test
	public void testFindUserByCode() {
		//fail("Not yet implemented");
	}

}
