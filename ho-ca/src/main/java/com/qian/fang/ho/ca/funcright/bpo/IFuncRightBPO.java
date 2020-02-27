/**
 * @Title: IFuncRightBPO.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月20日 下午1:56:34
 * @author owen
 */
 

package com.qian.fang.ho.ca.funcright.bpo;

import com.qian.fang.ho.ca.funcright.entity.FuncRightEntity;

/**
 * @ClassName:IFuncRightBPO
 * @Description:
 * @author owen 于 2020年2月20日 下午1:56:34
 */

public interface IFuncRightBPO {

	FuncRightEntity findById(int id);
}
