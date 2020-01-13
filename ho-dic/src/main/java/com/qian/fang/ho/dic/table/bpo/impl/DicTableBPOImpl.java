/**
 * @Title: DicTableBPOImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月24日  owen
 */
 

package com.qian.fang.ho.dic.table.bpo.impl;

import java.util.List;

import com.qian.fang.ho.dic.table.bpo.IDicTableBPO;
import com.qian.fang.ho.dic.table.dao.IDicTableDAO;
import com.qian.fang.ho.dic.table.entity.DicTableEntity;

/**
 * 业务处理实现类.
 * @ClassName: DicTableBPOImpl
 * @Description: Description of this class
 * @author owen 于 2019年11月24日 下午9:36:33
 */

public class DicTableBPOImpl implements IDicTableBPO {
	
	private IDicTableDAO dicTableDAO;
	
	/**
	 * @return dicTableDAO
	 */
	public IDicTableDAO getDicTableDAO() {
		return dicTableDAO;
	}

	/**
	 * @param dicTableDAO 要设置的 dicTableDAO
	 */
	public void setDicTableDAO(IDicTableDAO dicTableDAO) {
		this.dicTableDAO = dicTableDAO;
	}

	public void addDicTable(DicTableEntity dicTable) {
		dicTableDAO.addDicTable(dicTable);
	}

	public void addDicTables(List<DicTableEntity> dicTables) {
		dicTableDAO.addDicTables(dicTables);
	}

	public List<DicTableEntity> deleteTables(List<DicTableEntity> dicTables) {
		return dicTableDAO.deleteTables(dicTables);
	}

	public List<DicTableEntity> updateTables(List<DicTableEntity> dicTables) {
		return dicTableDAO.updateTables(dicTables);
	}

	public DicTableEntity updateTable(DicTableEntity dicTable) {
		return dicTableDAO.updateTable(dicTable);
	}

	public List<DicTableEntity> findAllTables() {
		return dicTableDAO.findAllTables();
	}

	public DicTableEntity findTableByCode(String tablecode) {
		return dicTableDAO.findTableByCode(tablecode);
	}

	public DicTableEntity findTableById(DicTableEntity entity, int pkId) {
		return dicTableDAO.findTableById(entity, pkId);
	}

}
