package cn.itcast.shop.categorysecond.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.shop.categorysecond.vo.CategorySecond;
import cn.itcast.shop.utils.PageHibernateCallback;

/**
 * 二级分类管理的dao层类
 * @author Anges
 *
 */
public class CategorySecondDao extends HibernateDaoSupport{
	//dao层统计二级分类个数的方法
	public int findCount() {
		String hql="select count(*) from CategorySecond";
		List<Long> list=this.getHibernateTemplate().find(hql);
		if(list!=null &&list.size()>0){
			return list.get(0).intValue();
		}
		return 0;
	}
	//dao层分页查询二级分类的方法
	public List<CategorySecond> findByPage(int begin, int limit) {
		String hql="from CategorySecond order by csid desc";
		List<CategorySecond> list=this.getHibernateTemplate().execute(new PageHibernateCallback<CategorySecond>(hql, null, begin, limit));
		if(list!=null &&list.size()>0){
			return list;
		}
		return null;
	}
	//dao保存二级分类的方法
	public void save(CategorySecond categorySecond) {
		this.getHibernateTemplate().save(categorySecond);
	}
	
	//dao根据csid查询二级分类
	public CategorySecond findByCsid(Integer csid) {
		return this.getHibernateTemplate().get(CategorySecond.class, csid);
	}
	
	//dao删除二级分类
	public void delete(CategorySecond categorySecond) {
		this.getHibernateTemplate().delete(categorySecond);
	}
	//修改二级分类
	public void update(CategorySecond categorySecond) {
		this.getHibernateTemplate().update(categorySecond);
	}
	// DAO中的查询所有二级分类的方法
	public List<CategorySecond> findAll() {
		String hql = "from CategorySecond";
		return this.getHibernateTemplate().find(hql);
	}

}
