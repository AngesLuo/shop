<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>美丽说购物</title>
	<meta name="abstract" content=""/>
	<link rel="stylesheet" type="text/css" href="${ pageContext.request.contextPath }/css/index.css"/>
	<script type="text/javascript" src="${ pageContext.request.contextPath }/js/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="${ pageContext.request.contextPath }/js/index.js"></script>
	</head>
	<body>
		<!-- 美丽说头部    开始-->
		<div id="top">
			<div class="topz">
				<ul>
				<s:if test="#session.existUser == null">
					<li id="line7" class="headerLogin" style="display: list-item;">
						<a href="${ pageContext.request.contextPath }/user_loginPage.action">登录</a>|</li>
					<li id="line8" class="headerRegister"
						style="display: list-item;"><a href="${ pageContext.request.contextPath }/user_registPage.action">注册</a>|
					</li>
				</s:if>
				<s:else>
					<li id="line7" class="headerLogin" style="display: list-item;">
						<s:property value="#session.existUser.name"/>
					|</li>
					<li id="line7" class="headerLogin" style="display: list-item;">
						<a href="${ pageContext.request.contextPath }/order_findByUid.action?page=1">我的订单</a>
					|</li>
					<li id="line8" class="headerRegister"
						style="display: list-item;"><a href="${ pageContext.request.contextPath }/user_quit.action">退出</a>|
					</li>
					</s:else>
				
				   <li class="line1"><a href=""><em class="wx"></em>微信登录</a></li>
				   <li class="line2"><a href=""><em class="qq"></em>QQ登录</a></li>
				   <li class="line3"><a href="./login.html">登录</a></li>
				   <li class="line4"><a href="./register.html">注册</a></li>
				   <li class="line5"><a href="./cart.html"><em class="gwc"></em>我的购物车<span class="tip">0</span></a></li>
				   <li class="line6"><a href="./order.html"><em class="dtan"></em>我的订单</a></li>
				   <li class="line7"><a href=""><em class="hyuan"></em>美丽说会员</a></li>
				   <li class="line8">
				   	<a href=""><em class="app"></em>下载App<em class="arrow"></em></a>
				   	<ul style="display: none;">
				   		<li class="sao">
				   			<img src="image/sao.jpg"/>
				   			<p style="font-size: 14px;color: #FF6699;">美丽说客服端</p>
				   			<p style="color: #666666;">发现流行，只做正确流行款</p>
				   		</li>
				   	</ul>
				   </li>
				   <li class="line9"><a href="" style="border: none;">帮助中心</a></li>
				</ul>
			</div>
		</div>
		<!-- 美丽说头部  结束--
		   <!--=========搜索部分开始=====-->
		<div id="so">
			<div class="sox">
				<div class="logo"><img src="image/logo.png" /></div>
				<div class="sublogo"><img src="image/gg.png"/></div>
				<!--搜索-->
				<div class="soso">
					<div class="tss">
						<span class="ts1 ts1s" data-type="0">宝贝</span>
						<span class="ts1" data-type="1">店铺</span>					
					</div>
					<div class="tss1">
						<input type="" name="" class="td" onfocus="if(this.value=='运动鞋陪你逛多久不累')this.value=''" onblur="if(this.value=='') this.value='运动鞋陪你逛多久不累'"style="color: #666666;" value="衬衫不是“他”的专属" ></input>
						<span class="tds"></span>					
					</div>
					<div class="tss2">
						<div class="ts">
							<a href="">外套</a>
							<a href="">衬衫</a>
							<a href="" style="color: #FF6699;">套装</a>
							<a href="" >连衣裙</a>
							<a href="" style="color: #FF6699;">背带裤</a>
							<a href="" >运动鞋</a>
							<a href="" style="color: #FF6699;">卫衣</a>
							<a href="">单鞋</a>
							<a href="">背带裙</a>
							<a href="">睡衣</a>						
						</div>
					</div>
				</div>
			</div>			
		</div>
			<!-------------搜索结束------------>
		 <!--=========右侧开始=====-->
		  <div id="wsa">
		   	    <div id="adri">
		   	        <div id="adrs">
		   	   	  	    <div id="adrc">
		   	   	  		    <a href="" id="adrcc">
		   	   	  		    	<em class="red_gwc"></em>
		   	   	  		    	<em class="w_gwc"></em>
		   	   	  		    	<span>购物车</span>		 
							</a>
		   	   	  		    <a href="" id="adrcg">
		   	   	  		    	<em class="red_xin"></em>
		   	   	  		    	<em class="w_xin"></em>
		   	   	  		    	<span>客服消息</span>		   	   	  		    
							</a>		   	   	  	   
					  </div>
		   	   	    </div>
		   	   	    <div id="base">
	   	   	    	  <div id="side">
		   	   	    		<div class="basel"></div>
	   	   	    	      <a href="" id="right_1">
	   	   	    		      <em class="red_yh"></em>
	   	   	    		      <em class="w_yh"></em>
	   	   	    		      <span class="stip">
	   	   	    		                      我的优惠券
	   	   	    			      <em class="blck_s"></em>	   	   	    		     
							 </span>	   	   	    	     
						  </a>
	   	   	    	      <a href="" id="right_2">
	   	   	    		      <em class="red_like"></em>
	   	   	    		      <em class="w_like"></em>
	   	   	    		      <span class="stip">
	   	   	    			            喜欢的商品
	   	   	    			  	<em class="blck_s"></em>	   	   	    		    
							  </span>	   	   	    	      
						  </a>
	   	   	    	      <a href="" id="right_3">
	   	   	    		      <em class="red_feed"></em>
	   	   	    		      <em class="w_feed"></em>
	   	   	    		      <span class="stip">
	   	   	    			             调查问卷
	   	   	    			  	<em class="blck_s"></em>	   	   	    		    
							  </span>	   	   	    	      
					    </a>		   	   	        
					  </div>
		   	   	    </div>
		   	    </div>
		   	    <div id="fans">
		   	   	    <div class="top" style="display: none;">
		   	   	    	<em class="tops"></em>
		   	   	    	<span class="asda" style="display: none;">返回顶部</span>		   	   	    
					</div>
		   	   	</div>
       </div>
			
		 <!--=========右侧结束=====-->
	
	<div id="nav">
		  <div id="dh">
			<div id="ds">
				<ul>
					<li><a href="${ pageContext.request.contextPath }/index.action">首页</a> |</li>
					<s:iterator var="c" value="#session.CList">
					<li><a href="${ pageContext.request.contextPath }/product_findByCid.action?cid=<s:property value="#c.cid"/>&page=1 "> <s:property value="#c.cname"/> </a> |</li>
					</s:iterator>
				</ul>
			</div>
		  </div>
		</div>
	    <div id="center">
		<!--------分类导航开始----->
		
	</body>
</html>
