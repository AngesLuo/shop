package cn.itcast.shop.cart.vo;

import cn.itcast.shop.product.vo.Product;

/**
 * 购物项对象
 * @author Anges
 *
 */
public class CartItem {
	private Product product;	//商品信息
	private int count;			//购买数量
	private double subtotal;	//购买商品小计
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	//自动计算
	public double getSubtotal() {
		return count*product.getShop_price();
	}
//	public void setSubtotal(double subtotal) {
//		this.subtotal = subtotal;
//	}
	
}
