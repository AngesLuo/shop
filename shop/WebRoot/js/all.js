// JavaScript Document

//www.hajjjc.com
//yoyo制作 翻版必究


var topMain=100//设置距离
var nav=$(".nav");
var h = $(window).height();
$(".nav ul li a").css({"height":h,"line-height":h+"px"});
$(window).scroll(function(){
	if ($(window).scrollTop()>topMain){//如果滚动条顶部的距离大于topMain则就nav导航就添加类.nav_scroll，否则就移除。
		nav.addClass("nav_scroll");
	}
	else
	{
		nav.removeClass("nav_scroll");
	}
});
		
jQuery(".index-tab").slide({delayTime:0 });



//设置
myFocus.set({
	id:'myFocus',//ID
	pattern:'mF_51xflash',//风格
	wrap:'false',
	loadIMGTimeout:'0'
});


//商品列表上部分滚动

jQuery(".picScroll").slide({mainCell:".picList",autoPage:true,effect:"left",autoPlay:true,scroll:5,vis:5,mouseOverStop:false});


//商品列表上部分滚动
$(document).ready(function() {
	 
	
	//blocksit define
	$(window).load( function() {
		$('#container').BlocksIt({
			numOfCol: 5,
			offsetX: 8,
			offsetY: 8,
			blockElement: '.grid'
		});
	});
	
	//window resize
	var currentWidth = 1100;
	$(window).resize(function() {
		var winWidth = $(window).width();
		var conWidth;
		if(winWidth < 660) {
			conWidth = 440;
			col = 2
		} else if(winWidth < 880) {
			conWidth = 660;
			col = 3
		} else if(winWidth < 1100) {
			conWidth = 880;
			col = 4;
		} else {
			conWidth = 1200;
			col = 5;
		}
		
		if(conWidth != currentWidth) {
			currentWidth = conWidth;
			$('#container').width(conWidth);
			$('#container').BlocksIt({
				numOfCol: col,
				offsetX: 8,
				offsetY: 8
			});
		}
	});
});	


//详情页
//大图切换
		jQuery(".game163").slide({ titCell:".smallImg li", mainCell:".bigImg", effect:"fold", autoPlay:true,delayTime:200,
			startFun:function(i,p){
				//控制小图自动翻页
				if(i==0){ jQuery(".game163 .sPrev").click() } else if( i%4==0 ){ jQuery(".game163 .sNext").click()}
			}
		});

		//小图左滚动切换
		jQuery(".game163 .smallScroll").slide({ mainCell:"ul",delayTime:100,vis:4,scroll:4,effect:"left",autoPage:true,prevCell:".sPrev",nextCell:".sNext",pnLoop:false });	


//详情页TAB切换
jQuery(".slideTxtBox").slide({effect:"left",trigger:"click"});