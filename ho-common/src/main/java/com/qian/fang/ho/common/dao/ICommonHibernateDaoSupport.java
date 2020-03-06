/**
 * @Title: ICommonHibernateDaoSupport.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月25日  owen
 */
 

package com.qian.fang.ho.common.dao;

import java.io.Serializable;
import java.util.List;

import com.qian.fang.ho.common.entity.HOBaseEntity;

/**
 * 公共数据访问接口.
 * @ClassName: ICommonHibernateDaoSupport
 * @Description: Description of this class
 * @author owen 于 2019年11月25日 下午2:00:59
 */

public interface ICommonHibernateDaoSupport<T extends HOBaseEntity> {
	
	/**
	 * 清除session.
	 */
	void clear();
	
	/**
	 * 强制提交刷新session.
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
	 * @return 实体类集合List<T>
	 */
	List<T> delete(List<T> ts);
	
	/**
	 * 修改(批量).
	 * @param ts
	 * @return 实体类集合List<T>
	 */
	List<T> update(List<T> ts);
	
	/**
	 * 修改.
	 * @param t
	 * @return 实体类T
	 */
	T update(T t);
	
	/**
	 * 查找所有.
	 * @param hql
	 * @return 实体类集合List<T>
	 */
	List<T> findAll(String hql);
	
	/**
	 * 查找.
	 * @param hql
	 * @param values 参数值.
	 * @return 实体类集合List<T>
	 */
	List<T> find(String hql, Object... values);
	
	/**
	 * 查找.
	 * @param t
	 * @return 实体类集合List<T>
	 */
	List<T> find(T t);
	
	/**
	 * 查找.
	 * @param t 实体类
	 * @param paramName 参数名
	 * @param paramValue 参数值.
	 * @return 实体类T
	 */
	T find(T t, String paramName, String paramValue);
	
	/**
	 * 查找.
	 * @param t 实体类变量
	 * @param paramNames 参数名
	 * @param paramValues 参数值
	 * @return 实体类集合List<T>
	 */
	List<T> find(T t, String paramNames[], Object paramValues[]);
	
	/**
	 * 查找
	 * @param t 实体类变量
	 * @param paramNames 参数名
	 * @param paramValues 参数值
	 * @param operator 操作符 and、or 取值于 RestrictionsEnum枚举类
	 * @return
	 */
	List<T> find(T t, String paramNames[], Object paramValues[], String operator);
	
	/**
	 * 查询.
	 * @param t
	 * @param id 序列化实体唯一值(PK)
	 * @return 实体类T
	 */
	T findById(T t,Serializable id);
	
}
