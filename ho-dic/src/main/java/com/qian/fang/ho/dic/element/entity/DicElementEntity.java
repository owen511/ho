/**
 * @Title: DicElementEntity.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月26日  owen
 */
 

package com.qian.fang.ho.dic.element.entity;

import java.io.Serializable;
import java.util.Date;

import com.qian.fang.ho.dic.DicBaseEntity;
import com.qian.fang.ho.dic.table.entity.DicTableEntity;

/**
 * 要素定义实体类.
 * @author owen 于 2019年11月26日 下午5:22:04
 */

public class DicElementEntity extends DicBaseEntity implements Serializable {

	/**
	 * @Fields serialVersionUID : Description
	 */
	
	private static final long serialVersionUID = 395743489971271571L;
	
	//PK.
    private int elementid;
	
	//数据元编码.
    private String elementcode;

    //数据元名称.
    private String name;

    //数据类型.
    private String datatype;

    //数据长度.
    private int datalength;

    //小数位数.
    private int scale;

    //代码类型.
    private char codetype;

    //代码格式 如果是层码,则格式类似: 1-2-3-4
    private String codeformat;

    //使用状态.
    private int status;

    //数据元类别 1-物理数据元2-逻辑数据元.
    private short elementtype;

    //表编码或视图编码.
    private String tablecode;

    //启用日期
    private Date startdate;

    //停用日期
    private Date enddate;
    
    //数据源要素与表 多对一.
    private DicTableEntity tableEntity;

	/**
	 * @return elementid
	 */
	public int getElementid() {
		return elementid;
	}

	/**
	 * @param elementid 要设置的 elementid
	 */
	public void setElementid(int elementid) {
		this.elementid = elementid;
	}

	/**
	 * @return elementcode
	 */
	public String getElementcode() {
		return elementcode;
	}

	/**
	 * @param elementcode 要设置的 elementcode
	 */
	public void setElementcode(String elementcode) {
		this.elementcode = elementcode;
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
	 * @return datatype
	 */
	public String getDatatype() {
		return datatype;
	}

	/**
	 * @param datatype 要设置的 datatype
	 */
	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	/**
	 * @return datalength
	 */
	public int getDatalength() {
		return datalength;
	}

	/**
	 * @param datalength 要设置的 datalength
	 */
	public void setDatalength(int datalength) {
		this.datalength = datalength;
	}

	/**
	 * @return scale
	 */
	public int getScale() {
		return scale;
	}

	/**
	 * @param scale 要设置的 scale
	 */
	public void setScale(int scale) {
		this.scale = scale;
	}

	/**
	 * @return codetype
	 */
	public char getCodetype() {
		return codetype;
	}

	/**
	 * @param codetype 要设置的 codetype
	 */
	public void setCodetype(char codetype) {
		this.codetype = codetype;
	}

	/**
	 * @return codeformat
	 */
	public String getCodeformat() {
		return codeformat;
	}

	/**
	 * @param codeformat 要设置的 codeformat
	 */
	public void setCodeformat(String codeformat) {
		this.codeformat = codeformat;
	}

	/**
	 * @return status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status 要设置的 status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return elementtype
	 */
	public short getElementtype() {
		return elementtype;
	}

	/**
	 * @param elementtype 要设置的 elementtype
	 */
	public void setElementtype(short elementtype) {
		this.elementtype = elementtype;
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
	 * @return startdate
	 */
	public Date getStartdate() {
		return startdate;
	}

	/**
	 * @param startdate 要设置的 startdate
	 */
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	/**
	 * @return enddate
	 */
	public Date getEnddate() {
		return enddate;
	}

	/**
	 * @param enddate 要设置的 enddate
	 */
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	/**
	 * @return tableEntity
	 */
	public DicTableEntity getTableEntity() {
		return tableEntity;
	}

	/**
	 * @param tableEntity 要设置的 tableEntity
	 */
	public void setTableEntity(DicTableEntity tableEntity) {
		this.tableEntity = tableEntity;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(this.getFieldValueByName());
		return buffer.append(super.toString()).toString();
	}
}
