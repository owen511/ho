/**
 * @Title: DicColumnDAOImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月25日  owen
 */
 

package com.qian.fang.ho.dic.column.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.qian.fang.ho.dic.DicBaseCommonHibernateDaoSupportImpl;
import com.qian.fang.ho.dic.column.dao.IDicColumnDAO;
import com.qian.fang.ho.dic.column.entity.DicColumnEntity;
import com.qian.fang.ho.dic.table.entity.DicTableEntity;

/**
 * 表字段注册数据访问实现类.
 * @ClassName: DicColumnDAOImpl
 * @Description: Description of this class
 * @author owen 于 2019年11月25日 下午11:07:48
 */

public class DicColumnDAOImpl extends DicBaseCommonHibernateDaoSupportImpl<DicColumnEntity> implements IDicColumnDAO {
	
	public void addColumn(DicColumnEntity dicColumn) {
		this.save(dicColumn);
	}

	public void addColumns(List<DicColumnEntity> dicColumns) {
		this.save(dicColumns);		
	}

	public List<DicColumnEntity> deleteColumns(List<DicColumnEntity> dicColumns) {
		return this.delete(dicColumns);
	}

	public List<DicColumnEntity> updateColumns(List<DicColumnEntity> dicColumns) {
		return this.update(dicColumns);
	}

	public DicColumnEntity updateColumn(DicColumnEntity dicColumn) {
		return this.update(dicColumn);
	}

	public List<DicColumnEntity> findAllColumns() {
		return this.findAll("from DicColumnEntity");
	}

	public DicColumnEntity findColumnByCode(String columnCode) {
		DicColumnEntity entity = new DicColumnEntity();
		return this.find(entity, "columncode", columnCode);
	}

	public DicColumnEntity findColumnById(DicColumnEntity entity, int pkId) {
		return this.findById(entity, pkId);
	}

	public List<DicColumnEntity> findColumnsByTableFK(DicTableEntity table) {
		List<DicColumnEntity> result = new ArrayList<DicColumnEntity>();
		if (null == table) {
			return result;
		}
		String hql = "from DicColumnEntity where tableid=" + table.getTableid();
		result = findAll(hql);
		return result;
	}

}
