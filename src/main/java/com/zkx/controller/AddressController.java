package com.zkx.controller;

import com.zkx.mapper.UserMapper;
import com.zkx.pojo.Address;
import com.zkx.pojo.City;
import com.zkx.pojo.Province;
import com.zkx.pojo.User;
import com.zkx.service.AddressService;
import com.zkx.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class AddressController {
	@Resource
	private AddressService addressService;
	@Resource
	private UserService userService;

	@RequestMapping("/selAllProvince")
	public ModelAndView selAllProvince()throws Exception{
		ModelAndView mav = new ModelAndView();
		List<Province> list = addressService.selAllProvince();
		mav.getModel().put("provinces",list);
		mav.setViewName("/WEB-INF/user/addAddress.jsp");
		return mav;
	}
	@RequestMapping("/selAllCityByPid")
	public @ResponseBody List<City> selAllCityByPid(int pid){
		return addressService.selAllCityByPid(pid);
	}
	@RequestMapping("/addAddress")
	public ModelAndView addAddress(Address address)throws Exception{
		ModelAndView mav = new ModelAndView();
		if (address.getProvince()==null||address.getCity()==null){
			mav.getModel().put("message","请选择正确是省份和市区");
			mav.setViewName("forward:selAllProvince");
			return mav;
		}else if (address.getDetail().equals("")){
			mav.getModel().put("message","请填写详细地址");
			mav.setViewName("forward:selAllProvince");
			return mav;
		}
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String regTime = format.format(new Date());
		address.setRegTime(regTime);
		addressService.addAddress(address);
		List<Address> list = addressService.selAllAddressByUserNum(address.getUserNum());
		if (list.size()==1){
			User user = new User();
			user.setUserNum(address.getUserNum());
			user = userService.selUser(user);
			user.setMain_address_id(address.getId());
			userService.updateUser(user);
		}
		mav.getModel().put("message","添加成功");
		mav.setViewName("forward:selAllProvince");
		return mav;
	}
}
