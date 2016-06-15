<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div id="top">
			<div class="topz">
				<ul>
				<s:if test="#session.existUser == null">
				   <li class="line3"><a href="${ pageContext.request.contextPath }/user_loginPage.action">登录</a></li>
				   <li class="line4"><a href="${ pageContext.request.contextPath }/user_registPage.action">注册</a></li>
				   </s:if>
					<s:else>
					<li class="line5"><a href="${ pageContext.request.contextPath }/user_loginPage.action">欢迎你：<s:property value="#session.existUser.name"/></a></li>
				   	<li class="line5"><a href="${ pageContext.request.contextPath }/cart_myCart.action"><em class="gwc"></em>我的购物车<span class="tip"></span></a></li>
				   	<li class="line5"><a href="${ pageContext.request.contextPath }/order_findByUid.action?page=1"><em class="dtan"></em>我的订单</a></li>
					<li class="line6"><a href="${ pageContext.request.contextPath }/user_quit.action">退出</a></li>
				   	</s:else>
				   <li class="line7"><a href=""><em class="hyuan"></em>美丽说会员</a></li>
				   <li class="line8">
				   	<a href=""><em class="app"></em>下载App<em class="arrow"></em></a>
				   	<ul style="display: none;">
				   		<li class="sao">
				   			<img src="${pageContext.request.contextPath}/image/sao.jpg"/>
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
				<div class="logo"><img src="${pageContext.request.contextPath}/image/logo.png" /></div>
				<div class="sublogo"><img src="${pageContext.request.contextPath}/image/gg.png"/></div>
				<!--搜索-->
				<div class="soso">
					<div class="tss">
						<span class="ts1 ts1s" data-type="0">宝贝</span>
						<span class="ts1" data-type="1">店铺</span>					
					</div>
					<div class="tss1">
						<input type="" name="" id="sousuo" class="td" onfocus="if(this.value=='运动鞋陪你逛多久不累')this.value=''" onblur="if(this.value=='') this.value='运动鞋陪你逛多久不累'"style="color: #666666;" value="衬衫不是“他”的专属" ></input>
						<a href ="javascript:sou()" class="tds" id="sou" style="font-size:16px;color:white;">&nbsp;&nbsp;搜     索</a>					
					</div>
					<!--  
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
					-->
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
				<li><a href="${ pageContext.request.contextPath }/index.action" class="ds1">首页</a></li>
			 	<s:iterator var="c" value="#session.CList">
					<li><a href="${ pageContext.request.contextPath }/product_findByCid.action?cid=<s:property value="#c.cid"/>&page=1 " class="ds2"><s:property value="#c.cname"/></a></li>
					<!-- 
					<li><a href="" class="ds3">上衣</a></li>
					<li><a href="" class="ds4">裙子</a></li>
					<li><a href="" class="ds5">裤子</a></li>
					<li><a href="" class="ds6">鞋子</a></li>
					<li><a href="" class="ds7">包包</a></li>
					<li><a href="" class="ds8">配饰</a></li>
					<li><a href="" class="ds8">配饰</a></li>
					- -->
				</s:iterator>
				</ul>
			</div>
		  </div>
		</div>
	