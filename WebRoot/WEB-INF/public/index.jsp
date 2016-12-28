<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="/xiaonei/css/common.css"/>
	<link rel="stylesheet" type="text/css" href="/xiaonei/css/index.css"/>
  </head>
  
  <body>
    <jsp:include page="head.jsp"></jsp:include>
    <div class="main">
	    <div class="reg_login">
		    <div class="logForm">
		    	<span class="font4">Login Email:</span><br/>
		    	<input type="text" name="email"><br/>
		    	<span class="font4">Password:</span><br/>
		    	<input type="password" name="password"><br/>
		    	<input type="checkbox">Remenber<br/>
		    	<input type="submit" value="Login" class="sub" >
		    	<a href="#">Forget Password</a>
		    </div>
		    
		    <div class="reg">
		    	<span class="font5">Register</span><br/>
		    	<span class="font4">Welcon to join in!</span>
		    </div>
		    
		    <div class="mobile">
		    	<span class="font5">Login By Mobile</span><br/>
		    	<a href="#">Please go to share.com</a>
		    </div>
	    </div>
	    <div class="banner1">
	    	<img src="/xiaonei/images/front/ay-0812-658-280.jpg" style="width:719px; height:306px;">
	    </div>
	    
	    <div class="intro">
		    <p class="font2">This a traveling share platform!</p>
		    <li>Our</li>
		    <li>Friendship</li>
		    <li>Forever</li>
		    <li>Forever</li>
		    <li>Forever</li>
		    <li>Forever</li>
		    <li>Forever</li>
		    <li>Forever</li>
		    <li>Forever</li>
	    </div>
	    
	    <div class="reg2">
		    <span class="font2">Enjoy It!</span>
		    <p> 
		    Study hard, play hard!</br>
		    <input type="image" onclick="" src="/xiaonei/images/front/register.jpg" />
		    </p>
	    </div>
	    <!-- find -->
	    <div class="search">
	    <span class="font2">Find Your Friends</span>
	    <input type="text" name="search">
	    <img src="/xiaonei/images/front/sou.jpg"></br>
	    *
	    <span class="font3">
	    Now Available
	    <font class="font1">Abroad1500Univ.</font>,
	    <font class="font1">Domestic3000Univ.</font>,
	    <font class="font1">Domestic56000High.</font>,
	    <font class="font1">Domestic85000Comp.</font>
	    </span>
	    </div>
	    <!-- Advice -->
	    <div class="advice">
	    <span class="font4">We hope</span><br/>
	    Every one can happy every day!<br/>
	    Good Luck!<br/>
	    Good Luck!<br/>
	    Good Luck!<br/>
	    Good Luck!<br/>
	    Good Luck!
	    </div>
    </div>
    <jsp:include page="foot.jsp"></jsp:include>
  </body>
</html>
