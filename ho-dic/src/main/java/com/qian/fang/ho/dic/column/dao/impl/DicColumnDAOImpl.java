/**
 * @Title: DicColumnDAOImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月25日  owen
 */
 

package com.qian.fang.ho.dic.column.dao.impl;

import com.qian.fang.ho.common.dao.impl.CommonHibernateDaoSupportImpl;
import com.qian.fang.ho.dic.column.dao.IDicColumnDAO;
import com.qian.fang.ho.dic.column.entity.DicColumnEntity;

/**
 * 表字段注册数据访问实现类.
 * @ClassName: DicColumnDAOImpl
 * @Description: Description of this class
 * @author owen 于 2019年11月25日 下午11:07:48
 */

public class DicColumnDAOImpl extends CommonHibernateDaoSupportImpl implements IDicColumnDAO {
	
	public void saveDicColumn(DicColumnEntity dicColumnEntity) {
		this.getHibernateTemplate().save(dicColumnEntity);
	}

}
