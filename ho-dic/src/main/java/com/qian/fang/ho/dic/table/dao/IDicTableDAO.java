/**
 * @Title: IDicTableDAO.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月24日  owen
 */
 

package com.qian.fang.ho.dic.table.dao;

import java.util.List;

import com.qian.fang.ho.dic.table.entity.DicTableEntity;

/**
 * 数据访问接口.
 * @ClassName: IDicTableDAO
 * @Description: Description of this class
 * @author owen 于 2019年11月24日 下午3:08:59
 */

public interface IDicTableDAO {
	/**
	 * 表注册.
	 * @param dicTableEntity
	 */
	void addDicTable(DicTableEntity dicTableEntity);
	
	/**
	 * 表注册(批量).
	 * @param dicTableEntityLists
	 */
	void addDicTable(List<DicTableEntity> dicTableEntityLists);

}
