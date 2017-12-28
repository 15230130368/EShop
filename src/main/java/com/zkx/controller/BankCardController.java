package com.zkx.controller;

import com.zkx.pojo.BankCard;
import com.zkx.pojo.User;
import com.zkx.service.BankCardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class BankCardController {
	@Resource
	private BankCardService bankCardService;
	@RequestMapping("/addBankCard")
	public ModelAndView addBankCard(BankCard bankCard)throws Exception{
		ModelAndView mav = new ModelAndView();
		if (bankCard.getUserNum()!=null){
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String regTime = format.format(new Date());
			bankCard.setRegTime(regTime);
			bankCardService.addBankCard(bankCard);
			mav.getModel().put("message","添加成功");
		}
		mav.setViewName("/WEB-INF/user/addBankCard.jsp");
		return mav;
	}
	@RequestMapping("/delBankCard")
	public ModelAndView delBankCard(String cardNum, HttpServletRequest request)throws Exception{
		ModelAndView mav = new ModelAndView();
		bankCardService.delBankCard(cardNum);
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		mav.setViewName("forward:/selAllCardByUserNum?userNum="+user.getUserNum());
		return mav;
	}
	@RequestMapping("/selAllCardByUserNum")
	public ModelAndView selAllCardByUserNum(String userNum)throws Exception{
		ModelAndView mav = new ModelAndView();
		List<BankCard> bankCards = bankCardService.selAllCardByUserNum(userNum);
		mav.getModel().put("bankCards",bankCards);
		mav.setViewName("/WEB-INF/user/showAllBankCard.jsp");
		return mav;
	}
}
