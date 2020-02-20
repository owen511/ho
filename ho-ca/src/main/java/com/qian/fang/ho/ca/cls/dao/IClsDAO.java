/**
 * @Title: IClsDAO.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月8日 下午10:11:02
 * @author owen
 */
 

package com.qian.fang.ho.ca.cls.dao;

import java.util.List;

import com.qian.fang.ho.ca.cls.entity.ClsEntity;

/**
 * 类别访问接口.
 * @ClassName:IClsDAO
 * @Description:
 * @author owen 于 2020年2月8日 下午10:11:02
 */

public interface IClsDAO {
	
	/**
	 * 查找类别(根据主键).
	 * @param pk
	 * @return ClsEntity
	 */
	ClsEntity findCls(int pk);
	
	/**
	 * 查找类别(根据唯一键).
	 * @param uk
	 * @return ClsEntity
	 */
	ClsEntity findCls(String uk);
	
	/**
	 * 查找所有类别.
	 * @return List<ClsEntity>
	 */
	List<ClsEntity> findAllClss();
	
	/**
	 * 新增类别.
	 * @param cls
	 */
	void addCls(ClsEntity cls);
	
	/**
	 * 修改类别.
	 * @param cls
	 * @return
	 */
	ClsEntity updateCls(ClsEntity cls);
	
	/**
	 * 删除类别.
	 * @param cls
	 */
	void deleteCls(ClsEntity cls);
}
