package com.zkx.pojo;

import java.io.Serializable;

public class BankCard implements Serializable {
	private int id;//主键
	private String userNum;//会员编号
	private String cardNum;//银行卡编号
	private String bankName;//银行名称
	private String opening_bank;//开户行
	private String regTime;//绑定时间

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

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getOpening_bank() {
		return opening_bank;
	}

	public void setOpening_bank(String opening_bank) {
		this.opening_bank = opening_bank;
	}

	public String getRegTime() {
		return regTime;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	@Override
	public String toString() {
		return "BankCard{" +
				"id=" + id +
				", userNum='" + userNum + '\'' +
				", cardNum='" + cardNum + '\'' +
				", bankName='" + bankName + '\'' +
				", opening_bank='" + opening_bank + '\'' +
				", regTime='" + regTime + '\'' +
				'}';
	}
}
