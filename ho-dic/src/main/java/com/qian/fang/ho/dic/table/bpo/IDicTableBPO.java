/**
 * @Title: IDicTableBPO.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月24日  owen
 */
 

package com.qian.fang.ho.dic.table.bpo;

import java.util.List;

import com.qian.fang.ho.dic.table.entity.DicTableEntity;

/**
 * 业务处理接口.
 * @ClassName: IDicTableBPO
 * @Description: Description of this class
 * @author owen 于 2019年11月24日 下午9:35:50
 */

public interface IDicTableBPO {

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
	 * 查找所以表.
	 * @return
	 */
	List<DicTableEntity> findAllTables();
	
	/**
	 * 查找表.
	 * @param tablecode 表编码
	 * @return
	 */
	DicTableEntity findTableByCode(String tablecode);
	
	/**
	 * 根据表 pk ID查找
	 * @param entity 实体实例.
	 * @param pkId
	 * @return DicTableEntity
	 */
	DicTableEntity findTableById(DicTableEntity entity,int pkId);
}
