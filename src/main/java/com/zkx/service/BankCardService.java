package com.zkx.service;

import com.zkx.pojo.BankCard;

import java.util.List;

public interface BankCardService {
	public void addBankCard(BankCard bankCard);
	public void delBankCard(String cardNum);
	public List<BankCard> selAllCardByUserNum(String userNum);
}
