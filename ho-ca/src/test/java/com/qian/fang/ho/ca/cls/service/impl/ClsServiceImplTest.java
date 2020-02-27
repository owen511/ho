package com.qian.fang.ho.ca.cls.service.impl;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qian.fang.ho.ca.cls.entity.ClsEntity;
import com.qian.fang.ho.ca.cls.service.IClsService;
import com.qian.fang.ho.ca.constant.ClsTypeEnum;

public class ClsServiceImplTest {
	private static String conf = "classpath:applicationContext.xml";
	private static ApplicationContext context = null;
	private static IClsService clsService;
	static {
		context = new ClassPathXmlApplicationContext(conf);
		clsService = context.getBean(ClsServiceImpl.class);
	}
	//@Test
	public void testFindClsInt() {
		fail("Not yet implemented");
	}

	//@Test
	public void testFindClsString() {
		fail("Not yet implemented");
	}

	//@Test
	public void testFindAllClss() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddCls() {
		ClsEntity cls = new ClsEntity();
//		cls.setCode("00");
//		cls.setName("用户组");
//		cls.setType(ClsTypeEnum.CLS_USER.getValue());
//		cls.setRemark("用户的分类");
//		cls.setCode("01");
//		cls.setName("角色组");
//		cls.setType(ClsTypeEnum.CLS_ROLE.getValue());
//		cls.setRemark("角色的分类");
//		cls.setCode("02");
//		cls.setName("数据权限组");
//		cls.setType(ClsTypeEnum.CLS_DATA.getValue());
//		cls.setRemark("数据权限的分类");
//		cls.setCode("03");
//		cls.setName("功能权限组");
//		cls.setType(ClsTypeEnum.CLS_FUNC.getValue());
//		cls.setRemark("功能权限的分类");
		ClsEntity superCls=clsService.findCls(4);
		cls.setCode("0001");
		cls.setName("预算单位");
		cls.setType(superCls.getType());
		cls.setSuperid(superCls.getClsid());
		cls.setRemark("功能权限的分类");
		clsService.addCls(cls);
		//fail("Not yet implemented");
	}

	//@Test
	public void testUpdateCls() {
		fail("Not yet implemented");
	}

	//@Test
	public void testDeleteCls() {
		fail("Not yet implemented");
	}

}
