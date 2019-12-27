/**
 * @Title: IDicColumnBPO.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月25日  owen
 */
 

package com.qian.fang.ho.dic.column.bpo;

import com.qian.fang.ho.dic.column.entity.DicColumnEntity;

/**
 * 表字段注册业务处理接口.
 * @ClassName: IDicColumnBPO
 * @Description: Description of this class
 * @author owen 于 2019年11月25日 下午11:08:38
 */

public interface IDicColumnBPO {

	/**
	 ** 新增表字段.
	 * @param dicColumnEntity 表字段实体类.
	 */
	void saveDicColumn(DicColumnEntity dicColumnEntity);
}
