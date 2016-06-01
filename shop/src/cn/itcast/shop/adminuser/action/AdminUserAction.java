package cn.itcast.shop.adminuser.action;

import org.apache.struts2.ServletActionContext;

import cn.itcast.shop.adminuser.service.AdminUserService;
import cn.itcast.shop.adminuser.vo.AdminUser;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 鍚庡彴鐢ㄦ埛鐨刟ction   史纯涛1
 * @author Anges
 *
 */
public class AdminUserAction extends ActionSupport implements ModelDriven<AdminUser>{
	private AdminUser adminUser=new AdminUser();
	
	@Override
	public AdminUser getModel() {
		return adminUser;
	}
	//娉ㄥ叆service
	private AdminUserService adminUserService;

	public void setAdminUserService(AdminUserService adminUserService) {
		this.adminUserService = adminUserService;
	}
	//鍚庡彴鐧婚檰鐨勬柟娉�
	public String login(){
		//璋冪敤service瀹屾垚鐧诲綍
		AdminUser existAdminUser=adminUserService.login(adminUser);
		if(existAdminUser==null){
			//鐧诲綍澶辫触
			this.addActionError("浣犵殑瀵嗙爜鎴栫敤鎴峰悕閿欒");
			return "loginFail";
		}else{
			//鐧诲綍鎴愬姛
			ServletActionContext.getRequest().getSession().setAttribute("existAdminUser", existAdminUser);
			return "loginSuccess";
			
		}
	}
	

	
}
