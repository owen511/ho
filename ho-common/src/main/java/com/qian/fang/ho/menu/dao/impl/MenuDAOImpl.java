/**
 * @Title: MenuDAOImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月6日 下午9:58:36
 * @author owen
 */
 

package com.qian.fang.ho.menu.dao.impl;

import java.util.List;

import com.qian.fang.ho.common.dao.impl.CommonHibernateDaoSupportImpl;
import com.qian.fang.ho.menu.dao.IMenuDAO;
import com.qian.fang.ho.menu.entity.MenuEntity;

/**
 * @ClassName:MenuDAOImpl
 * @Description:
 * @author owen 于 2020年2月6日 下午9:58:36
 */

public class MenuDAOImpl extends CommonHibernateDaoSupportImpl<MenuEntity> implements IMenuDAO {

	public void addMenu(MenuEntity menu) {
		this.save(menu);
	}

	public List<MenuEntity> findAllMenus() {
		return this.findAll("from MenuEntity");
	}

}
