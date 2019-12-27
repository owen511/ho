/**
 * @Title: IDicTableService.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月24日  owen
 */
 

package com.qian.fang.ho.dic.table.service;

import com.qian.fang.ho.dic.table.entity.DicTableEntity;

/**
 * 	服务接口.
 * @ClassName: IDicTableService
 * @Description: Description of this class
 * @author owen 于 2019年11月24日 下午3:13:03
 */

public interface IDicTableService {

	/**
	 * 	表注册.
	 * @param dicTableEntity 业务实体.
	 */
	void addDicTable(DicTableEntity dicTableEntity);
}
