package com.qian.fang.ho.ca.funcright.service.impl;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import com.qian.fang.ho.SpringTestLoadUtil;
import com.qian.fang.ho.ca.funcright.entity.FuncRightEntity;
import com.qian.fang.ho.ca.funcright.service.IFuncRightService;
import com.qian.fang.ho.ca.role.entity.RoleEntity;

public class FuncRightServiceImplTest {
	
	private static IFuncRightService funcRightService;
	
	static {
		funcRightService = SpringTestLoadUtil.getAppContext().getBean(FuncRightServiceImpl.class);
	}

	//@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByRoleId() {
		List<FuncRightEntity> funcs = funcRightService.findByRoleId(5);
		for (FuncRightEntity funcRightEntity : funcs) {
			System.out.println(funcRightEntity.getCreatedate());
		}
		//fail("Not yet implemented");
	}

	//@Test
	public void testFindByRoles() {
		fail("Not yet implemented");
	}
	
	//@Test
	public void testAddFunc() {
		FuncRightEntity funcRightEntity = new FuncRightEntity();
		RoleEntity role = new RoleEntity();
		role.setRoleid(5);
		funcRightEntity.setRole(role);
		funcRightService.addFuncRight(funcRightEntity);
		//fail("Not yet implemented");
	}

}
