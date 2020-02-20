/**
 * @Title: DicTableEntity.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月24日  owen
 */

package com.qian.fang.ho.dic.table.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.qian.fang.ho.dic.DicBaseEntity;
import com.qian.fang.ho.dic.column.entity.DicColumnEntity;
import com.qian.fang.ho.dic.element.entity.DicElementEntity;

/**
 * 表注册实体类.
 * @ClassName: DicTableEntity
 * @Description: Description of this class
 * @author owen 于 2019年11月24日 下午3:06:18
 */

public class DicTableEntity extends DicBaseEntity implements Serializable{

	/**
	 * @Fields serialVersionUID : Description
	 */

	private static final long serialVersionUID = -8239048230449748025L;
	
	//流水PK.
	private int tableid;

	//表编码.
	private String tablecode;

	//表名.
	private String name;

	//表类型.
	private char tabletype;

	//关键字段名.
	private String keycolumn;

	//编码字段名.
	private String codecolumn;

	//名称字段名.
	private String namecolumn;

	//上级流水号字段名.
	private String supercolumn;

	//级次字段.
	private String levelnocolumn;

	//叶子字段.
	private String isleafcolumn;

	//状态字段.
	private String statuscolumn;

	//启用日期字段.
	private String startdatecolumn;

	//停用日期字段.
	private String enddatecolumn;
	
	//列集合 (一张表有多个列,一对多). 
	private Set<DicColumnEntity> columnsSet = new HashSet<DicColumnEntity>();
	
	//数据源要素集合 (一张表有对应多个数据项要素,一对多).
	private Set<DicElementEntity> elementsSet = new HashSet<DicElementEntity>();
	
	/**
	 * @return tableid
	 */
	public int getTableid() {
		return tableid;
	}

	/**
	 * @param tableid 要设置的 tableid
	 */
	public void setTableid(int tableid) {
		this.tableid = tableid;
	}

	/**
	 * @return tablecode
	 */
	public String getTablecode() {
		return tablecode;
	}

	/**
	 * @param tablecode 要设置的 tablecode
	 */
	public void setTablecode(String tablecode) {
		this.tablecode = tablecode;
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
	 * @return tabletype
	 */
	public char getTabletype() {
		return tabletype;
	}

	/**
	 * @param tabletype 要设置的 tabletype
	 */
	public void setTabletype(char tabletype) {
		this.tabletype = tabletype;
	}

	/**
	 * @return keycolumn
	 */
	public String getKeycolumn() {
		return keycolumn;
	}

	/**
	 * @param keycolumn 要设置的 keycolumn
	 */
	public void setKeycolumn(String keycolumn) {
		this.keycolumn = keycolumn;
	}

	/**
	 * @return codecolumn
	 */
	public String getCodecolumn() {
		return codecolumn;
	}

	/**
	 * @param codecolumn 要设置的 codecolumn
	 */
	public void setCodecolumn(String codecolumn) {
		this.codecolumn = codecolumn;
	}

	/**
	 * @return namecolumn
	 */
	public String getNamecolumn() {
		return namecolumn;
	}

	/**
	 * @param namecolumn 要设置的 namecolumn
	 */
	public void setNamecolumn(String namecolumn) {
		this.namecolumn = namecolumn;
	}

	/**
	 * @return supercolumn
	 */
	public String getSupercolumn() {
		return supercolumn;
	}

	/**
	 * @param supercolumn 要设置的 supercolumn
	 */
	public void setSupercolumn(String supercolumn) {
		this.supercolumn = supercolumn;
	}

	/**
	 * @return levelnocolumn
	 */
	public String getLevelnocolumn() {
		return levelnocolumn;
	}

	/**
	 * @param levelnocolumn 要设置的 levelnocolumn
	 */
	public void setLevelnocolumn(String levelnocolumn) {
		this.levelnocolumn = levelnocolumn;
	}

	/**
	 * @return isleafcolumn
	 */
	public String getIsleafcolumn() {
		return isleafcolumn;
	}

	/**
	 * @param isleafcolumn 要设置的 isleafcolumn
	 */
	public void setIsleafcolumn(String isleafcolumn) {
		this.isleafcolumn = isleafcolumn;
	}

	/**
	 * @return statuscolumn
	 */
	public String getStatuscolumn() {
		return statuscolumn;
	}

	/**
	 * @param statuscolumn 要设置的 statuscolumn
	 */
	public void setStatuscolumn(String statuscolumn) {
		this.statuscolumn = statuscolumn;
	}

	/**
	 * @return startdatecolumn
	 */
	public String getStartdatecolumn() {
		return startdatecolumn;
	}

	/**
	 * @param startdatecolumn 要设置的 startdatecolumn
	 */
	public void setStartdatecolumn(String startdatecolumn) {
		this.startdatecolumn = startdatecolumn;
	}

	/**
	 * @return enddatecolumn
	 */
	public String getEnddatecolumn() {
		return enddatecolumn;
	}

	/**
	 * @param enddatecolumn 要设置的 enddatecolumn
	 */
	public void setEnddatecolumn(String enddatecolumn) {
		this.enddatecolumn = enddatecolumn;
	}

	/**
	 * @return columns
	 */
	public Set<DicColumnEntity> getColumnsSet() {
		return columnsSet;
	}

	/**
	 * @param columns 要设置的 columns
	 */
	public void setColumnsSet(Set<DicColumnEntity> columnsSet) {
		this.columnsSet = columnsSet;
	}

	/**
	 * @return elementsSet
	 */
	public Set<DicElementEntity> getElementsSet() {
		return elementsSet;
	}

	/**
	 * @param elementsSet 要设置的 elementsSet
	 */
	public void setElementsSet(Set<DicElementEntity> elementsSet) {
		this.elementsSet = elementsSet;
	}
	
	@Override
	public String toString() {
//		StringBuffer buffer = new StringBuffer();
//		buffer.append(this.getFieldValueByName()).append(",");
//		return buffer.append(super.toString()).toString();
		return this.getFieldValueByNameIncludeSuper();
	}
}
