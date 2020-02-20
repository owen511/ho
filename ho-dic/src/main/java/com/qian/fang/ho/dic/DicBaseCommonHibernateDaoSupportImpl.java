/**
 * @Title: DicBaseCommonHibernateDaoSupportImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月8日 下午5:45:10
 * @author owen
 */

package com.qian.fang.ho.dic;

import com.qian.fang.ho.common.dao.impl.CommonHibernateDaoSupportImpl;
import com.qian.fang.ho.common.uitl.DateFormatUtil;

/**
 * 数据字典公共数据访问实现类.
 * @ClassName:DicBaseCommonHibernateDaoSupportImpl
 * @Description:
 * @author owen 于 2020年2月8日 下午5:45:10
 */

public class DicBaseCommonHibernateDaoSupportImpl<T extends DicBaseEntity> extends CommonHibernateDaoSupportImpl<T>
		implements IDicBaseCommonHibernateDaoSupport<T> {

	@Override
	public void save(T t) {
		t.setGovyear(DateFormatUtil.getYear());
		super.save(t);
	}
}
