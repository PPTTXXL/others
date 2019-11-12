<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工登录</title>
<c:import url="common.jsp"></c:import>
</head>
<body style="margin: 0; padding: 0; background-color: #f0fcff">
	<c:import url="navuser.jsp"></c:import>
	<div style="width: 100%">
		<div
			style="text-align: center; width: 500px; padding-top: 8%; margin: 0 auto">
			<form action="login.do" method="post" class="form-horizontal">
				<h1>员工登录</h1>
				<br>
				<div class="control-group form-group"
					style="display: flex; margin-left: 20%;">
					<label for="name" class="control-label">员工ID&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;</label>
					<input class="input-large form-control" type="text" name="uid"
						placeholder="请输入用户名" style="width: 200px">
				</div>
				<div class="control-group form-group"
					style="display: flex; margin-left: 20%;">
					<label for="name" class="control-label">密&nbsp;&nbsp;&nbsp;&nbsp;码&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;</label>
					<input class=" form-control " type="password" placeholder="请输入密码"
						name="password" style="width: 200px">
				</div>

				<div class="control-group">
					<div class="controls">

						<input type="submit" name="submit" class="btn"
							style="margin-top: 20px;" value="登录" />
					</div>
				</div>
			</form>
		</div>
		<a href="tologin1.do"> <input type="button" class="btn"
			value="管理员登录" style="float: right; left: 50px;" />
		</a>

	</div>
	<c:import url="foot.jsp"></c:import>
</body>
</html>