/**
 * @Title: DicTableServiceImplTest.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年1月20日 上午10:51:08
 * @author owen
 */
 

package com.qian.fang.ho.dic.table.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qian.fang.ho.dic.constant.TableTypeEnum;
import com.qian.fang.ho.dic.table.entity.DicTableEntity;
import com.qian.fang.ho.dic.table.service.IDicTableService;

import junit.framework.Assert;

/**
 * 表注册测试类.
 * @ClassName:DicTableServiceImplTest
 * @Description:
 * @author owen 于 2020年1月20日 上午10:51:08
 */

public class DicTableServiceImplTest {
	private static String conf = "classpath:applicationContext.xml";
	private static ApplicationContext context = null;
	private static IDicTableService tableService = null;
	static {
		context = new ClassPathXmlApplicationContext(conf);
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
	 * Test method for {@link com.qian.fang.ho.dic.table.service.impl.DicTableServiceImpl#addTable(com.qian.fang.ho.dic.table.entity.DicTableEntity)}.
	 */
	//@Test
	public void testAddTable() {
		DicTableEntity dicTableEntity = new DicTableEntity();
		dicTableEntity.setTablecode("BBBB");
		dicTableEntity.setName("liuliu2");
		dicTableEntity.setGovid("122");
		dicTableEntity.setRemark("a1");
		dicTableEntity.setTabletype(TableTypeEnum.PHYSICAL.getValue());
		tableService.addTable(dicTableEntity);
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.table.service.impl.DicTableServiceImpl#addTables(java.util.List)}.
	 */
	@Test
	public void testAddTables() {
		List<DicTableEntity> dicTables = new ArrayList<DicTableEntity>();
		DicTableEntity dicTableEntity = new DicTableEntity();
		dicTableEntity.setTablecode("CCCC");
		dicTableEntity.setName("lisi1");
		dicTableEntity.setGovid("122");
		dicTableEntity.setRemark("a1");
		dicTableEntity.setTabletype(TableTypeEnum.PHYSICAL.getValue());
		dicTables.add(dicTableEntity);
		DicTableEntity dicTableEntity2 = new DicTableEntity();
		dicTableEntity2.setTablecode("GGGG");
		dicTableEntity2.setName("wangwu1");
		dicTableEntity2.setGovid("122");
		dicTableEntity2.setRemark("a1");
		dicTableEntity2.setTabletype(TableTypeEnum.PHYSICAL.getValue());
		dicTables.add(dicTableEntity2);
		tableService.addTables(dicTables);
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.table.service.impl.DicTableServiceImpl#deleteTables(java.util.List)}.
	 */
	@Test
	public void testDeleteTables() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.table.service.impl.DicTableServiceImpl#updateTables(java.util.List)}.
	 */
	@Test
	public void testUpdateTables() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.table.service.impl.DicTableServiceImpl#updateTable(com.qian.fang.ho.dic.table.entity.DicTableEntity)}.
	 */
	@Test
	public void testUpdateTable() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.table.service.impl.DicTableServiceImpl#findAllTables()}.
	 */
	//@Test
	public void testFindAllTables() {
		List<DicTableEntity> result = tableService.findAllTables();
		for (DicTableEntity dicTableEntity : result) {
			System.out.println(dicTableEntity.toString());
		}
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.table.service.impl.DicTableServiceImpl#findTableByCode(java.lang.String)}.
	 */
	//@Test
	public void testFindTableByCode() {
		DicTableEntity table = tableService.findTableByCode("AAAA");
		Assert.assertNotNull(table);
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.table.service.impl.DicTableServiceImpl#findTableById(com.qian.fang.ho.dic.table.entity.DicTableEntity, int)}.
	 */
	//@Test
	public void testFindTableById() {
		DicTableEntity entity = new DicTableEntity();
		entity =tableService.findTableById(entity, 41);
		//System.out.println(entity.toString());
		//fail("Not yet implemented");
	}

}
