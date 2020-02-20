/**
 * @Title: IMenuBPO.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月6日 下午9:57:40
 * @author owen
 */
 

package com.qian.fang.ho.menu.bpo;

import java.util.List;

import com.qian.fang.ho.menu.entity.MenuEntity;

/**
 * @ClassName:IMenuBPO
 * @Description:
 * @author owen 于 2020年2月6日 下午9:57:40
 */

public interface IMenuBPO {
	
	/**
	 * 新增菜单.
	 * @param menu
	 */
	void addMenu(MenuEntity menu);
	
	/**
	 * 查询所有菜单.
	 * @return List<MenuEntity>
	 */
	List<MenuEntity> findAllMenus();

}
