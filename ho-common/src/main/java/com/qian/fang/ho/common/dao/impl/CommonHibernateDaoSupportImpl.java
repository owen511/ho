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

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.qian.fang.ho.common.dao.ICommonHibernateDaoSupport;
import com.qian.fang.ho.common.entity.HOBaseEntity;

/**
 * 公共数据访问实现类.
 * @ClassName: CommonHibernateDaoSupportImpl
 * @Description: Description of this class
 * @author owen 于 2019年11月25日 下午2:00:26
 * @param <T>
 */

public class CommonHibernateDaoSupportImpl<T extends HOBaseEntity> extends HibernateDaoSupport implements ICommonHibernateDaoSupport<T>{

	private static Logger logger= Logger.getLogger(CommonHibernateDaoSupportImpl.class);
	
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
		t.setUuid(getRandomUUID());
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
	
	public T find(T t, String paramName, String paramValue) {
		// hibernate5 使用占位符时，需要标明参数序号，从0开始:eg: param1=?0,param2=?1
		String hql = "from " + t.getClass().getSimpleName() + " where " + paramName + "=?0";
		List<T> result = find(hql, new Object[] { paramValue });
		if (result.isEmpty()) {
			logger.info("按条件【" + paramName + "】=【" + paramValue + "】查询,没有找到符合的数据......");
			return t;
		} else {
			return result.get(0);
		}
	}

	public List<T> find(T t, String paramNames[], Object paramValues[]) {
		StringBuffer paramsWhere = new StringBuffer();
		String filterSql = null;
		String hql = "from " + t.getClass().getSimpleName();
		if (null != paramNames && null != paramValues) {
			if (paramNames.length != paramValues.length) {
				logger.info("参数和参数值个数不匹配......");
				return new ArrayList<T>();
			}
			// hibernate5 使用占位符时，需要标明参数序号，从0开始:eg: param1=?0,param2=?1
			int i = 0;
			for (String paramName : paramNames) {
				paramsWhere.append(paramName).append("=?").append(i).append(" and ");
				i++;
			}
			filterSql = paramsWhere.substring(0, paramsWhere.length() - 5);
			hql = hql + " where " + filterSql;
		}
		List<T> result = this.find(hql, paramValues);
		if (result.isEmpty()) {
			StringBuffer values = new StringBuffer();
			for (Object paramValue : paramValues) {
				values.append(paramValue).append(",");
			}
			logger.info("按条件【" + filterSql + "】=【" + values.substring(0, values.length() - 1) + "】查询,没有找到符合的数据......");
			return new ArrayList<T>();
		} else {
			return result;
		}
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
