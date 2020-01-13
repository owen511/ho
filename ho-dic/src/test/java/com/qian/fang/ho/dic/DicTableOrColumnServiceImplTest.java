package com.qian.fang.ho.dic;

import java.util.ArrayList;
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
//		List<DicTableEntity> dicTables = new ArrayList<DicTableEntity>();
//		DicTableEntity dicTableEntity = new DicTableEntity();
//		dicTableEntity.setTablecode("AAAAAA");
//		dicTableEntity.setName("阿来得快");
//		dicTableEntity.setGovid("122");
//		dicTableEntity.setRemark("a1");
//		dicTableEntity.setTabletype(TableTypeEnum.LOGICAL_TABLE.getType());
//		
//		//tableService.addDicTable(dicTableEntity);
//		dicTables.add(dicTableEntity);
//		DicTableEntity dicTableEntity2 = new DicTableEntity();
//		dicTableEntity2.setTablecode("BBBB");
//		dicTableEntity2.setName("阿来得快");
//		dicTableEntity2.setGovid("122");
//		dicTableEntity2.setRemark("a1");
//		dicTableEntity2.setTabletype(TableTypeEnum.LOGICAL_TABLE.getType());
//		dicTables.add(dicTableEntity2);
//		tableService.addDicTables(dicTables);
//		
//		DicColumnEntity dicColumnEntity = new DicColumnEntity();
//		dicColumnEntity.setTableEntity(dicTableEntity);
//		dicColumnEntity.setColumncode("lsakd5");
//		dicColumnEntity.setGovid(dicTableEntity.getGovid());
//		//columnService.addDicColumn(dicColumnEntity);
//		
//		DicColumnEntity dicColumnEntity2 = new DicColumnEntity();
//		dicColumnEntity2.setTableEntity(dicTableEntity2);
//		dicColumnEntity2.setColumncode("lsakdt");
//		dicColumnEntity2.setGovid(dicTableEntity2.getGovid());
//		
//		List<DicColumnEntity> dicColumns = new ArrayList<DicColumnEntity>();
//		dicColumns.add(dicColumnEntity);
//		dicColumns.add(dicColumnEntity2);
//		columnService.addDicColumns(dicColumns);
//	}


//	public void testUpdateDicTable() {
//
//	}

//	public void testFindDicTable() {
//		List<DicTableEntity> list=tableService.findAllTables();
//		for (DicTableEntity dicTableEntity : list) {
//			System.out.println(dicTableEntity.getTablecode());
//		}
//
//	}
	
//	public void testFindDicTableBycode() {
//		DicTableEntity entity =tableService.findTableByCode("bbbbb");
//		System.out.println(entity.getUuid()+"==uuid");
//	}
	
//	public void testFindDicTableById() {
//		DicTableEntity entity = new DicTableEntity();
//		entity =tableService.findTableById(entity, 57);
//		System.out.println(entity.getUuid()+"==uuid");
//	}
	
//	public void testUpdateDicTable() {
//		List<DicTableEntity> dicTables = new ArrayList<DicTableEntity>();
//		dicTables = tableService.findAllTables();
//		int i=0;
//		for (DicTableEntity dicTableEntity : dicTables) {
//			System.out.println(dicTableEntity.getTablecode()+"-"+dicTableEntity.getName());
//			dicTableEntity.setName(dicTableEntity.getName()+i);
//			i++;
//			
//		}
//		dicTables=tableService.updateTables(dicTables);
//		for (DicTableEntity dicTableEntity : dicTables) {
//			System.out.println(dicTableEntity.getTablecode()+"-"+dicTableEntity.getName());
//			
//		}
//	}

	public void testDeleteDicTable() {
		List<DicTableEntity> dicTables = new ArrayList<DicTableEntity>();
		dicTables = tableService.findAllTables();
		int i=0;
		for (DicTableEntity dicTableEntity : dicTables) {
			System.out.println(dicTableEntity.getTablecode()+"-"+dicTableEntity.getName());
			dicTableEntity.setName(dicTableEntity.getName()+i);
			i++;
			
		}
		dicTables=tableService.deleteTables(dicTables);
		for (DicTableEntity dicTableEntity : dicTables) {
			System.out.println(dicTableEntity.getTablecode()+"-"+dicTableEntity.getName());
			
		}
	}

}
