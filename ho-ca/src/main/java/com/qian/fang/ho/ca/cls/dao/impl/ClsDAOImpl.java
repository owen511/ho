/**
 * @Title: ClsDAOImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月8日 下午10:11:44
 * @author owen
 */
 

package com.qian.fang.ho.ca.cls.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.qian.fang.ho.ca.CaBaseCommonHibernateDaoSupportImpl;
import com.qian.fang.ho.ca.cls.dao.IClsDAO;
import com.qian.fang.ho.ca.cls.entity.ClsEntity;

/**
 * 类别访问实现类.
 * @ClassName:ClsDAOImpl
 * @Description:
 * @author owen 于 2020年2月8日 下午10:11:44
 */

public class ClsDAOImpl extends CaBaseCommonHibernateDaoSupportImpl<ClsEntity> implements IClsDAO {

	public ClsEntity findCls(int pk) {
		ClsEntity entity = new ClsEntity();
		return this.findById(entity, pk);
	}

	public ClsEntity findCls(String uk) {
		ClsEntity entity = new ClsEntity();
		return this.find(entity,"code",uk);
	}

	public List<ClsEntity> findAllClss() {
		return this.findAll("from ClsEntity");
	}

	public void addCls(ClsEntity cls) {
		this.save(cls);
	}

	public ClsEntity updateCls(ClsEntity cls) {
		return this.update(cls);
	}

	public void deleteCls(ClsEntity cls) {
		List<ClsEntity> result = new ArrayList<ClsEntity>();
		result.add(cls);
		this.delete(result);
	}

}
