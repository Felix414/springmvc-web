<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
</head>
<body>
	<table>
		<tr>
			<td>用户名：</td>
			<td><input /></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="password" /></td>
		</tr>
		<!-- 验证码 -->
		<tr>
			<td>验证码：</td>
			<td><input /></td>
		    <td>
		        <img id="img" src="/springmvc-web/authImage" onclick="changeImg()"/>
		    </td>
		 </tr>
	 </table>
	  
	<!-- 触发JS刷新-->
	<script type="text/javascript">
	    function changeImg(){
	        var img = document.getElementById("img"); 
	        img.src = "/springmvc-web/authImage?date=" + new Date().getTime();
	    }
	</script>
</body>
</html>