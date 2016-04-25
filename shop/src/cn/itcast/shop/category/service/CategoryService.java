package cn.itcast.shop.category.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.shop.category.dao.CategoryDao;
import cn.itcast.shop.category.vo.Category;

/**
 * 一级分类的业务层对象
 * @author Anges
 *
 */
@Transactional
public class CategoryService {
	// 注入CategoryDao
	private CategoryDao categoryDao;

	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	// 业务层查询所有一级分类的方法
	public List<Category> findAll() {
		return categoryDao.findAll();
	}
	//业务层保存一节分类
	public void save(Category category) {
		categoryDao.save(category);
	}
	//根据业务层查询一级分类
	public Category findByCid(Integer cid) {
		return categoryDao.findByCid(cid);
	}
	//业务层删除一级分类
	public void delete(Category category) {
		categoryDao.delete(category);
	}
	//业务层修改一级分类
	public void update(Category category) {
		categoryDao.update(category);
	}
	
}
