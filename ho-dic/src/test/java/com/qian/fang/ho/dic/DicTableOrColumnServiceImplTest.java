package com.qian.fang.ho.dic;

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
	public void testAddDicTable() {
		DicTableEntity dicTableEntity = new DicTableEntity();
		dicTableEntity.setTablecode("aaa4");
		dicTableEntity.setGovid("122");
		dicTableEntity.setGovyear(2019);
		dicTableEntity.setRemark("a1");
		dicTableEntity.setTabletype(TableTypeEnum.LOGICAL_TABLE.getType());
		tableService.addDicTable(dicTableEntity);
		
		DicColumnEntity dicColumnEntity = new DicColumnEntity();
		dicColumnEntity.setTableEntity(dicTableEntity);
		dicColumnEntity.setColumncode("lsakd4");
		dicColumnEntity.setGovid(dicTableEntity.getGovid());
		dicColumnEntity.setGovyear(dicTableEntity.getGovyear());
		columnService.saveDicColumn(dicColumnEntity);
	}

}
