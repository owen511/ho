/**
 * @Title: IDicElmentBPO.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月26日  owen
 */
 

package com.qian.fang.ho.dic.element.bpo;

import java.util.List;

import com.qian.fang.ho.dic.element.entity.DicElementEntity;

/**
 *
 * @author owen 于 2019年11月26日 下午5:27:07
 */

public interface IDicElmentBPO {

	/**
	 ** 新增要素.
	 * @param dicElement 要素实体类.
	 */
	void addElement(DicElementEntity dicElement);
	
	/**
	 * 新增要素.
	 * @param dicElements
	 */
	void addElements(List<DicElementEntity> dicElements);
	
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
	DicElementEntity updateElement(DicElementEntity dicElement);
	
	/**
	 * 查找所有要素.
	 * @return List<DicTableEntity>
	 */
	List<DicElementEntity> findAllElements();
	
	/**
	 * 根据要素编码查找.
	 * @param tablecode 表编码
	 * @return DicElementEntity
	 */
	DicElementEntity findElementByCode(String elementCode);
	
	/**
	 * 根据要素 pk ID查找
	 * @param entity 实体实例.
	 * @param id
	 * @return DicElementEntity
	 */
	DicElementEntity findElementById(DicElementEntity entity,int pkId);
}
