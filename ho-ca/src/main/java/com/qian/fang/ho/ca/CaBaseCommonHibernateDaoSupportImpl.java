/**
 * @Title: CaBaseCommonHibernateDaoSupportImpl.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月8日 下午5:42:54
 * @author owen
 */
 

package com.qian.fang.ho.ca;

import com.qian.fang.ho.common.dao.impl.CommonHibernateDaoSupportImpl;
import com.qian.fang.ho.common.uitl.DateFormatUtil;

/**
 * 用户角色公共数据访问实现类.
 * @ClassName:CaBaseCommonHibernateDaoSupportImpl
 * @Description:
 * @author owen 于 2020年2月8日 下午5:42:54
 */

public class CaBaseCommonHibernateDaoSupportImpl<T extends CaBaseEntity> extends CommonHibernateDaoSupportImpl<T>
		implements ICaBaseCommonHibernateDaoSupport<T> {

	@Override
	public void save(T t) {
		t.setCreatedate(DateFormatUtil.getCurrentDate());
		super.save(t);
	}
}
