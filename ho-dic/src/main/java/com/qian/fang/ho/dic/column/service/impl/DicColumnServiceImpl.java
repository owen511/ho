/**
 * @Title: DicColumnServiceImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月25日  owen
 */
 

package com.qian.fang.ho.dic.column.service.impl;

import java.util.List;

import com.qian.fang.ho.dic.column.bpo.IDicColumnBPO;
import com.qian.fang.ho.dic.column.entity.DicColumnEntity;
import com.qian.fang.ho.dic.column.service.IDicColumnService;
import com.qian.fang.ho.dic.table.entity.DicTableEntity;

/**
 * 表字段注册服务实现类.
 * @ClassName: DicColumnServiceImpl
 * @Description: Description of this class
 * @author owen 于 2019年11月25日 下午11:10:05
 */

public class DicColumnServiceImpl implements IDicColumnService {
	
	private IDicColumnBPO dicColumnBPO;

	/**
	 * @return dicColumnBPO
	 */
	public IDicColumnBPO getDicColumnBPO() {
		return dicColumnBPO;
	}

	/**
	 * @param dicColumnBPO 要设置的 dicColumnBPO
	 */
	public void setDicColumnBPO(IDicColumnBPO dicColumnBPO) {
		this.dicColumnBPO = dicColumnBPO;
	}

	public void addColumn(DicColumnEntity dicColumn) {
		this.dicColumnBPO.addColumn(dicColumn);
	}

	public void addColumns(List<DicColumnEntity> dicColumns) {
		this.dicColumnBPO.addColumns(dicColumns);
	}

	public List<DicColumnEntity> deleteColumns(List<DicColumnEntity> dicColumns) {
		return this.deleteColumns(dicColumns);
	}

	public List<DicColumnEntity> updateColumns(List<DicColumnEntity> dicColumns) {
		return this.dicColumnBPO.updateColumns(dicColumns);
	}

	public DicColumnEntity updateColumn(DicColumnEntity dicColumn) {
		return this.dicColumnBPO.updateColumn(dicColumn);
	}

	public List<DicColumnEntity> findAllColumns() {
		return this.dicColumnBPO.findAllColumns();
	}

	public DicColumnEntity findColumnByCode(String columnCode) {
		return this.dicColumnBPO.findColumnByCode(columnCode);
	}

	public DicColumnEntity findColumnById(DicColumnEntity entity, int pkId) {
		return this.dicColumnBPO.findColumnById(entity, pkId);
	}

	public List<DicColumnEntity> findColumnsByTableFK(DicTableEntity table) {
		return this.dicColumnBPO.findColumnsByTableFK(table);
	}


}
