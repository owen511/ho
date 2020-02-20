/**
 * @Title: DicElementServiceImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月26日  owen
 */
 

package com.qian.fang.ho.dic.element.service.impl;

import java.util.List;

import com.qian.fang.ho.dic.element.bpo.IDicElmentBPO;
import com.qian.fang.ho.dic.element.entity.DicElementEntity;
import com.qian.fang.ho.dic.element.service.IDicElementService;
import com.qian.fang.ho.dic.table.entity.DicTableEntity;

/**
 *
 * @author owen 于 2019年11月26日 下午5:29:47
 */

public class DicElementServiceImpl implements IDicElementService {
	
	private IDicElmentBPO dicElementBPO;

	/**
	 * @return dicElementBPO
	 */
	public IDicElmentBPO getDicElementBPO() {
		return dicElementBPO;
	}

	/**
	 * @param dicElementBPO 要设置的 dicElementBPO
	 */
	public void setDicElementBPO(IDicElmentBPO dicElementBPO) {
		this.dicElementBPO = dicElementBPO;
	}

	public void addElement(DicElementEntity dicElement) {
		this.dicElementBPO.addElement(dicElement);
	}

	public void addElements(List<DicElementEntity> dicElements) {
		this.dicElementBPO.addElements(dicElements);
	}

	public List<DicElementEntity> deleteElements(List<DicElementEntity> dicElements) {
		return this.dicElementBPO.deleteElements(dicElements);
	}

	public List<DicElementEntity> updateElements(List<DicElementEntity> dicElements) {
		return this.dicElementBPO.updateElements(dicElements);
	}

	public DicElementEntity updateElement(DicElementEntity dicElement) {
		return this.dicElementBPO.updateElement(dicElement);
	}

	public List<DicElementEntity> findAllElements() {
		return this.dicElementBPO.findAllElements();
	}

	public DicElementEntity findElementByCode(String elementCode) {
		return this.dicElementBPO.findElementByCode(elementCode);
	}

	public DicElementEntity findElementById(DicElementEntity entity, int pkId) {
		return this.dicElementBPO.findElementById(entity, pkId);
	}

	public List<DicElementEntity> findElementsByTableFK(DicTableEntity table) {
		return this.dicElementBPO.findElementsByTableFK(table);
	}
	

}
