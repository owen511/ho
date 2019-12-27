/**
 * @Title: IDicColumnService.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月25日  owen
 */
 

package com.qian.fang.ho.dic.column.service;

import com.qian.fang.ho.dic.column.entity.DicColumnEntity;

/**
 * 表字段注册服务接口.
 * @ClassName: IDicColumnService
 * @Description: Description of this class
 * @author owen 于 2019年11月25日 下午11:09:34
 */

public interface IDicColumnService {
	
	/**
	 ** 新增表字段.
	 * @param dicColumnEntity 表字段实体类.
	 */
	void saveDicColumn(DicColumnEntity dicColumnEntity);

}
