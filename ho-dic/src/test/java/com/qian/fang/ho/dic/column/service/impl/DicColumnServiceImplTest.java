/**
 * @Title: DicColumnServiceImplTest.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年1月20日 下午2:09:21
 * @author owen
 */
 

package com.qian.fang.ho.dic.column.service.impl;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qian.fang.ho.dic.column.entity.DicColumnEntity;
import com.qian.fang.ho.dic.column.service.IDicColumnService;
import com.qian.fang.ho.dic.table.entity.DicTableEntity;

/**
 * @ClassName:DicColumnServiceImplTest
 * @Description:
 * @author owen 于 2020年1月20日 下午2:09:21
 */

public class DicColumnServiceImplTest {
	
	private static String conf = "classpath:applicationContext.xml";
	private static ApplicationContext context = null;
	private static IDicColumnService columnService = null;
	static {
		context = new ClassPathXmlApplicationContext(conf);
		columnService = context.getBean(DicColumnServiceImpl.class);
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
	 * Test method for {@link com.qian.fang.ho.dic.column.service.impl.DicColumnServiceImpl#addColumn(com.qian.fang.ho.dic.column.entity.DicColumnEntity)}.
	 */
	//@Test
	public void testAddColumn() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.column.service.impl.DicColumnServiceImpl#addColumns(java.util.List)}.
	 */
	@Test
	public void testAddColumns() {
		DicColumnEntity dicColumn = new DicColumnEntity();
		dicColumn.setColumncode("A1");
		dicColumn.setName("绿色");
	 	DicTableEntity tableEntity = new DicTableEntity();
	 	tableEntity.setTableid(1);
		dicColumn.setTableEntity(tableEntity);
		columnService.addColumn(dicColumn);
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.column.service.impl.DicColumnServiceImpl#deleteColumns(java.util.List)}.
	 */
	//@Test
	public void testDeleteColumns() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.column.service.impl.DicColumnServiceImpl#updateColumns(java.util.List)}.
	 */
	//@Test
	public void testUpdateColumns() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.column.service.impl.DicColumnServiceImpl#updateColumn(com.qian.fang.ho.dic.column.entity.DicColumnEntity)}.
	 */
	//@Test
	public void testUpdateColumn() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.column.service.impl.DicColumnServiceImpl#findAllColumns()}.
	 */
	//@Test
	public void testFindAllColumns() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.column.service.impl.DicColumnServiceImpl#findColumnByCode(java.lang.String)}.
	 */
	//@Test
	public void testFindColumnByCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.qian.fang.ho.dic.column.service.impl.DicColumnServiceImpl#findColumnById(com.qian.fang.ho.dic.column.entity.DicColumnEntity, int)}.
	 */
	//@Test
	public void testFindColumnById() {
		fail("Not yet implemented");
	}
	//@Test
	public void testFindColumnsByTableFK() {
		DicTableEntity table = new DicTableEntity();
		table.setTableid(41);
	 	columnService.findColumnsByTableFK(table);
//	 	for (DicColumnEntity dicColumnEntity : result) {
//			System.out.println(dicColumnEntity.toString());
//		}
		//fail("Not yet implemented");
	}
}
