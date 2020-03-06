/**
 * @Title: DataRightDAOImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年3月6日 上午10:38:45
 * @author owen
 */
 

package com.qian.fang.ho.ca.dataright.dao.impl;

import java.util.List;

import com.qian.fang.ho.ca.CaBaseCommonHibernateDaoSupportImpl;
import com.qian.fang.ho.ca.dataright.dao.IDataRightDAO;
import com.qian.fang.ho.ca.dataright.entity.DataRightEntity;

/**
 * @ClassName:DataRightDAOImpl
 * @Description:
 * @author owen 于 2020年3月6日 上午10:38:45
 */

public class DataRightDAOImpl extends CaBaseCommonHibernateDaoSupportImpl<DataRightEntity> implements IDataRightDAO {

	public DataRightEntity findById(int pkId) {
		DataRightEntity entity = new DataRightEntity();
		return super.findById(entity, pkId);
	}

	public List<DataRightEntity> findByRoleId(int roleId) {
		return super.find("from DataRightEntity where roleid=?0", roleId);
	}

	public void addDataRight(DataRightEntity dataRight) {
		super.save(dataRight);
	}

	public void updateDataRight(DataRightEntity dataRight) {
		super.update(dataRight);
	}

	public void deleteDataRights(List<DataRightEntity> dataRights) {
		super.delete(dataRights);
	}

}
