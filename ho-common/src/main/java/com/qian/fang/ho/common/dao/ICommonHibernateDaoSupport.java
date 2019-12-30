/**
 * @Title: ICommonHibernateDaoSupport.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月25日  owen
 */
 

package com.qian.fang.ho.common.dao;

import java.util.List;

/**
 * 公共数据访问接口.
 * @ClassName: ICommonHibernateDaoSupport
 * @Description: Description of this class
 * @author owen 于 2019年11月25日 下午2:00:59
 */

public interface ICommonHibernateDaoSupport<T> {
	
	/**
	 * 清空.
	 */
	void clear();
	
	/**
	 * 清空.
	 */
	void flush();
	
	/**
	 * 保存.
	 * @param t
	 */
	void save(T t);
	
	/**
	 * 保存(批量).
	 * @param ts
	 */
	void save(List<T> ts);
	
	/**
	 * 删除(批量).
	 * @param ts
	 * @return
	 */
	List<T> delete(List<T> ts);
	
	/**
	 * 修改(批量).
	 * @param ts
	 * @return
	 */
	List<T> update(List<T> ts);
	
	/**
	 * 修改.
	 * @param t
	 * @return
	 */
	T update(T t);

}
