/**
 * @Title: IDicColumnBPO.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月25日  owen
 */
 

package com.qian.fang.ho.dic.column.bpo;

import java.util.List;

import com.qian.fang.ho.dic.column.entity.DicColumnEntity;

/**
 * 表字段注册业务处理接口.
 * @ClassName: IDicColumnBPO
 * @Description: Description of this class
 * @author owen 于 2019年11月25日 下午11:08:38
 */

public interface IDicColumnBPO {

	/**
	 ** 新增表字段.
	 * @param dicColumn 表字段实体类.
	 */
	void addColumn(DicColumnEntity dicColumn);
	
	/**
	 * 新增表字段.
	 * @param dicColumns
	 */
	void addColumns(List<DicColumnEntity> dicColumns);
	
	/**
	 * 删除表字段.
	 * @param dicColumns
	 * @return
	 */
	List<DicColumnEntity> deleteColumns(List<DicColumnEntity> dicColumns);
	
	/**
	 * 修改表字段.
	 * @param dicColumns
	 * @return
	 */
	List<DicColumnEntity> updateColumns(List<DicColumnEntity> dicColumns);
	
	/**
	 * 修改表字段.
	 * @param dicColumn
	 * @return
	 */
	DicColumnEntity updateColumn(DicColumnEntity dicColumn);
	
	/**
	 * 查找所有表字段.
	 * @return List<DicTableEntity>
	 */
	List<DicColumnEntity> findAllColumns();
	
	/**
	 * 根据表字段编码查找表.
	 * @param columnCode 表字段编码
	 * @return DicColumnEntity
	 */
	DicColumnEntity findColumnByCode(String columnCode);
	
	/**
	 * 根据表字段 pk ID查找
	 * @param entity 实体实例.
	 * @param id
	 * @return DicColumnEntity
	 */
	DicColumnEntity findColumnById(DicColumnEntity entity,int pkId);
}
