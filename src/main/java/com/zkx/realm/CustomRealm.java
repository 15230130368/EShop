package com.zkx.realm;

import com.zkx.pojo.User;
import com.zkx.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

import javax.annotation.Resource;

public class CustomRealm extends AuthorizingRealm {
	@Override
	public void setName(String name) {
		super.setName("customRealm");
	}

	@Resource
	private UserService userService;
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		return null;
	}

	/**
	 * 进行用户认证
	 * @param token
	 * @return
	 * @throws AuthenticationException
	 */
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String usercode = token.getPrincipal().toString();
		User user1 = new User();
		user1.setUsername(usercode);
		User user = userService.selUser(user1);
		if (user==null){
			return null;
		}
		//将用户信息保存到session中
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		session.setAttribute("user",user);

		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,user.getPassword(),this.getName());
		return info;
	}
}
