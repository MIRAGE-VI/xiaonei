//这里我们的一个js 函数库

function changeStatus(obj){
  		if(obj.value=='worker'){
  			$(".gra_spe").css("display","none");
			$(".worker_sep").css("display","table-row");
  		}else if(obj.value=='graduate'){
  			//jquery根据class去寻找控件集合.
  			$(".gra_spe").css("display","table-row");
			$(".worker_sep").css("display","none");
  		}
}


