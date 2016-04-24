package cn.itcast.shop.order.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.shop.order.dao.OrderDao;
import cn.itcast.shop.order.vo.Order;
import cn.itcast.shop.utils.PageBean;

/**
 * 订单模块的业务层代码
 * @author Anges
 *
 */
@Transactional
public class OrderService {
	//注入orderDao
	private OrderDao orderDao;
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	//保存订单业务层代码
	public void save(Order order) {
		orderDao.save(order);
		
	}
	// 业务层根据用户id查询订单,带分页查询.
		public PageBean<Order> findByUid(Integer uid,Integer page) {
			
			PageBean<Order> pageBean = new PageBean<Order>();
			// 设置当前页数:
			pageBean.setPage(page);
			// 设置每页显示记录数:
			// 显示5个
			int limit = 5;
			pageBean.setLimit(limit);
			// 设置总记录数:
			int totalCount = 0;
			totalCount = orderDao.findByCountUid(uid);
			pageBean.setTotalCount(totalCount);
			// 设置总页数
			int totalPage = 0;
			if(totalCount % limit == 0){
				totalPage = totalCount / limit;
			}else{
				totalPage = totalCount / limit + 1;
			}
			pageBean.setTotalPage(totalPage);
			// 设置每页显示数据集合:
			int begin = (page - 1)*limit;
			
			List<Order> list = orderDao.findByPageUid(uid,begin,limit);
			
			pageBean.setList(list);
			return pageBean;
		}
		// 根据订单id查询订单
		public Order findByOid(Integer oid) {
			return orderDao.findByOid(oid);
		}
		//业务层修改订单
		public void update(Order currOrder) {
			orderDao.update(currOrder);
		}
	
}
