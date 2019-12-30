/**
 * @Title: IDicColumnDAO.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月25日  owen
 */
 

package com.qian.fang.ho.dic.column.dao;

import java.util.List;

import com.qian.fang.ho.dic.column.entity.DicColumnEntity;

/**
 * 表字段注册数据访问接口.
 * @ClassName: IDicColumnDAO
 * @Description: Description of this class
 * @author owen 于 2019年11月25日 下午11:07:15
 */

public interface IDicColumnDAO {
	
	/**
	 ** 新增表字段.
	 * @param dicColumn 表字段实体类.
	 */
	void addDicColumn(DicColumnEntity dicColumn);
	
	/**
	 * 新增表字段.
	 * @param dicColumns
	 */
	void addDicColumns(List<DicColumnEntity> dicColumns);
	
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
	 */
	void updateColumn(DicColumnEntity dicColumn);

}
