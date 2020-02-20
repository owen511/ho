/**
 * @Title: DicTableDAOImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月24日  owen
 */
 

package com.qian.fang.ho.dic.table.dao.impl;

import java.util.List;

import com.qian.fang.ho.dic.DicBaseCommonHibernateDaoSupportImpl;
import com.qian.fang.ho.dic.table.dao.IDicTableDAO;
import com.qian.fang.ho.dic.table.entity.DicTableEntity;

/**
 * @ClassName: DicTableDAOImpl
 * @Description: Description of this class
 * @author owen 于 2019年11月24日 下午3:11:14
 */

public class DicTableDAOImpl extends DicBaseCommonHibernateDaoSupportImpl<DicTableEntity> implements IDicTableDAO {

	public void addTable(DicTableEntity dicTable) {
		this.save(dicTable);
	}

	public void addTables(List<DicTableEntity> dicTables) {
		this.save(dicTables);
	}

	public List<DicTableEntity> deleteTables(List<DicTableEntity> dicTables) {
		return this.delete(dicTables);
	}

	public List<DicTableEntity> updateTables(List<DicTableEntity> dicTables) {
		return this.update(dicTables);
	}

	public DicTableEntity updateTable(DicTableEntity dicTable) {
		return this.update(dicTable);
	}

	public List<DicTableEntity> findAllTables() {
		return this.findAll("from DicTableEntity");
	}

	public DicTableEntity findTableById(DicTableEntity entity , int pkId) {
		return this.findById(entity, pkId);
	}

	public DicTableEntity findTableByCode(String tableCode) {
		DicTableEntity entity = new DicTableEntity();
		return this.find(entity, "tablecode", tableCode);
	}

}
