package cn.itcast.shop.product.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.shop.product.vo.Product;

/**
 * 商品持久层的代码
 * @author Anges
 *
 */
public class ProductDao extends HibernateDaoSupport{
	//首页热门商品查询
	public List<Product> findHot() {
		//带有分页查询:使用离线查询；还有使用this.hibernate..
		DetachedCriteria criteria=DetachedCriteria.forClass(Product.class);
		//条件是is_host=1
		criteria.add(Restrictions.eq("is_hot", 1));
		//倒序排序输出
		criteria.addOrder(Order.desc("pdate"));
		//执行查询
		List<Product> list=this.getHibernateTemplate().findByCriteria(criteria,0,10);
		return list;
	}
	//首页商品最新查询
	public List<Product> findNew() {
		DetachedCriteria criteria=DetachedCriteria.forClass(Product.class);
		criteria.addOrder(Order.desc("pdate"));
		List<Product> list=this.getHibernateTemplate().findByCriteria(criteria,0,10);
		return list;
	}
	//根据商品id查询
	public Product findByPid(Integer pid) {
		return this.getHibernateTemplate().get(Product.class, pid);
	}

}
