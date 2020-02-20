/**
 * @Title: DicElementDAOImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月26日  owen
 */
 

package com.qian.fang.ho.dic.element.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.qian.fang.ho.dic.DicBaseCommonHibernateDaoSupportImpl;
import com.qian.fang.ho.dic.element.dao.IDicElementDAO;
import com.qian.fang.ho.dic.element.entity.DicElementEntity;
import com.qian.fang.ho.dic.table.entity.DicTableEntity;

/**
 *
 * @author owen 于 2019年11月26日 下午5:26:29
 */

public class DicElementDAOImpl extends DicBaseCommonHibernateDaoSupportImpl<DicElementEntity> implements IDicElementDAO {

	public void addElement(DicElementEntity dicElement) {
		this.save(dicElement);
	}

	public void addElements(List<DicElementEntity> dicElements) {
		this.save(dicElements);
	}

	public List<DicElementEntity> deleteElements(List<DicElementEntity> dicElements) {
		return this.delete(dicElements);
	}

	public List<DicElementEntity> updateElements(List<DicElementEntity> dicElements) {
		return this.update(dicElements);
	}

	public DicElementEntity updateElement(DicElementEntity dicElement) {
		return this.update(dicElement);
	}

	public List<DicElementEntity> findAllElements() {
		return this.findAll("from DicElementEntity");
	}

	public DicElementEntity findElementByCode(String elementCode) {
		DicElementEntity entity = new DicElementEntity();
		return this.find(entity, "elementcode", elementCode);
	}

	public DicElementEntity findElementById(DicElementEntity entity, int pkId) {
		return this.findElementById(entity, pkId);
	}

	public List<DicElementEntity> findElementsByTableFK(DicTableEntity table) {
		List<DicElementEntity> result = new ArrayList<DicElementEntity>();
		if (null == table) {
			return result;
		}
		String hql = "from DicElementEntity where tableid=" + table.getTableid();
		result = findAll(hql);
		return result;
	}

}
