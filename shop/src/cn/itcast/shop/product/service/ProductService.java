package cn.itcast.shop.product.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.shop.product.dao.ProductDao;
import cn.itcast.shop.product.vo.Product;

/**
 * 商品业务层的代码
 * @author Anges
 *
 */
@Transactional
public class ProductService {
	//注入ProductDao
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	//首页热门商品查询
	public List<Product> findHot() {
		
		return productDao.findHot();
	}
	//首页最新商品查询
	public List<Product> findNew() {
		return productDao.findNew();
	}
	//根据商品id查询
	public Product findByPid(Integer pid) {
		return productDao.findByPid(pid);
	}
	
}
