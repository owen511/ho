/**
 * @Title: DicColumnBPOImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月25日  owen
 */
 

package com.qian.fang.ho.dic.column.bpo.impl;

import java.util.List;

import com.qian.fang.ho.dic.column.bpo.IDicColumnBPO;
import com.qian.fang.ho.dic.column.dao.IDicColumnDAO;
import com.qian.fang.ho.dic.column.entity.DicColumnEntity;

/**
 * 表字段注册业务处理实现类.
 * @ClassName: DicColumnBPOImpl
 * @Description: Description of this class
 * @author owen 于 2019年11月25日 下午11:09:06
 */

public class DicColumnBPOImpl implements IDicColumnBPO {
	
	private IDicColumnDAO dicColumnDAO;
	
	/**
	 * @return dicColumnDAO
	 */
	public IDicColumnDAO getDicColumnDAO() {
		return dicColumnDAO;
	}

	/**
	 * @param dicColumnDAO 要设置的 dicColumnDAO
	 */
	public void setDicColumnDAO(IDicColumnDAO dicColumnDAO) {
		this.dicColumnDAO = dicColumnDAO;
	}



	public void addDicColumn(DicColumnEntity dicColumn) {
		dicColumnDAO.addDicColumn(dicColumn);
	}

	public void addDicColumns(List<DicColumnEntity> dicColumns) {
		dicColumnDAO.addDicColumns(dicColumns);
	}

	public List<DicColumnEntity> deleteColumns(List<DicColumnEntity> dicColumns) {
		return dicColumnDAO.deleteColumns(dicColumns);
	}

	public List<DicColumnEntity> updateColumns(List<DicColumnEntity> dicColumns) {
		return dicColumnDAO.updateColumns(dicColumns);
	}

	public void updateColumn(DicColumnEntity dicColumn) {
		dicColumnDAO.updateColumn(dicColumn);
	}

}
