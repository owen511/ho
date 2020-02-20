/**
 * @Title: MenuEntity.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年2月6日 下午8:25:53
 * @author owen
 */
 

package com.qian.fang.ho.menu.entity;

import java.io.Serializable;

import com.qian.fang.ho.common.entity.HOBaseEntity;

/**
 * @ClassName:MenuEntity
 * @Description:
 * @author owen 于 2020年2月6日 下午8:25:53
 */

public class MenuEntity extends HOBaseEntity implements Serializable {

	/**
	 * @Fields serialVersionUID : Description
	 */
	
	private static final long serialVersionUID = 2170098312653665290L;
	
	//菜单ID PK
	private int menuid;
	
	//编码
	private String code;
	
	//名称
	private String name;
	
	private int version;
	
	//请求路径
	private String url;
	
	//菜单级次
	private int levelno;
	
	//是否末级
	private int isleaf;
	
	//上级ID
	private int superid;

	/**
	 * @return menuid
	 */
	public int getMenuid() {
		return menuid;
	}

	/**
	 * @param menuid 要设置的 menuid
	 */
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}

	/**
	 * @return code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code 要设置的 code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return version
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * @param version 要设置的 version
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/**
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url 要设置的 url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return levelno
	 */
	public int getLevelno() {
		return levelno;
	}

	/**
	 * @param levelno 要设置的 levelno
	 */
	public void setLevelno(int levelno) {
		this.levelno = levelno;
	}

	/**
	 * @return isleaf
	 */
	public int getIsleaf() {
		return isleaf;
	}

	/**
	 * @param isleaf 要设置的 isleaf
	 */
	public void setIsleaf(int isleaf) {
		this.isleaf = isleaf;
	}

	/**
	 * @return superid
	 */
	public int getSuperid() {
		return superid;
	}

	/**
	 * @param superid 要设置的 superid
	 */
	public void setSuperid(int superid) {
		this.superid = superid;
	}
	
}
