package cn.itcast.shop.user.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.itcast.shop.user.service.UserService;
import cn.itcast.shop.user.vo.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 用户模块的action类
 * @author Anges
 *
 */

public class UserAction extends ActionSupport implements ModelDriven<User>{
	//模型驱动使用对象
	private User user=new User();
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	//注入UserService
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	//接受验证码
	private String checkcode;
	
	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}
	/**
	 * 跳转到注册页面的执行方法
	 */
	public String registPage(){
		return "registPage";
	}
	/**
	 * ajax进行异步校验的执行方法
	 * @throws IOException 
	 */
	public String findByName() throws IOException {
		// 调用Service进行查询:
		User existUser = userService.findByUsername(user.getUsername());
		// 获得response对象,项页面输出:
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		// 判断
		if (existUser != null) {
			// 查询到该用户:用户名已经存在
			response.getWriter().println("<font color='red'>用户名已经存在</font>");
		} else {
			// 没查询到该用户:用户名可以使用
			response.getWriter().println("<font color='green'>用户名可以使用</font>");
		}
		return NONE;
	}
	/**
	 * 用户注册
	 */
	public String regist() {
		//从session中获得验证码
		String checkcode1=(String) ServletActionContext.getRequest().getSession().getAttribute("checkcode");
		if(!checkcode.equalsIgnoreCase(checkcode1)){
			this.addActionError("你的验证码输入错误");
			return "checkcodeFail";
		}
		userService.save(user);
		//this.addActionMessage("注册成功！请去邮箱激活！");
		// 判断验证码程序:
		return "loginPage";
	}
//	/**
//	 * 用户激活
//	 */
//	public String active(){
//		//根据激活码查询用户
//		User existUser= userService.findByCode(user.getCode());
//		if (existUser==null) {
//			//激活错误
//			this.addActionMessage("激活失败，激活码错误");
//		}else{
//			//激活成功
//			//修改用户的状态
//			existUser.setState(1);
//			existUser.setCode(null);
//			userService.update(existUser);
//			this.addActionMessage("激活成功！请去登录");
//		}
//		return "msg";
//	}
	/**
	 * 跳转到登录
	 */
	public String loginPage(){
		return "loginPage";
	}
	/**
	 * 用户登录
	 */
	public String login(){
		User existUser=userService.login(user);
		if (existUser == null) {
			// 失败
			this.addActionError("登录失败用户未激活");
			return LOGIN;
		} else {
			// 成功，存入session
			ServletActionContext.getRequest().getSession().setAttribute("existUser", existUser);
			//页面跳转
			return "loginSuccess";
		}
	}
	/**
	 * 用户退出·
	 */
	public String quit(){
		//销毁session
		ServletActionContext.getRequest().getSession().invalidate();
		return "quit";
	}
}
