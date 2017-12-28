package com.zkx.controller;

import com.zkx.pojo.Address;
import com.zkx.pojo.User;
import com.zkx.service.AddressService;
import com.zkx.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	@Resource
	private AddressService addressService;

	/**
	 * 用户登录失败后的一个跳转
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/login")
	public void login(HttpServletRequest request, HttpServletResponse response)throws Exception{

		//--登录失败之后才执行的
		request.getRequestDispatcher("/login.jsp").forward(request,response);
	}

	/**
	 * 用户注册
	 * @param user 将保存的用户
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/reg")
	public ModelAndView reg(User user)throws Exception{
		ModelAndView mav = new ModelAndView();
		System.out.println(user);
		String num = "";
		while (true){
			Calendar calendar = Calendar.getInstance();
			num = calendar.get(Calendar.YEAR)+calendar.get(Calendar.MONTH)+calendar.get(Calendar.DATE)+"";
			for (int i=0;i<4;i++){
				Random random = new Random();
				num = num+random.nextInt(10);
			}
			String userNum = num;
			User user1 = new User();
			user1.setUserNum(userNum);
			user1 = userService.selUser(user1);
			if (user1==null){
				break;
			}
		}
		String userNum = num;
		String type = "青铜会员";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String regTime = format.format(new Date());

		user.setUserNum(userNum);
		user.setType(type);
		user.setRegTime(regTime);
		userService.addUser(user);
		mav.getModel().put("user",user);
		mav.setViewName("WEB-INF/manager/success.jsp");
		return mav;
	}

	/**
	 * 查询所有用户（分页查询）
	 * @param pageNum 当前页数
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/selAllUser")
	public ModelAndView selAllUser(Integer pageNum,HttpServletRequest request)throws Exception{
		ModelAndView mav = new ModelAndView();
		HttpSession session = request.getSession();

		int count;//记录总条数
		int pageCurrent = 10;//每页条数
		Integer num = (Integer) session.getAttribute("count");
		if (num==null){
			count = userService.selUserCount();
			session.setAttribute("count",count);
		}else {
			count = num;
		}
		int pageCount = count%pageCurrent==0?count/pageCurrent:(count/pageCurrent+1);//总页数
		if (pageNum==null){
			pageNum = 1;
		}else if (pageNum<1){
			pageNum = 1;
		}else if (pageNum>pageCount){
			pageNum = pageCount;
		}
		List<User> list = userService.selAllUser((pageNum-1)*pageCurrent,pageCurrent);
		mav.getModel().put("pageNum",pageNum);
		mav.getModel().put("pageCount",pageCount);
		mav.getModel().put("list",list);
		mav.setViewName("/WEB-INF/manager/showAllUser.jsp");
		return mav;
	}

	/**
	 * 管理员查看某个用户的所有信息
	 * @param userNum 要查的 用户的会员编号
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/manager_selUserByUserNum")
	public ModelAndView manager_selUserByUserNum(String userNum)throws Exception{
		ModelAndView mav = new ModelAndView();
		User user = new User();
		user.setUserNum(userNum);
		user = userService.selUser(user);
		mav.getModel().put("user",user);
		mav.setViewName("/WEB-INF/manager/showUserDetail.jsp");
		return mav;
	}

	/**
	 *用户查看自己信息
	 * @param userNum
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/selUserByUserNum")
	public ModelAndView selUserByUserNum(String userNum)throws Exception{
		ModelAndView mav = new ModelAndView();
		User user = new User();
		user.setUserNum(userNum);
		user = userService.selUser(user);
		List<Address> addresses = addressService.selAllAddressByUserNum(userNum);
		mav.getModel().put("user",user);
		mav.getModel().put("addresses",addresses);
		if ("商家".equals(user.getType())){
			mav.setViewName("/WEB-INF/good/showUserDetail.jsp");
		}else {
			mav.setViewName("/WEB-INF/user/showUserDetail.jsp");
		}
		return mav;
	}

	/**
	 * 根据用户名查找用户
	 * @param username 要查找的用户名
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/selUserByUsername")
	public ModelAndView selUserByUsername(String username)throws Exception{
		ModelAndView mav = new ModelAndView();
		User user = new User();
		user.setUsername(username);
		user = userService.selUser(user);
		if (user==null){
			mav.getModel().put("message","要查找的用户不存在");
		}else {
			List<User> list = new ArrayList<User>();
			list.add(user);
			mav.getModel().put("list",list);
		}
		mav.getModel().put("pageNum",1);
		mav.getModel().put("pageCount",1);
		mav.setViewName("/WEB-INF/manager/showAllUser.jsp");
		return mav;
	}
	@RequestMapping("/updateUser")
	public ModelAndView updateUser(User user)throws Exception{
		ModelAndView mav = new ModelAndView();
		userService.updateUser(user);
		mav.setViewName("forward:/selUserByUserNum");
		return mav;
	}
	@RequestMapping("/updateUserToManager")
	public ModelAndView updateUserToManager(String userNum)throws Exception{
		ModelAndView mav = new ModelAndView();
		User user = new User();
		user.setUserNum(userNum);
		user = userService.selUser(user);
		user.setType("管理员");
		userService.updateUser(user);
		mav.setViewName("redirect:selAllUser");
		return mav;
	}
	@RequestMapping("/updatePassword")
	public ModelAndView updatePassword(String userNum,String password,String newPassword,String passwordAgain)throws Exception{
		ModelAndView mav = new ModelAndView();
		if (userNum==null){
			mav.setViewName("/WEB-INF/user/updatePassword.jsp");
			return mav;
		}
		User user = new User();
		user.setUserNum(userNum);
		user = userService.selUser(user);
		System.out.println(user);
		if (password.equals(user.getPassword())){
			if (newPassword.equals(passwordAgain)){
				user.setPassword(newPassword);
				userService.updateUser(user);
				mav.getModel().put("message","修改成功！");
				mav.setViewName("/WEB-INF/user/updatePassword.jsp");
				return mav;
			}
			mav.getModel().put("message","两次新密码不一致！");
			mav.setViewName("/WEB-INF/user/updatePassword.jsp");
			return mav;
		}
		mav.getModel().put("message","原密码错误！");
		mav.setViewName("/WEB-INF/user/updatePassword.jsp");
		return mav;

	}
	@RequestMapping("/enter")
	public ModelAndView enter(HttpServletRequest request)throws Exception{
		ModelAndView mav = new ModelAndView();
		User user = (User) request.getSession().getAttribute("user");
		if ("管理员".equals(user.getType())){
			mav.setViewName("/manager/main.jsp");
		}else if ("商家".equals(user.getType())){
			mav.setViewName("/good/main.jsp");
		}else {
			mav.setViewName("/user/main.jsp");
		}
		return mav;
	}
}
