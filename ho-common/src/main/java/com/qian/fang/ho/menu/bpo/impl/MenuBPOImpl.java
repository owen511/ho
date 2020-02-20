/**
 * @Title: MenuBPOImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月6日 下午10:07:00
 * @author owen
 */
 

package com.qian.fang.ho.menu.bpo.impl;

import java.util.List;

import com.qian.fang.ho.menu.bpo.IMenuBPO;
import com.qian.fang.ho.menu.dao.IMenuDAO;
import com.qian.fang.ho.menu.entity.MenuEntity;

/**
 * @ClassName:MenuBPOImpl
 * @Description:
 * @author owen 于 2020年2月6日 下午10:07:00
 */

public class MenuBPOImpl implements IMenuBPO {
	
	private IMenuDAO menuDAO;

	/**
	 * @return menuDAO
	 */
	public IMenuDAO getMenuDAO() {
		return menuDAO;
	}

	/**
	 * @param menuDAO 要设置的 menuDAO
	 */
	public void setMenuDAO(IMenuDAO menuDAO) {
		this.menuDAO = menuDAO;
	}

	/**
	 *
	 * @param menu
	 * @see com.qian.fang.ho.menu.bpo.IMenuBPO#addMenu(com.qian.fang.ho.menu.entity.MenuEntity)
	 */
	public void addMenu(MenuEntity menu) {
		this.menuDAO.addMenu(menu);
	}

	public List<MenuEntity> findAllMenus() {
		return this.menuDAO.findAllMenus();
	}

}
