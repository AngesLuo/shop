package cn.itcast.shop.user.service;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.shop.user.dao.UserDao;
import cn.itcast.shop.user.vo.User;
import cn.itcast.shop.utils.UUIDUtils;

/**
 * 用户模块业务层代码
 * @author Anges
 *
 */
@Transactional
public class UserService {
	//注入userdao
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	//按照用户名查询用户
	public User findByUsername(String username){
		return userDao.findByUsername(username);
	}
	//业务层保存的方法
	public void save(User user) {
		// TODO Auto-generated method stub
		user.setState(1);  //      1：代表用户已经激活
		String code=UUIDUtils.getUUID()+UUIDUtils.getUUID();
		user.setCode(code);
		userDao.save(user);

	}
	//用户登录
	public User login(User user) {
		return userDao.login(user);
	}
}
