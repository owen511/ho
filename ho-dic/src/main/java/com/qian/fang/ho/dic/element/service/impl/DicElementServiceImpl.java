/**
 * @Title: DicElementServiceImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月26日  owen
 */
 

package com.qian.fang.ho.dic.element.service.impl;

import com.qian.fang.ho.dic.element.bpo.IDicElmentBPO;
import com.qian.fang.ho.dic.element.service.IDicElementService;

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
	

}
