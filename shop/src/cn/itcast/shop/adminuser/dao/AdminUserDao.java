package cn.itcast.shop.adminuser.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.shop.adminuser.vo.AdminUser;

/**
 * 后台登陆的dao类
 * @author Anges
 *
 */
public class AdminUserDao extends HibernateDaoSupport{
	//dao中登录方法
	public AdminUser login(AdminUser adminUser) {
		String hql="from AdminUser where username=? and password=?";
		List<AdminUser> list=this.getHibernateTemplate().find(hql,adminUser.getUsername(),adminUser.getPassword());
		if(list!=null && list.size()>0){
			return list.get(0);
		}
		return null;
	}

}
