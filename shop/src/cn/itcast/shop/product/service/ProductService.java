package cn.itcast.shop.product.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.shop.product.dao.ProductDao;
import cn.itcast.shop.product.vo.Product;
import cn.itcast.shop.utils.PageBean;

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
	//根据一级分类查询商品，带分页
	public PageBean<Product> findByPageCid(Integer cid, int page) {
		PageBean <Product> pageBean=new PageBean<Product>();
		//设置当前页数
		pageBean.setPage(page);
		//设置每页显示的记录数
		int limit=8;
		pageBean.setLimit(limit);
		//总记录数
		int totalCount=0;
		totalCount=productDao.findCountCid(cid);
		pageBean.setTotalCount(totalCount);
		//设置总页数
		int totalPage=0;
		//Math.ceil(totalCount/limit);
		if(totalCount%limit==0){
			totalPage=totalCount/limit;
		}else{
			totalPage=totalCount/limit+1;
		}
		pageBean.setTotalPage(totalPage);
		//每页显示的集合
		//从哪里开始
		int begin=(page-1)*limit;
		List<Product> list=productDao.findByPageCid(cid,begin,limit);
		pageBean.setList(list);
		return pageBean;
	}
	//根据二级分类查询
	public PageBean<Product> findByPageCsid(Integer csid, int page) {
		PageBean <Product> pageBean=new PageBean<Product>();
		//设置当前页数
		pageBean.setPage(page);
		//设置每页显示的记录数
		int limit=8;
		pageBean.setLimit(limit);
		//总记录数
		int totalCount=0;
		totalCount=productDao.findCountCsid(csid);
		pageBean.setTotalCount(totalCount);
		//设置总页数
		int totalPage=0;
		//Math.ceil(totalCount/limit);
		if(totalCount%limit==0){
			totalPage=totalCount/limit;
		}else{
			totalPage=totalCount/limit+1;
		}
		pageBean.setTotalPage(totalPage);
		//每页显示的集合
		//从哪里开始
		int begin=(page-1)*limit;
		List<Product> list=productDao.findByPageCsid(csid,begin,limit);
		pageBean.setList(list);
		return pageBean;
	}

	// 后台查询所有商品带分页
	public PageBean<Product> findByPage(Integer page) {
		PageBean<Product> pageBean = new PageBean<Product>();
		// 设置当前页数:
		pageBean.setPage(page);
		// 设置每页显示记录数:
		int limit = 10;
		pageBean.setLimit(limit);
		// 设置总记录数:
		int totalCount = 0;
		totalCount = productDao.findCount();
		pageBean.setTotalCount(totalCount);
		// 设置总页数:
		int totalPage = 0;
		// Math.ceil(totalCount / limit);
		if (totalCount % limit == 0) {
			totalPage = totalCount / limit;
		} else {
			totalPage = totalCount / limit + 1;
		}
		pageBean.setTotalPage(totalPage);
		// 每页显示的数据集合:
		// 从哪开始:
		int begin = (page - 1) * limit;
		List<Product> list = productDao.findByPage(begin, limit);
		pageBean.setList(list);
		return pageBean;
	}

	// 业务层保存商品方法:
	public void save(Product product) {
		productDao.save(product);
	}

	// 业务层删除商品
	public void delete(Product product) {
		productDao.delete(product);
	}

	// 业务层修改商品的方法
	public void update(Product product) {
		productDao.update(product);
	}
	//根据关键字查找
	public PageBean<Product> findByPageWord(String keyword, int page) {
		PageBean <Product> pageBean=new PageBean<Product>();
		//设置当前页数
		pageBean.setPage(page);
		//设置每页显示的记录数
		int limit=8;
		pageBean.setLimit(limit);
		//总记录数
		int totalCount=0;
		totalCount=productDao.findCountWord(keyword);
		pageBean.setTotalCount(totalCount);
		//设置总页数
		int totalPage=0;
		//Math.ceil(totalCount/limit);
		if(totalCount%limit==0){
			totalPage=totalCount/limit;
		}else{
			totalPage=totalCount/limit+1;
		}
		pageBean.setTotalPage(totalPage);
		//每页显示的集合
		//从哪里开始
		int begin=(page-1)*limit;
		List<Product> list=productDao.findByPageword(keyword,begin,limit);
		pageBean.setList(list);
		return pageBean;
	}
}
