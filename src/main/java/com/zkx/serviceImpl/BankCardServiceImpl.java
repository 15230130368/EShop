package com.zkx.serviceImpl;

import com.zkx.mapper.BankCardMapper;
import com.zkx.pojo.BankCard;
import com.zkx.service.BankCardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("bankCardService")
public class BankCardServiceImpl implements BankCardService {
	@Resource
	private BankCardMapper bankCardMapper;
	public void addBankCard(BankCard bankCard) {
		bankCardMapper.addBankCard(bankCard);
	}

	public void delBankCard(String cardNum) {
		bankCardMapper.delBankCard(cardNum);
	}

	public List<BankCard> selAllCardByUserNum(String userNum) {
		return bankCardMapper.selAllCardByUserNum(userNum);
	}
}
