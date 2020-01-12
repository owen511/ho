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
 * 
 * @ClassName: IDicTableDAO
 * @Description: Description of this class
 * @author owen 于 2019年11月24日 下午3:08:59
 */

public interface IDicTableDAO {
	/**
	 * 新增表注册.
	 * 
	 * @param dicTable
	 */
	void addDicTable(DicTableEntity dicTable);

	/**
	 * 新增表注册(批量).
	 * 
	 * @param dicTables
	 */
	void addDicTables(List<DicTableEntity> dicTables);

	/**
	 * 删除表注册(批量).
	 * 
	 * @param dicTables
	 * @return List<DicTableEntity>
	 */
	List<DicTableEntity> deleteTables(List<DicTableEntity> dicTables);

	/**
	 * 修改表注册(批量).
	 * 
	 * @param dicTables
	 * @return List<DicTableEntity>
	 */
	List<DicTableEntity> updateTables(List<DicTableEntity> dicTables);

	/**
	 * 修改表注册.
	 * 
	 * @param dicTable
	 * @return DicTableEntity
	 */
	DicTableEntity updateTable(DicTableEntity dicTable);
	
	/**
	 * 查找所有表.
	 * @return List<DicTableEntity>
	 */
	List<DicTableEntity> findAllTables();
	
	/**
	 * 根据表编码查找表.
	 * @param tablecode 表编码
	 * @return DicTableEntity
	 */
	DicTableEntity findTableByCode(String tablecode);
	
	/**
	 * 根据表 pk ID查找
	 * @param entity 实体实例.
	 * @param id
	 * @return DicTableEntity
	 */
	DicTableEntity findTableById(DicTableEntity entity,String id);

}
