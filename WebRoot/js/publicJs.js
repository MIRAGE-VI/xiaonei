//�������ǵ�һ��js ������

function changeStatus(obj){
  		if(obj.value=='worker'){
  			$(".gra_spe").css("display","none");
			$(".worker_sep").css("display","table-row");
  		}else if(obj.value=='graduate'){
  			//jquery����classȥѰ�ҿؼ�����.
  			$(".gra_spe").css("display","table-row");
			$(".worker_sep").css("display","none");
  		}
}


