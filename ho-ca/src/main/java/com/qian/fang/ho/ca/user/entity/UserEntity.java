/**
 * @Title: UserEntity.java
 * @Copyright (C) 2020 前坊软件
 * @Description:
 * @Revision History:
 * @Revision 1.0 2020年1月16日  owen
 */
 

package com.qian.fang.ho.ca.user.entity;

import java.io.Serializable;

import com.qian.fang.ho.ca.CaBaseEntity;

/**
 * 用户实体类.
 * @author owen 于 2020年1月16日 下午6:02:07
 */

public class UserEntity extends CaBaseEntity implements Serializable{

	/**
	 * @Fields serialVersionUID : Description
	 */
	
	private static final long serialVersionUID = 3070871834647075902L;
	
	//用户ID
	private int userid;
	
	//用户密码
	private String password;
	
	//状态
	private int state;
	
	//类型
	private int type;
	
	//证件ID
	private String cardno;
	
	//创建日期
	private String createdate;
	
	//修改日期
	private String updatedate;

	/**
	 * @return userid
	 */
	public int getUserid() {
		return userid;
	}

	/**
	 * @param userid 要设置的 userid
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password 要设置的 password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state 要设置的 state
	 */
	public void setState(int state) {
		this.state = state;
	}

	/**
	 * @return type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type 要设置的 type
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return cardno
	 */
	public String getCardno() {
		return cardno;
	}

	/**
	 * @param cardno 要设置的 cardno
	 */
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	/**
	 * @return createdate
	 */
	public String getCreatedate() {
		return createdate;
	}

	/**
	 * @param createdate 要设置的 createdate
	 */
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	/**
	 * @return updatedate
	 */
	public String getUpdatedate() {
		return updatedate;
	}

	/**
	 * @param updatedate 要设置的 updatedate
	 */
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}
	

}
