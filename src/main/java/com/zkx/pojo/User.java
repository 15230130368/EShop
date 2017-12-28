package com.zkx.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private int id;
	private String userNum;//会员编号
	private String username;//会员账号
	private String password;//会员密码
	private String type;//会员类型
	private String personID;//身份证
	private String birth;//生日
	private String realName;//真实姓名
	private String regTime;//注册时间
	private int integral;//积分
	private double balance;//余额
	private String email;//邮箱
	private int main_address_id;//主收货地址id
	private double consume;//消费金额
	private String telephone;//手机号

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserNum() {
		return userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPersonID() {
		return personID;
	}

	public void setPersonID(String personID) {
		this.personID = personID;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRegTime() {
		return regTime;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	public int getIntegral() {
		return integral;
	}

	public void setIntegral(int integral) {
		this.integral = integral;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMain_address_id() {
		return main_address_id;
	}

	public void setMain_address_id(int main_address_id) {
		this.main_address_id = main_address_id;
	}

	public double getConsume() {
		return consume;
	}

	public void setConsume(double consume) {
		this.consume = consume;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", userNum='" + userNum + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", type='" + type + '\'' +
				", personID='" + personID + '\'' +
				", birth='" + birth + '\'' +
				", realName='" + realName + '\'' +
				", regTime='" + regTime + '\'' +
				", integral=" + integral +
				", balance=" + balance +
				", email='" + email + '\'' +
				", main_address_id=" + main_address_id +
				", consume=" + consume +
				", telephone='" + telephone + '\'' +
				'}';
	}
}
