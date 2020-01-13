/**
 * @Title: DicElementBPOImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月26日  owen
 */
 

package com.qian.fang.ho.dic.element.bpo.impl;

import java.util.List;

import com.qian.fang.ho.dic.element.bpo.IDicElmentBPO;
import com.qian.fang.ho.dic.element.dao.IDicElementDAO;
import com.qian.fang.ho.dic.element.entity.DicElementEntity;

/**
 *
 * @author owen 于 2019年11月26日 下午5:28:05
 */

public class DicElementBPOImpl implements IDicElmentBPO {
	
	private IDicElementDAO dicElementDAO;

	/**
	 * @return dicElementDAO
	 */
	public IDicElementDAO getDicElementDAO() {
		return dicElementDAO;
	}

	/**
	 * @param dicElementDAO 要设置的 dicElementDAO
	 */
	public void setDicElementDAO(IDicElementDAO dicElementDAO) {
		this.dicElementDAO = dicElementDAO;
	}

	public void addElement(DicElementEntity dicElement) {
		this.dicElementDAO.addElement(dicElement);
	}

	public void addElements(List<DicElementEntity> dicElements) {
		this.dicElementDAO.addElements(dicElements);
	}

	public List<DicElementEntity> deleteElements(List<DicElementEntity> dicElements) {
		return this.dicElementDAO.deleteElements(dicElements);
	}

	public List<DicElementEntity> updateElements(List<DicElementEntity> dicElements) {
		return this.dicElementDAO.updateElements(dicElements);
	}

	public DicElementEntity updateElement(DicElementEntity dicElement) {
		return this.dicElementDAO.updateElement(dicElement);
	}

	public List<DicElementEntity> findAllElements() {
		return this.dicElementDAO.findAllElements();
	}

	public DicElementEntity findElementByCode(String elementCode) {
		return this.dicElementDAO.findElementByCode(elementCode);
	}

	public DicElementEntity findElementById(DicElementEntity entity, int pkId) {
		return this.dicElementDAO.findElementById(entity, pkId);
	}
	

}
