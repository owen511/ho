/**
 * @Title: DicElementServiceImplTest.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年1月20日 下午1:58:06
 * @author owen
 */
 

package com.qian.fang.ho.dic.element.service.impl;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qian.fang.ho.dic.element.entity.DicElementEntity;
import com.qian.fang.ho.dic.element.service.IDicElementService;
import com.qian.fang.ho.dic.table.entity.DicTableEntity;
import com.qian.fang.ho.dic.table.service.IDicTableService;
import com.qian.fang.ho.dic.table.service.impl.DicTableServiceImpl;

/**
 * @ClassName:DicElementServiceImplTest
 * @Description:
 * @author owen 于 2020年1月20日 下午1:58:06
 */

public class DicElementServiceImplTest {
	
	private static String conf = "classpath:applicationContext.xml";
	private static ApplicationContext context = null;
	private static IDicElementService elementService = null;
	private static IDicTableService tableService = null;
	static {
		context = new ClassPathXmlApplicationContext(conf);
		elementService = context.getBean(DicElementServiceImpl.class);
		tableService = context.getBean(DicTableServiceImpl.class);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.element.service.impl.DicElementServiceImpl#addElement(com.qian.fang.ho.dic.element.entity.DicElementEntity)}.
	 */
	@Test
	public void testAddElement() {
		DicElementEntity entity = new DicElementEntity();
		entity.setElementcode("DEF");
		entity.setName("路上看到1");
		entity.setDatalength(9);
		entity.setStatus(1);
		entity.setScale(0);
		DicTableEntity table = tableService.findTableByCode("AAAA");
		entity.setTableEntity(table);
		elementService.addElement(entity);
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.element.service.impl.DicElementServiceImpl#addElements(java.util.List)}.
	 */
	//@Test
	public void testAddElements() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.element.service.impl.DicElementServiceImpl#deleteElements(java.util.List)}.
	 */
	//@Test
	public void testDeleteElements() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.element.service.impl.DicElementServiceImpl#updateElements(java.util.List)}.
	 */
	//@Test
	public void testUpdateElements() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.element.service.impl.DicElementServiceImpl#updateElement(com.qian.fang.ho.dic.element.entity.DicElementEntity)}.
	 */
	//@Test
	public void testUpdateElement() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.element.service.impl.DicElementServiceImpl#findAllElements()}.
	 */
	//@Test
	public void testFindAllElements() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.element.service.impl.DicElementServiceImpl#findElementByCode(java.lang.String)}.
	 */
	//@Test
	public void testFindElementByCode() {
		DicElementEntity element= elementService.findElementByCode("ABC");
		System.out.println(element.toString());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.element.service.impl.DicElementServiceImpl#findElementById(com.qian.fang.ho.dic.element.entity.DicElementEntity, int)}.
	 */
	//@Test
	public void testFindElementById() {
		fail("Not yet implemented");
	}
	
	//@Test
	public void testFindElementsByTableFK() {
		DicTableEntity table = new DicTableEntity();
		table.setTableid(41);
		List<DicElementEntity> result=elementService.findElementsByTableFK(table);
		for (DicElementEntity dicElementEntity : result) {
			System.out.println(dicElementEntity.toString());
		}
	}

}
