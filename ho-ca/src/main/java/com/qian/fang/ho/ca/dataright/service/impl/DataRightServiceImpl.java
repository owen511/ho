/**
 * @Title: DataRightServiceImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年3月6日 上午11:24:53
 * @author owen
 */
 

package com.qian.fang.ho.ca.dataright.service.impl;

import java.util.List;

import com.qian.fang.ho.ca.dataright.bpo.IDataRightBPO;
import com.qian.fang.ho.ca.dataright.entity.DataRightEntity;
import com.qian.fang.ho.ca.dataright.service.IDataRightService;

/**
 * 数据权限服务类.
 * @ClassName:DataRightServiceImpl
 * @Description:
 * @author owen 于 2020年3月6日 上午11:24:53
 */

public class DataRightServiceImpl implements IDataRightService {
	
	/**
	 * 数据权限业务处理接口。
	 */
	private IDataRightBPO dataRightBPO;

	/**
	 * @return dataRightBPO
	 */
	public IDataRightBPO getDataRightBPO() {
		return dataRightBPO;
	}

	/**
	 * @param dataRightBPO 要设置的 dataRightBPO
	 */
	public void setDataRightBPO(IDataRightBPO dataRightBPO) {
		this.dataRightBPO = dataRightBPO;
	}

	/**
	 *
	 * @param pkId
	 * @return
	 * @see com.qian.fang.ho.ca.dataright.service.IDataRightService#findById(int)
	 */
	public DataRightEntity findById(int pkId) {
		return dataRightBPO.findById(pkId);
	}

	/**
	 *
	 * @param roleId
	 * @return
	 * @see com.qian.fang.ho.ca.dataright.service.IDataRightService#findByRoleId(int)
	 */
	public List<DataRightEntity> findByRoleId(int roleId) {
		return dataRightBPO.findByRoleId(roleId);
	}

	/**
	 *
	 * @param dataRight
	 * @see com.qian.fang.ho.ca.dataright.service.IDataRightService#addDataRight(com.qian.fang.ho.ca.dataright.entity.DataRightEntity)
	 */
	public void addDataRight(DataRightEntity dataRight) {
		dataRightBPO.addDataRight(dataRight);
	}

	/**
	 *
	 * @param dataRight
	 * @see com.qian.fang.ho.ca.dataright.service.IDataRightService#updateDataRight(com.qian.fang.ho.ca.dataright.entity.DataRightEntity)
	 */
	public void updateDataRight(DataRightEntity dataRight) {
		dataRightBPO.updateDataRight(dataRight);
	}

	/**
	 *
	 * @param dataRights
	 * @see com.qian.fang.ho.ca.dataright.service.IDataRightService#deleteDataRights(java.util.List)
	 */
	public void deleteDataRights(List<DataRightEntity> dataRights) {
		dataRightBPO.deleteDataRights(dataRights);
	}

}
