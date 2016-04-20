package cn.itcast.shop.user.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.shop.user.vo.User;

/**
 * 用户持久层代码
 * @author Anges
 *
 */
public class UserDao extends HibernateDaoSupport{
   //按照名字查询是否有该用户
	public User findByUsername(String username){
		String hql = "from User where username = ?";
		List<User> list = this.getHibernateTemplate().find(hql, username);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}
	//注册用户存入代码实现
	public void save(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
	}
	//根据激活码查询用户
	public User findByCode(String code) {
		String hql="from User where code=?";
		List<User> list=this.getHibernateTemplate().find(hql,code);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}
	//修改用户状态
	public void update(User existUser) {
		System.out.println("来了");
		this.getHibernateTemplate().update(existUser);
	}
	//用户登录
	public User login(User user) {
		String hql="from User where username=? and password=? and state=?";
		List<User> list=this.getHibernateTemplate().find(hql,user.getUsername(),user.getPassword(),1);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}
}
