/**
 * @Title: DataRightBPOImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年3月6日 上午11:22:43
 * @author owen
 */
 

package com.qian.fang.ho.ca.dataright.bpo.impl;

import java.util.List;

import com.qian.fang.ho.ca.dataright.bpo.IDataRightBPO;
import com.qian.fang.ho.ca.dataright.dao.IDataRightDAO;
import com.qian.fang.ho.ca.dataright.entity.DataRightEntity;

/**
 * @ClassName:DataRightBPOImpl
 * @Description:
 * @author owen 于 2020年3月6日 上午11:22:43
 */

public class DataRightBPOImpl implements IDataRightBPO {
	
	private IDataRightDAO dataRightDAO;

	/**
	 * @return dataRightDAO
	 */
	public IDataRightDAO getDataRightDAO() {
		return dataRightDAO;
	}

	/**
	 * @param dataRightDAO 要设置的 dataRightDAO
	 */
	public void setDataRightDAO(IDataRightDAO dataRightDAO) {
		this.dataRightDAO = dataRightDAO;
	}

	/**
	 *
	 * @param pkId
	 * @return
	 * @see com.qian.fang.ho.ca.dataright.bpo.IDataRightBPO#findById(int)
	 */
	public DataRightEntity findById(int pkId) {
		return dataRightDAO.findById(pkId);
	}

	/**
	 *
	 * @param roleId
	 * @return
	 * @see com.qian.fang.ho.ca.dataright.bpo.IDataRightBPO#findByRoleId(int)
	 */
	public List<DataRightEntity> findByRoleId(int roleId) {
		return dataRightDAO.findByRoleId(roleId);
	}

	/**
	 *
	 * @param dataRight
	 * @see com.qian.fang.ho.ca.dataright.bpo.IDataRightBPO#addDataRight(com.qian.fang.ho.ca.dataright.entity.DataRightEntity)
	 */
	public void addDataRight(DataRightEntity dataRight) {
		dataRightDAO.addDataRight(dataRight);
	}

	/**
	 *
	 * @param dataRight
	 * @see com.qian.fang.ho.ca.dataright.bpo.IDataRightBPO#updateDataRight(com.qian.fang.ho.ca.dataright.entity.DataRightEntity)
	 */
	public void updateDataRight(DataRightEntity dataRight) {
		dataRightDAO.updateDataRight(dataRight);
	}

	/**
	 *
	 * @param dataRights
	 * @see com.qian.fang.ho.ca.dataright.bpo.IDataRightBPO#deleteDataRights(java.util.List)
	 */
	public void deleteDataRights(List<DataRightEntity> dataRights) {
		dataRightDAO.deleteDataRights(dataRights);
	}

}
