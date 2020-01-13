/**
 * @Title: CommonHibernateDaoSupportImpl.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月25日  owen
 */
 

package com.qian.fang.ho.common.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.qian.fang.ho.common.dao.ICommonHibernateDaoSupport;
import com.qian.fang.ho.common.entity.HOBaseEntity;
import com.qian.fang.ho.common.uitl.DateFormatUtil;

/**
 * 公共数据访问实现类.
 * @ClassName: CommonHibernateDaoSupportImpl
 * @Description: Description of this class
 * @author owen 于 2019年11月25日 下午2:00:26
 * @param <T>
 */

public class CommonHibernateDaoSupportImpl<T extends HOBaseEntity> extends HibernateDaoSupport implements ICommonHibernateDaoSupport<T>{

	public void clear() {
		getHibernateTemplate().clear();
	}
	
	public void flush() {
		getHibernateTemplate().flush();;
	}
	
	/**
	 * 生成UUID.
	 * @return
	 */
	private String getRandomUUID() {
		return UUID.randomUUID().toString().toUpperCase().replaceAll("-", "");
	}

	public void save(T t) {
		t.setuuid(getRandomUUID());
		t.setGovyear(DateFormatUtil.getYear());
		getHibernateTemplate().save(t);
	}

	public void save(List<T> ts) {
		for(T t : ts) {
			save(t);
		}
	}

	public List<T> delete(List<T> ts) {
		clear();
		flush();
		getHibernateTemplate().deleteAll(ts);
		return ts;
	}

	public List<T> update(List<T> ts) {
		List<T> result = new ArrayList<T>();
		clear();
		flush();
		for (T t : ts) {
			update(t);
			result.add(t);
		}
		return result;
	}

	public T update(T t) {
		getHibernateTemplate().update(t);
		return t;
	}

	public List<T> findAll(String hql) {
		return find(hql, new Object[] {});
	}

	public List<T> find(T t) {
		return getHibernateTemplate().findByExample(t);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<T> find(String hql, Object... values) {
		return (List<T>) getHibernateTemplate().find(hql, values);
	}
	

	@SuppressWarnings("unchecked")
	public T findById(T t, Serializable id) {
		return (T) getHibernateTemplate().get(t.getClass(), id);
	}

	


}
