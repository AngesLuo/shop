package cn.itcast.shop.order.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.shop.order.vo.Order;
import cn.itcast.shop.utils.PageHibernateCallback;

/**
 * 订单模块的dao层代码
 * @author Anges
 *
 */
public class OrderDao extends HibernateDaoSupport{
	//保存订单方法
	public void save(Order order) {
		this.getHibernateTemplate().save(order);
	}
	//订单个数统计
	public int findByCountUid(Integer uid) {
		String hql = "select count(*) from Order o where o.user.uid = ?";
		List<Long> list = this.getHibernateTemplate().find(hql, uid);
		if (list != null && list.size() > 0) {
			return list.get(0).intValue();
		}
		return 0;
	}
	//订单的查询
	public List<Order> findByPageUid(Integer uid, Integer begin, Integer limit) {
		String hql="from Order o where o.user.uid = ? order by o.ordertime desc";
		List<Order> list=this.getHibernateTemplate().execute(
				new PageHibernateCallback<Order>(hql, new Object[] { uid },
						begin, limit));
		
		if (list != null && list.size() > 0) {
			return list;
		}
		return null;
	}
	// DAO层根据订单id查询订单
		public Order findByOid(Integer oid) {
			return this.getHibernateTemplate().get(Order.class, oid);
		}

}
