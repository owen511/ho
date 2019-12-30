/**
 * @Title: IDicElementDAO.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月26日  owen
 */
 

package com.qian.fang.ho.dic.element.dao;

import java.util.List;

import com.qian.fang.ho.dic.element.entity.DicElementEntity;

/**
 * 要素定义访问接口.
 * @author owen 于 2019年11月26日 下午5:23:50
 */

public interface IDicElementDAO {

	/**
	 ** 新增要素.
	 * @param dicElement 要素实体类.
	 */
	void addDicElement(DicElementEntity dicElement);
	
	/**
	 * 新增要素.
	 * @param dicElements
	 */
	void addDicElements(List<DicElementEntity> dicElements);
	
	/**
	 * 删除要素.
	 * @param dicElements
	 * @return
	 */
	List<DicElementEntity> deleteElements(List<DicElementEntity> dicElements);
	
	/**
	 * 修改要素.
	 * @param dicElements
	 * @return
	 */
	List<DicElementEntity> updateElements(List<DicElementEntity> dicElements);
	
	/**
	 * 修改要素.
	 * @param dicElement
	 */
	void updateElement(DicElementEntity dicElement);
}
