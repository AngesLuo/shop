//========轮播图开始================
			$(function(){
				
				var c = 0
				
			   	function timer(){
					c++;
					c=(c==4)?0:c;
				//获得序号
				$('.fl_s .tu img').eq(c).stop().show().siblings().hide();

                $('.fl_s .dos .dor a').eq(c).stop().addClass('dors').siblings().removeClass('dors');
		    }
			   	
			time = setInterval(timer,1000);
			$('.fl_s').hover(function(){
			//清除定时器//显示图片
   		           clearInterval(time);
   		    $('.ups').css({'display':'block'});
        	},function(){
			//回调函数//恢复定时器//隐藏图片
        		$('.fl_s .ups').css({'display':'none'});
        		time = setInterval(timer,1000);
        	})
			//右单击
				$('.fl_s .btn_right').click(function(){
					c++;
					c=(c==4)?0:c;
			//获得的序号
                  $('.fl_s .tu img').eq(c).stop().show().siblings().hide();

                $('.fl_s .dos .dor a').eq(c).stop().addClass('dors').siblings().removeClass('dors');
				})
			//左单击
				$('.fl_s .btn_left').click(function(){
					c--;
					c=(c==0)?0:c;
			//获得序号
					$('.fl_s .tu img').eq(c).stop().show().siblings().hide();

                $('.fl_s .dos .dor a').eq(c).stop().addClass('dors').siblings().removeClass('dors');
				})
			//点击变形
				$('.fl_s .dos .dor a').click(function(){
			//获得序号
					var n = $(this).index();
					
					$('.fl_s .tu img').eq(n).stop().show().siblings().hide();

                $('.fl_s .dos .dor a').eq(n).stop().addClass('dors').siblings().removeClass('dors');
				})
				
            })
//========轮播图结束================

//========菜单下滑开始===============
     $(function(){
         	 $(window).scroll(function(){
			//获得滚动条滚动上去的距离
		var t = $(document).scrollTop();
		     document.title = t;
		if (t>153) {
			//让menu固定定位，通过添加一个f class值来实现
			$("#nav").addClass('lalss');
		}else{
			$("#nav").removeClass('lalss');
		}
	    })
    }) 

//========菜单下滑结束===============
//====按钮切换颜色
     $(function(){
        //点击事件
     	$('.tss .ts1').click(function(){
     		
     		$(this).addClass('ts1s').siblings().removeClass('ts1s')
     	})

     	})
     
//========菜单下滑结束===============
//====按钮切换颜色
     $(function(){
//   	点击事件
     	$('.tss .ts1').click(function(){
     		
     		$(this).addClass('ts1s').siblings().removeClass('ts1s')
     	})	 
	 
//   	=============
//   美丽说	tab切换上
     	$('.tp6_1 .tp6_2 .tp6_2_1').click(function(){
     		
     		  n = $(this).index();//获得序号
     		  
     		$(this).addClass('tp6_2_11').siblings('.tp6_2 .tp6_2_1').removeClass('tp6_2_11'),$('.tp6_3 .tp6_4').eq(n).show().siblings().hide();
  
     	})
//   美丽说	tab切换下
     	$('.tp7_1 .tp6_2 .tp6_2_1').click(function(){
     			
     			l = $(this).index();
     			
     			$(this).addClass('tp6_2_11').siblings('.tp6_2 .tp6_2_1').removeClass('tp6_2_11'),$('.tp7_3').eq(l).show().siblings().hide();
     		
     	})
		
//色块的移入的显示和影藏
		$('.tp7_4').hover(function(){
     		
     		$('.get',$(this)).show();
     	},function(){
//回调函数   		
     		$('.get',$(this)).hide();
     	})
//   	===文字替换==
		$('.udt').hover(function(){
			$('.udt').innerHTML,$('.get .udt').html('取消关注')
		},function(){
			$('.udt').innerHTML,$('.get .udt').html('已关注')
		})
})
     	
//   	=============
		
//====按钮切换颜色
$(function(){
		//写一个移入显示、移出已隐藏//导航定位
       $('#wsa').hover(function(){
			$('#base',$(this)).stop().animate({'right':'0'},300);
			},function(){
			$('#base',$(this)).stop().animate({'right':'-38px'},300);	
			}
		)
		//写一个移入显示、移出已隐藏//左侧定位
        $('#adrc #adrcc a em').hover(function(){
        	
        	$('.red_gwc',$(this)).hide();
        	$('.w_gwc',$(this)).show();
        },function(){
        	
        	$('.w_gwc',$(this)).hide();
        	$('.red_gwc',$(this)).show();
        });
        $('#adrc #adrcg a em').hover(function(){
        	
        	$('.red_xin',$(this)).hide();
        	$('.w_xin',$(this)).show();
        },function(){
        	
        	$('.w_xin',$(this)).hide();
        	$('.red_xin',$(this)).show();
        });
		//写一个移入显示、移出已隐藏//左侧；返回顶部
        $('#fans .top').hover(function(){
        	
        	$('.asda').show();
        	$('.tops').hide();
        },function(){
        	
        	$('.asda').hide();
        	$('.tops').show();
        })
        //写一个下滑显示效果
        $(window).scroll(function(){
		//获得滚动条滚动上去的距离
		var t = $(document).scrollTop();
		     document.title = t;
		if (t>150) {
		//让menu固定定位，通过添加一个f class值来实现
			$('#fans .top').show();
		}else{
			$('#fans .top').hide();
		}
	    })
//结束	
//APP结束
        $('.topz .line8').hover(function(){
        	
        	$('.line8 ul').show();
        },function(){
        	
        	$('.line8 ul').hide();
        });
})





















