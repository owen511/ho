/**
 * @Title: IClsService.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月8日 下午10:14:13
 * @author owen
 */
 

package com.qian.fang.ho.ca.cls.service;

import java.util.List;

import com.qian.fang.ho.ca.cls.entity.ClsEntity;

/**
 * @ClassName:IClsService
 * @Description:
 * @author owen 于 2020年2月8日 下午10:14:13
 */

public interface IClsService {
	
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
