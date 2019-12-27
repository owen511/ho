/**
 * @Title: DicColumnEntity.java
 * @Copyright (C) 2019 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2019年11月25日  owen
 */
 

package com.qian.fang.ho.dic.column.entity;

import com.qian.fang.ho.dic.DicBaseEntity;
import com.qian.fang.ho.dic.table.entity.DicTableEntity;

/**
 * 表字段注册实体类.
 * @ClassName: DicColumnEntity
 * @Description: Description of this class
 * @author owen 于 2019年11月25日 下午2:55:37
 */

public class DicColumnEntity extends DicBaseEntity{

	/**
	 * @Fields serialVersionUID : Description
	 */
	
	private static final long serialVersionUID = -4413189866144815640L;
	
	//字段ID.
    private int columnid;

    //字段编码.
    private String columncode;

    //字段名称.
    private String name;

    //数据类型.
    private char datatype;

    //数据长度.
    private int datalength;

    //小数位数.
    private short scale;

    //编码格式.
    private String codeformat;

    //筛选条件.
    private String filter;
    
    //是否可为空0-不能为空1-可为空.
    private short nullable;

    //缺省值.
    private String defaultvalue;
    
    //列与表 多对一.
    private DicTableEntity tableEntity;

	/**
	 * @return columnid
	 */
	public int getColumnid() {
		return columnid;
	}

	/**
	 * @param columnid 要设置的 columnid
	 */
	public void setColumnid(int columnid) {
		this.columnid = columnid;
	}

	/**
	 * @return columncode
	 */
	public String getColumncode() {
		return columncode;
	}

	/**
	 * @param columncode 要设置的 columncode
	 */
	public void setColumncode(String columncode) {
		this.columncode = columncode;
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
	public char getDatatype() {
		return datatype;
	}

	/**
	 * @param datatype 要设置的 datatype
	 */
	public void setDatatype(char datatype) {
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
	public short getScale() {
		return scale;
	}

	/**
	 * @param scale 要设置的 scale
	 */
	public void setScale(short scale) {
		this.scale = scale;
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
	 * @return filter
	 */
	public String getFilter() {
		return filter;
	}

	/**
	 * @param filter 要设置的 filter
	 */
	public void setFilter(String filter) {
		this.filter = filter;
	}

	/**
	 * @return nullable
	 */
	public short getNullable() {
		return nullable;
	}

	/**
	 * @param nullable 要设置的 nullable
	 */
	public void setNullable(short nullable) {
		this.nullable = nullable;
	}

	/**
	 * @return defaultvalue
	 */
	public String getDefaultvalue() {
		return defaultvalue;
	}

	/**
	 * @param defaultvalue 要设置的 defaultvalue
	 */
	public void setDefaultvalue(String defaultvalue) {
		this.defaultvalue = defaultvalue;
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

}
