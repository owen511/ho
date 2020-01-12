package com.qian.fang.ho.dic;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qian.fang.ho.dic.column.entity.DicColumnEntity;
import com.qian.fang.ho.dic.column.service.IDicColumnService;
import com.qian.fang.ho.dic.column.service.impl.DicColumnServiceImpl;
import com.qian.fang.ho.dic.table.entity.DicTableEntity;
import com.qian.fang.ho.dic.table.service.IDicTableService;
import com.qian.fang.ho.dic.table.service.impl.DicTableServiceImpl;
import com.qian.fang.ho.dic.util.TableTypeEnum;

import junit.framework.TestCase;

public class DicTableOrColumnServiceImplTest extends TestCase {

	private static String conf = "classpath:applicationContext.xml";
	private static ApplicationContext context = null;
	private static IDicTableService tableService = null;
	private static IDicColumnService columnService = null;
	static {
		context = new ClassPathXmlApplicationContext(conf);
		tableService = context.getBean(DicTableServiceImpl.class);
		columnService = context.getBean(DicColumnServiceImpl.class);
	}

	/**
	 * 新增表.
	 */
//	public void testAddDicTable() {
//		DicTableEntity dicTableEntity = new DicTableEntity();
//		dicTableEntity.setTablecode("aaa5");
//		dicTableEntity.setGovid("122");
//		dicTableEntity.setGovyear(2019);
//		dicTableEntity.setRemark("a1");
//		dicTableEntity.setTabletype(TableTypeEnum.LOGICAL_TABLE.getType());
//		tableService.addDicTable(dicTableEntity);
//		
//		DicColumnEntity dicColumnEntity = new DicColumnEntity();
//		dicColumnEntity.setTableEntity(dicTableEntity);
//		dicColumnEntity.setColumncode("lsakd5");
//		dicColumnEntity.setGovid(dicTableEntity.getGovid());
//		dicColumnEntity.setGovyear(dicTableEntity.getGovyear());
//		columnService.addDicColumn(dicColumnEntity);
//	}


//	public void testUpdateDicTable() {
//
//	}

//	public void testFindDicTable() {
//		List<DicTableEntity> list=tableService.findAllTables();
//		for (DicTableEntity dicTableEntity : list) {
//			System.out.println(dicTableEntity.getTablecode());
//		}
//	}
	
	public void testFindDicTableBycode() {
		DicTableEntity entity =tableService.findTableByCode("aaa4");
		System.out.println(entity.getUuid()+"==uuid");
	}

//	public void testDeleteDicTable() {
//
//	}

}
