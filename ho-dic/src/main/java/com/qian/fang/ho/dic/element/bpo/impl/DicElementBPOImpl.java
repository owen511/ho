/**
 * @Title: DicElementBPOImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月26日  owen
 */
 

package com.qian.fang.ho.dic.element.bpo.impl;

import com.qian.fang.ho.dic.element.bpo.IDicElmentBPO;
import com.qian.fang.ho.dic.element.dao.IDicElementDAO;

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
	

}
