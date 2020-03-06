/**
 * @Title: MenuServiceImplTest.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月9日 下午5:06:09
 * @author owen
 */
 

package com.qian.fang.ho.menu.service.impl;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qian.fang.ho.menu.entity.MenuEntity;
import com.qian.fang.ho.menu.service.IMenuService;

/**
 * @ClassName:MenuServiceImplTest
 * @Description:
 * @author owen 于 2020年2月9日 下午5:06:09
 */

public class MenuServiceImplTest {
	private static String conf = "classpath:applicationContext.xml";
	private static ApplicationContext context = null;
	private static IMenuService menuService;
	
	static {
		context = new ClassPathXmlApplicationContext(conf);
		menuService = context.getBean(MenuServiceImpl.class);
	}

	/**
	 * Test method for {@link com.qian.fang.ho.menu.service.impl.MenuServiceImpl#addMenu(com.qian.fang.ho.menu.entity.MenuEntity)}.
	 */
	@Test
	public void testAddMenu() {
		MenuEntity menu = new MenuEntity();
		menu.setCode("abc2");
		menu.setName("澳康达");
		menu.setUrl("/menu/");
		menu.setLevelno(1);
		menu.setIsleaf(1);
		menu.setSuperid(0);
		menuService.addMenu(menu);
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.menu.service.impl.MenuServiceImpl#findAllMenus()}.
	 */
	//@Test
	public void testFindAllMenus() {
		fail("Not yet implemented");
	}

}
