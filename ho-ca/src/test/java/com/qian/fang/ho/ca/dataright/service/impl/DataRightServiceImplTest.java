package com.qian.fang.ho.ca.dataright.service.impl;

import java.util.List;

import org.junit.Test;

import com.qian.fang.ho.SpringTestLoadUtil;
import com.qian.fang.ho.ca.dataright.entity.DataRightEntity;
import com.qian.fang.ho.ca.dataright.service.IDataRightService;
import com.qian.fang.ho.ca.role.entity.RoleEntity;

public class DataRightServiceImplTest {
	
	private static IDataRightService dataRightService;
	
	static {
		dataRightService = SpringTestLoadUtil.getAppContext().getBean(DataRightServiceImpl.class);
	}

	@Test
	public void testFindById() {
		DataRightEntity entity = dataRightService.findById(1);
		System.out.println(entity.getUuid());
		//fail("Not yet implemented");
	}

	@Test
	public void testFindByRoleId() {
		List<DataRightEntity> entitys = dataRightService.findByRoleId(5);
		for(DataRightEntity entity :entitys) {
			System.out.println(entity.getCreatedate());
		}
		//fail("Not yet implemented");
	}

	//@Test
	public void testAddDataRight() {
		DataRightEntity entity = new DataRightEntity();
		RoleEntity role = new RoleEntity();
		role.setRoleid(5);
		entity.setRole(role);
		dataRightService.addDataRight(entity);
		//fail("Not yet implemented");
	}

//	@Test
//	public void testUpdateDataRight() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeleteDataRights() {
//		fail("Not yet implemented");
//	}

}
