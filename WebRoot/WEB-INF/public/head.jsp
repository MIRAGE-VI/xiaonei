<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

	<link rel="stylesheet" type="text/css" href="/xiaonei/css/head.css"/>
	<script type="text/javascript">
	<!--
	
	function changeBG(o){
		o.style.backgroundColor="#5C75AA";
	}
	function changeBG2(o){
		o.style.backgroundColor="";
	}
	-->
	</script>
 
    <div class="head1">
    	<img class="img1" src="/xiaonei/images/front/top1.gif">
        <img class="img2" src="/xiaonei/images/front/top2.jpg">
        <img src="/xiaonei/images/front/xnw.jpg" style="float:left;">
        <ul class="navil">
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="anavi" href="#">Sign In</a></li>
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="anavi" href="#">Home Page</a></li>
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="anavi" href="#">Collection</a></li>
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="anavi" href="#">Help</a></li>
        </ul>
    </div>

