/**
 * @Title: DicElementDAOImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月26日  owen
 */
 

package com.qian.fang.ho.dic.element.dao.impl;

import java.util.List;

import com.qian.fang.ho.common.dao.impl.CommonHibernateDaoSupportImpl;
import com.qian.fang.ho.dic.element.dao.IDicElementDAO;
import com.qian.fang.ho.dic.element.entity.DicElementEntity;

/**
 *
 * @author owen 于 2019年11月26日 下午5:26:29
 */

public class DicElementDAOImpl extends CommonHibernateDaoSupportImpl<DicElementEntity> implements IDicElementDAO {

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
		List<DicElementEntity> result = this.find("from DicElementEntity where elementcode=?0",
				new Object[] { elementCode.toUpperCase() });
		if (result.isEmpty()) {
			System.out.println("按条件elementcode=" + elementCode.toUpperCase() + ",没有找到符合的数据......");
			return new DicElementEntity();
		} else {
			return result.get(0);
		}
	}

	public DicElementEntity findElementById(DicElementEntity entity, int pkId) {
		return this.findElementById(entity, pkId);
	}

}
