/**
 * @Title: DicTableServiceImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月24日  owen
 */
 

package com.qian.fang.ho.dic.table.service.impl;

import java.util.List;

import com.qian.fang.ho.dic.table.bpo.IDicTableBPO;
import com.qian.fang.ho.dic.table.entity.DicTableEntity;
import com.qian.fang.ho.dic.table.service.IDicTableService;

/**
 * 	服务实现类.
 * @ClassName: DicTableServiceImpl
 * @Description: Description of this class
 * @author owen 于 2019年11月24日 下午3:13:42
 */
public class DicTableServiceImpl implements IDicTableService {
	
	/**
	 * 业务处理接口.
	 */
	private IDicTableBPO dicTableBPO;
	
	/**
	 * @return dicTableBPO
	 */
	public IDicTableBPO getDicTableBPO() {
		return dicTableBPO;
	}

	/**
	 * @param dicTableBPO 要设置的 dicTableBPO
	 */
	public void setDicTableBPO(IDicTableBPO dicTableBPO) {
		this.dicTableBPO = dicTableBPO;
	}

	public void addTable(DicTableEntity dicTableEntity) {
		dicTableBPO.addTable(dicTableEntity);
	}

	public void addTables(List<DicTableEntity> dicTables) {
		dicTableBPO.addTables(dicTables);
	}

	public List<DicTableEntity> deleteTables(List<DicTableEntity> dicTables) {
		return dicTableBPO.deleteTables(dicTables);
	}

	public List<DicTableEntity> updateTables(List<DicTableEntity> dicTables) {
		return dicTableBPO.updateTables(dicTables);
	}

	public DicTableEntity updateTable(DicTableEntity dicTable) {
		return dicTableBPO.updateTable(dicTable);
	}

	public List<DicTableEntity> findAllTables() {
		return dicTableBPO.findAllTables();
	}

	public DicTableEntity findTableByCode(String tableCode) {
		return  dicTableBPO.findTableByCode(tableCode);
	}

	public DicTableEntity findTableById(DicTableEntity entity, int pkId) {
		return dicTableBPO.findTableById(entity, pkId);
	}

}
