/**
 * @Title: MenuServiceImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月6日 下午10:09:09
 * @author owen
 */
 

package com.qian.fang.ho.menu.service.impl;

import java.util.List;

import com.qian.fang.ho.menu.bpo.IMenuBPO;
import com.qian.fang.ho.menu.entity.MenuEntity;
import com.qian.fang.ho.menu.service.IMenuService;

/**
 * @ClassName:MenuServiceImpl
 * @Description:
 * @author owen 于 2020年2月6日 下午10:09:09
 */

public class MenuServiceImpl implements IMenuService {
	
	private IMenuBPO menuBPO;
	
	/**
	 * @return menuBPO
	 */
	public IMenuBPO getMenuBPO() {
		return menuBPO;
	}

	/**
	 * @param menuBPO 要设置的 menuBPO
	 */
	public void setMenuBPO(IMenuBPO menuBPO) {
		this.menuBPO = menuBPO;
	}

	/**
	 *
	 * @param menu
	 * @see com.qian.fang.ho.menu.service.IMenuService#addMenu(com.qian.fang.ho.menu.entity.MenuEntity)
	 */
	public void addMenu(MenuEntity menu) {
		this.menuBPO.addMenu(menu);
	}

	public List<MenuEntity> findAllMenus() {
		return this.menuBPO.findAllMenus();
	}

}
