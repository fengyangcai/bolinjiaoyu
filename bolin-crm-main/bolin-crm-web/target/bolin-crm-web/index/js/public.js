// 回到顶部
function goTop(){
   $.fn.fullpage.moveTo(1)
}

// 创建日期

function getMount(date){
  var m = date.getMonth() + 1;
  return m;
}
function getday(date){
  var d = date.getDate();
  return d;
}

//上下轮播图
function slide(){
	var num = 0;
	var timer = null;
	
	//获取
	var slider = $('.slider');
	var leng = $('.slider > p').length;
	var step = $('.slider > p').height();
	
	
	timer = setInterval(function(){
		num++;
		if(num>leng-1){
			num = 0;
			slider.css({top:0});
		}else{
			slider.animate({top:-step*num})
		}
	},2000)
	
	slider.mouseenter(function(){
		clearInterval(timer)
	})
	slider.mouseleave(function(){
		timer = setInterval(function(){
		num++;
		if(num>leng-1){
			num = 0;
			slider.css({top:0});
		}else{
			slider.animate({top:-step*num})
		}
	},2000)
	})
	
}





