package com.haoq.module.one.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * CM_USER 实体类
 * @author HaoQi
 */
@Entity
@Table(name = "CM_USER")
public class CmUser implements java.io.Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6480227156970310447L;
	private String userId;
	private String loginName;
	private String funOrgId;
	private String accountPassword;
	private String name;
	private String sex;
	private Date birthday;

	/** default constructor */
	public CmUser() {
	}

	/** minimal constructor */
	public CmUser(String userId) {
		this.userId = userId;
	}

	/** full constructor */
	public CmUser(String userId, String loginName, String funOrgId,
			String accountPassword, String name, String sex, Date birthday) {
		this.userId = userId;
		this.loginName = loginName;
		this.funOrgId = funOrgId;
		this.accountPassword = accountPassword;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
	}

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "USER_ID", unique = true, nullable = false, length = 36)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "LOGIN_NAME", length = 128)
	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	@Column(name = "FUN_ORG_ID", length = 36)
	public String getFunOrgId() {
		return this.funOrgId;
	}

	public void setFunOrgId(String funOrgId) {
		this.funOrgId = funOrgId;
	}

	@Column(name = "ACCOUNT_PASSWORD", length = 50)
	public String getAccountPassword() {
		return this.accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	@Column(name = "NAME", length = 60)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "SEX", length = 1)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "BIRTHDAY", length = 7)
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}