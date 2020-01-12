/**
 * @Title: IDicTableService.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月24日  owen
 */
 

package com.qian.fang.ho.dic.table.service;

import java.util.List;

import com.qian.fang.ho.dic.table.entity.DicTableEntity;

/**
 * 	服务接口.
 * @ClassName: IDicTableService
 * @Description: Description of this class
 * @author owen 于 2019年11月24日 下午3:13:03
 */

public interface IDicTableService {

	/**
	 * 新增表注册.
	 * @param dicTable
	 */
	void addDicTable(DicTableEntity dicTable);
	
	/**
	 * 新增表注册(批量).
	 * @param dicTables
	 */
	void addDicTables(List<DicTableEntity> dicTables);
	
	/**
	 * 删除表注册(批量).
	 * @param dicTables
	 * @return
	 */
	List<DicTableEntity> deleteTables(List<DicTableEntity> dicTables); 
	
	/**
	 * 修改表注册(批量).
	 * @param dicTables
	 * @return
	 */
	List<DicTableEntity> updateTables(List<DicTableEntity> dicTables);
	
	/**
	 * 修改表注册.
	 * @param dicTable
	 * @return
	 */
	DicTableEntity updateTable(DicTableEntity dicTable);
	
	/**
	 * 查找所有表.
	 * @return
	 */
	List<DicTableEntity> findAllTables();
	
	/**
	 * 查找表.
	 * @param tablecode 表编码
	 * @return
	 */
	DicTableEntity findTableByCode(String tablecode);
}
