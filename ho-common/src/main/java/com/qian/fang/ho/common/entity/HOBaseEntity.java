/**
 * @Title: HOBaseEntity.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月24日  owen
 */

package com.qian.fang.ho.common.entity;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.persistence.MappedSuperclass;

import org.apache.log4j.Logger;

/**
 * 公共底层实体类.
 * 
 * @ClassName: HOBaseEntity
 * @Description: Description of this class
 * @author owen 于 2019年11月24日 下午8:59:15
 */
@MappedSuperclass
public abstract class HOBaseEntity {
	
	private static Logger logger= Logger.getLogger(HOBaseEntity.class);

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
		return uuid;
	}

	/**
	 * @param uuid 要设置的 uuid
	 */
	public void setUuid(String uuid) {
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
		StringBuffer buffer = new StringBuffer();
		buffer.append("uuid=").append(this.getUuid()).append(",");
		buffer.append("govid=").append(this.getGovid()).append(",");
		buffer.append("govyear=").append(this.getGovyear()).append(",");
		buffer.append("remark=").append(this.getRemark());
		return buffer.toString();
		//return this.getFieldValueByName();
	}

	/**
	 * 输出属性和属性值.
	 * @param entity
	 * @return
	 */
	public String getFieldValueByName() {
		Class<?> cls = this.getClass();
		logger.debug("获取："+cls.getName()+"类的所有属性与值");
		StringBuffer fieldsbuffer = new StringBuffer("["+cls.getSimpleName()+"]");
		// 获取所有属性
		Field[] fields = null;
		if (null != cls) {
			fields = cls.getDeclaredFields();
			for (Field field : fields) {
				String fieldName = field.getName();// 属性名
				if (fieldName.equals("serialVersionUID") || fieldName.equals("logger")) {
					continue;
				}
				String firstLetter = fieldName.substring(0, 1).toUpperCase();
				String getter = "get" + firstLetter + fieldName.substring(1);// 属性getter方法
				Object value = null;
				try {
					Method method = cls.getMethod(getter, new Class[] {});
					value = method.invoke(this, new Object[] {});
					try {
						if (field.getType().newInstance() instanceof HOBaseEntity) {
							value ="["+value+"],";
						}
					} catch (InstantiationException e) {
						//e.printStackTrace();
					}
				} catch (NoSuchMethodException e) {
					logger.error("["+this.getClass().getName()+"]中属性："+fieldName+"没有对应的getter方法");
					//e.printStackTrace();
				} catch (SecurityException e) {
					logger.error("["+this.getClass().getName()+"]中属性："+fieldName+"的getter方法时异常");
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				fieldsbuffer.append(fieldName).append("=").append(value).append(",");
			}
		}
		return fieldsbuffer.substring(0, fieldsbuffer.length()-1).toString();
	}
	
	/**
	 *  输出属性和属性值(含父类属性).
	 * @param entity
	 * @return
	 */
	public String getFieldValueByNameIncludeSuper() {
		Class<?> cls = this.getClass();
		logger.debug("获取："+cls.getName()+"类的所有属性与值");
		StringBuffer fieldsbuffer = new StringBuffer("["+cls.getSimpleName()+"]");
		// 获取所有属性
		Field[] fields = null;
		while (null != cls) {
			fields = cls.getDeclaredFields();
			for (Field field : fields) {
				String fieldName = field.getName();// 属性名
				if (fieldName.equals("serialVersionUID") || fieldName.equals("logger")) {
					continue;
				}
				String firstLetter = fieldName.substring(0, 1).toUpperCase();
				String getter = "get" + firstLetter + fieldName.substring(1);// 属性getter方法
				Object value = null;
				try {
					Method method = cls.getMethod(getter, new Class[] {});
					value = method.invoke(this, new Object[] {});
					try {
						if (field.getType().newInstance() instanceof HOBaseEntity) {
							value ="["+value+"],";
						}
					} catch (InstantiationException e) {
						//e.printStackTrace();
					}
				} catch (NoSuchMethodException e) {
					logger.error("["+this.getClass().getName()+"]中属性："+fieldName+"没有对应的getter方法");
					//e.printStackTrace();
				} catch (SecurityException e) {
					logger.error("["+this.getClass().getName()+"]中属性："+fieldName+"的getter方法时异常");
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				fieldsbuffer.append(fieldName).append("=").append(value).append(",");
			}
			cls = cls.getSuperclass();//获取父类
		}
		return fieldsbuffer.substring(0, fieldsbuffer.length()-1).toString();
	}
}
