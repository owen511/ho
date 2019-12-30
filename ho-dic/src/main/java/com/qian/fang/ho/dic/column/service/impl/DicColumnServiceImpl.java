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

	public void addDicColumn(DicColumnEntity dicColumn) {
		dicColumnBPO.addDicColumn(dicColumn);		
	}

	public void addDicColumns(List<DicColumnEntity> dicColumns) {
		dicColumnBPO.addDicColumns(dicColumns);
	}

	public List<DicColumnEntity> deleteColumns(List<DicColumnEntity> dicColumns) {
		return dicColumnBPO.deleteColumns(dicColumns);
	}

	public List<DicColumnEntity> updateColumns(List<DicColumnEntity> dicColumns) {
		return dicColumnBPO.updateColumns(dicColumns);
	}

	public void updateColumn(DicColumnEntity dicColumn) {
		dicColumnBPO.updateColumn(dicColumn);
	}
	
}
