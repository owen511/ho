/**
 * @Title: CommonHibernateDaoSupportImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月25日  owen
 */
 

package com.qian.fang.ho.common.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.qian.fang.ho.common.dao.ICommonHibernateDaoSupport;

/**
 * 公共数据访问实现类.
 * @ClassName: CommonHibernateDaoSupportImpl
 * @Description: Description of this class
 * @author owen 于 2019年11月25日 下午2:00:26
 * @param <T>
 */

public class CommonHibernateDaoSupportImpl<T> extends HibernateDaoSupport implements ICommonHibernateDaoSupport<T>{

	public void clear() {
		this.getHibernateTemplate().clear();
	}
	
	public void flush() {
		this.getHibernateTemplate().flush();;
	}

	public void save(T t) {
		this.getHibernateTemplate().save(t);
	}

	public void save(List<T> ts) {
		for(T t : ts) {
			this.getHibernateTemplate().save(t);
		}
	}

	public List<T> delete(List<T> ts) {
		this.clear();
		this.flush();
		this.getHibernateTemplate().deleteAll(ts);
		return ts;
	}

	public List<T> update(List<T> ts) {
		List<T> result = new ArrayList<T>();
		this.clear();
		this.flush();
		for (T t : ts) {
			this.getHibernateTemplate().update(t);
			result.add(t);
		}
		return result;
	}

	public T update(T t) {
		this.getHibernateTemplate().update(t);
		return t;
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<T> findAll(String hql) {
		return (List<T>) this.getHibernateTemplate().find(hql, new Object[] {});
	}

	public List<T> find(T t) {
		return null;
	}

	public List<T> find(String hql) {
		return null;
	}



}
