package com.zkx.mapper;

import com.zkx.pojo.BankCard;

import java.util.List;

public interface BankCardMapper {
	public void addBankCard(BankCard bankCard);
	public void delBankCard(String cardNum);
	public List<BankCard> selAllCardByUserNum(String userNum);
}
