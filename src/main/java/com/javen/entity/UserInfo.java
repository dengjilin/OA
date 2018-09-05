package com.javen.entity;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable{
	private static final long serialVersionUID = 1L;
    private String id;
    private String account;
    private String password;
    private String realName;
    private int sex;
    private int age;
    private String mobile;
    private String email;
    private String  birthday;
    private String entryTime;
    private int status;
	public UserInfo() {
		super();
	}
	public UserInfo(String id, String account, String password, String realName, int sex, int age, String mobile,
			String email, String birthday, String entryTime, int status) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.realName = realName;
		this.sex = sex;
		this.age = age;
		this.mobile = mobile;
		this.email = email;
		this.birthday = birthday;
		this.entryTime = entryTime;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", account=" + account + ", password=" + password + ", realName=" + realName
				+ ", sex=" + sex + ", age=" + age + ", mobile=" + mobile + ", email=" + email + ", birthday=" + birthday
				+ ", entryTime=" + entryTime + ", status=" + status + "]";
	}
    
}
