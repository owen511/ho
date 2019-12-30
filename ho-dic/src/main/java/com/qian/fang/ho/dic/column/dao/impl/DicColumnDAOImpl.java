/**
 * @Title: DicColumnDAOImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月25日  owen
 */
 

package com.qian.fang.ho.dic.column.dao.impl;

import java.util.List;

import com.qian.fang.ho.common.dao.impl.CommonHibernateDaoSupportImpl;
import com.qian.fang.ho.dic.column.dao.IDicColumnDAO;
import com.qian.fang.ho.dic.column.entity.DicColumnEntity;

/**
 * 表字段注册数据访问实现类.
 * @ClassName: DicColumnDAOImpl
 * @Description: Description of this class
 * @author owen 于 2019年11月25日 下午11:07:48
 */

public class DicColumnDAOImpl extends CommonHibernateDaoSupportImpl<DicColumnEntity> implements IDicColumnDAO {
	
	public void addDicColumn(DicColumnEntity dicColumn) {
		this.save(dicColumn);
	}

	public void addDicColumns(List<DicColumnEntity> dicColumns) {
		this.save(dicColumns);		
	}

	public List<DicColumnEntity> deleteColumns(List<DicColumnEntity> dicColumns) {
		return this.delete(dicColumns);
	}

	public List<DicColumnEntity> updateColumns(List<DicColumnEntity> dicColumns) {
		return this.update(dicColumns);
	}

	public void updateColumn(DicColumnEntity dicColumn) {
		this.update(dicColumn);
	}

}
