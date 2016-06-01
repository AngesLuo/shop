package cn.itcast.shop.product.action;

import java.util.List;

import cn.itcast.shop.category.service.CategoryService;
import cn.itcast.shop.category.vo.Category;
import cn.itcast.shop.product.service.ProductService;
import cn.itcast.shop.product.vo.Product;
import cn.itcast.shop.utils.PageBean;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 商品的Action对象
 * 
 * @author Agnes
 * 
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product> {
	
	// 注入商品的Service
	private ProductService productService;
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	//注入一级分类的service
	private CategoryService categoryService;
	public void setCategorservice(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	// 用于接收数据的模型驱动.
	private Product product = new Product();
	public Product getModel() {
		return product;
	}
	//接收当前页数
	private int page;
	public void setPage(int page) {
		this.page = page;
	}

	//接受分类cid
	private Integer cid;
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getCid() {
		return cid;
	}
	//接受二级分类csid
	private Integer csid;
	public Integer getCsid() {
		return csid;
	}
	public void setCsid(Integer csid) {
		this.csid = csid;
	}
	// 根据商品的ID进行查询商品:执行方法:
	public String findByPid() {
		// 调用Service的方法完成查询.
		product = productService.findByPid(product.getPid());
		return "findByPid";
	}
	//根据分类id查询
	public String findByCid(){
		//List<Category> clist=categoryService.findAll();
		PageBean<Product> pageBean = productService.findByPageCid(cid, page);// 根据一级分类查询商品,带分页查询
		//将pagebean存入值栈中
		ActionContext.getContext().getValueStack().set("pageBean", pageBean);
		return "findByCid";
	}
	//根据二级分类的id查询商品
	public String findByCsid(){
		//根据二级分类查询
		PageBean<Product> pageBean=productService.findByPageCsid(csid,page);
		//将pagebean存入值栈中
				ActionContext.getContext().getValueStack().set("pageBean", pageBean);
		return "findByCsid";
	}
}
