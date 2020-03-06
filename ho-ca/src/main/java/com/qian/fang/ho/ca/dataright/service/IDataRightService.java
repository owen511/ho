/**
 * @Title: IDataRightService.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年3月6日 上午11:21:49
 * @author owen
 */
 

package com.qian.fang.ho.ca.dataright.service;

import java.util.List;

import com.qian.fang.ho.ca.dataright.entity.DataRightEntity;

/**
 * 数据权限服务接口.
 * @ClassName:IDataRightService
 * @Description:
 * @author owen 于 2020年3月6日 上午11:21:49
 */

public interface IDataRightService {
	/**
	 * 查找数据权限。
	 * @param pkId 数据权限ID
	 * @return DataRightEntity
	 */
	DataRightEntity findById(int pkId);

	/**
	 * 查找数据权限。
	 * @param roleId 角色ID
	 * @return List<DataRightEntity> 数据权限集合
	 */
	List<DataRightEntity> findByRoleId(int roleId);
	
	/**
	 * 新增数据权限。
	 * @param dataRight
	 */
	void addDataRight(DataRightEntity dataRight);
	
	/**
	 * 修改数据权限。
	 * @param dataRight
	 */
	void updateDataRight(DataRightEntity dataRight);
	
	/**
	 * 删除数据权限。
	 * @param dataRights
	 */
	void deleteDataRights(List<DataRightEntity> dataRights);
}
