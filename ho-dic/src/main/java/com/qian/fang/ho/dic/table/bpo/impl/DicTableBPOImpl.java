/**
 * @Title: DicTableBPOImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月24日  owen
 */
 

package com.qian.fang.ho.dic.table.bpo.impl;

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

	public void addDicTable(DicTableEntity dicTableEntity) {
		dicTableDAO.addDicTable(dicTableEntity);
	}

}
