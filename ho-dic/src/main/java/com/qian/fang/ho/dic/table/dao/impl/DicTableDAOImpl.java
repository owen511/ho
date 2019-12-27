/**
 * @Title: DicTableDAOImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月24日  owen
 */
 

package com.qian.fang.ho.dic.table.dao.impl;

import java.util.List;

import com.qian.fang.ho.common.dao.impl.CommonHibernateDaoSupportImpl;
import com.qian.fang.ho.dic.table.dao.IDicTableDAO;
import com.qian.fang.ho.dic.table.entity.DicTableEntity;

/**
 * @ClassName: DicTableDAOImpl
 * @Description: Description of this class
 * @author owen 于 2019年11月24日 下午3:11:14
 */

public class DicTableDAOImpl extends CommonHibernateDaoSupportImpl implements IDicTableDAO {

	public void addDicTable(DicTableEntity dicTableEntity) {
		this.getHibernateTemplate().save(dicTableEntity);
	}

	public void addDicTable(List<DicTableEntity> dicTableEntityLists) {
		for (DicTableEntity dicTableEntity : dicTableEntityLists) {
			this.getHibernateTemplate().save(dicTableEntity);
		}
	}

}
