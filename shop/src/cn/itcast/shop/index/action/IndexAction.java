package cn.itcast.shop.index.action;

import java.util.List;

import cn.itcast.shop.category.service.CategoryService;
import cn.itcast.shop.category.vo.Category;
import cn.itcast.shop.product.service.ProductService;
import cn.itcast.shop.product.vo.Product;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 首页访问的action
 * @author Anges
 *
 */
public class IndexAction extends ActionSupport{
	//注入一级分类的service
	private CategoryService categoryService;
	
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	//注入商品的service
	private ProductService productService;
	
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	/**
	 * 执行的访问首页的方法
	 */
	public String execute(){
		//查询所有一级分类
		List<Category> CList=categoryService.findAll();
		//将一级分类存入session页面中
		ActionContext.getContext().getSession().put("CList", CList);
		//查询热门商品
		List<Product> hList=productService.findHot();
		//保存到值栈中
		ActionContext.getContext().getValueStack().set("hList", hList);
		//查询最新商品
		List<Product> nList=productService.findNew();
		//保存到值栈中
		ActionContext.getContext().getValueStack().set("nList", nList);
		return "index";
	}
}
