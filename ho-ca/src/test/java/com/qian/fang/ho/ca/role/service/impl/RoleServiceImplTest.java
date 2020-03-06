package com.qian.fang.ho.ca.role.service.impl;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.qian.fang.ho.SpringTestLoadUtil;
import com.qian.fang.ho.ca.cls.entity.ClsEntity;
import com.qian.fang.ho.ca.role.entity.RoleEntity;
import com.qian.fang.ho.ca.role.service.IRoleService;

public class RoleServiceImplTest {
	private static IRoleService roleService=SpringTestLoadUtil.getAppContext().getBean(RoleServiceImpl.class);
	@Test
	public void testAddRole() {
		RoleEntity role = new RoleEntity();
		role.setCode("01");
		role.setName("单位");
		role.setState(1);
		ClsEntity cls = new ClsEntity();
		cls.setClsid(21);
		role.setCls(cls);
		roleService.addRole(role);
		//fail("Not yet implemented");
	}

	@Test
	public void testAddRoles() {
		//fail("Not yet implemented");
	}

	@Test
	public void testUpdateRole() {
		//fail("Not yet implemented");
	}

	@Test
	public void testFindRoleById() {
		//fail("Not yet implemented");
	}

	@Test
	public void testFindRolesByCls() {
		//fail("Not yet implemented");
	}

	@Test
	public void testFindRolesByClss() {
		//fail("Not yet implemented");
	}

	@Test
	public void testFindRolesByUser() {
		//fail("Not yet implemented");
	}

	@Test
	public void testFindAllRoles() {
		//fail("Not yet implemented");
	}

}
