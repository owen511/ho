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

	public void addDicElement(DicElementEntity dicElement) {
		this.save(dicElement);
		
	}

	public void addDicElements(List<DicElementEntity> dicElements) {
		this.save(dicElements);
	}

	public List<DicElementEntity> deleteElements(List<DicElementEntity> dicElements) {
		return this.delete(dicElements);
	}

	public List<DicElementEntity> updateElements(List<DicElementEntity> dicElements) {
		return this.update(dicElements);
	}

	public void updateElement(DicElementEntity dicElement) {
		this.update(dicElement);
	}

}
