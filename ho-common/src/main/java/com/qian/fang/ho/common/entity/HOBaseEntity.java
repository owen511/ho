/**
 * @Title: HOBaseEntity.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月24日  owen
 */

package com.qian.fang.ho.common.entity;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;

/**
 * 公共底层实体类.
 * 
 * @ClassName: HOBaseEntity
 * @Description: Description of this class
 * @author owen 于 2019年11月24日 下午8:59:15
 */

public class HOBaseEntity implements Serializable {

	/**
	 * @Fields serialVersionUID : Description
	 */

	private static final long serialVersionUID = 8696358953901586527L;

	// 唯一标识(格式 8-4-4-4-12).
	private String uuid;

	// 区划.
	private String govid;

	// 年度.
	private int govyear;

	// 备注说明.
	private String remark;

	/**
	 * @return uuid
	 */
	public String getUuid() {
		uuid = UUID.randomUUID().toString().toUpperCase().replaceAll("-", "");
		return uuid;
	}

	/**
	 * @param uuid 要设置的 uuid
	 */
	public void setuuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return govid
	 */
	public String getGovid() {
		return govid;
	}

	/**
	 * @param govid 要设置的 govid
	 */
	public void setGovid(String govid) {
		this.govid = govid;
	}

	/**
	 * @return govyear
	 */
	public int getGovyear() {
		return govyear;
	}

	/**
	 * @param govyear 要设置的 govyear
	 */
	public void setGovyear(int govyear) {
		this.govyear = govyear;
	}

	/**
	 * @return remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark 要设置的 remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		HOBaseEntity entity = new HOBaseEntity();
		return getFieldValueByName(entity);
	}

	/**
	 * 输出属性和属性值.
	 * @param entity
	 * @return
	 */
	public String getFieldValueByName(HOBaseEntity entity) {
		StringBuffer sbf = new StringBuffer();
		// 获取所有属性
		Field[] fields = entity.getClass().getDeclaredFields();
		for (Field field : fields) {
			String fieldName = field.getName();// 属性名
			if (fieldName.equals("serialVersionUID")) {
				continue;
			}
			String firstLetter = fieldName.substring(0, 1).toUpperCase();
			String getter = "get" + firstLetter + fieldName.substring(1);// 属性getter方法
			Object value = null;
			try {
				Method method = entity.getClass().getMethod(getter, new Class[] {});
				value = method.invoke(entity, new Object[] {});
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			sbf.append(fieldName).append("=").append(value).append("\t");
		}
		return sbf.toString();
	}
}
