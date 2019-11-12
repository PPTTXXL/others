<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>
<c:import url="common.jsp"></c:import>
</head>
<body style="margin: 0; padding: 0; background-color: #f0fcff">
	<c:import url="navuser.jsp"></c:import>
	<center>
		<div style="width: 500px; padding-top: 4%">
			<form action="" method="post" class="form-horizontal">
				<h1>管理员登录</h1>
				<br>
				<div class="control-group form-group"
					style="display: flex; margin-left: 20%;">
					<label for="name" class="control-label">用户名&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;</label><input
						class=" form-control" type="text" placeholder="请输入用户名"
						style="width: 200px">


				</div>
				<div class="control-group form-group"
					style="display: flex; margin-left: 20%;">
					<label for="name" class="control-label">密&nbsp;&nbsp;码1&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;</label><input
						class=" form-control " type="text" placeholder="请输入密码"
						style="width: 200px">
				</div>
				<div class="control-group form-group"
					style="display: flex; margin-left: 20%;">
					<label for="name" class="control-label">密&nbsp;&nbsp;码2&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;</label><input
						class=" form-control " type="text" placeholder="请输入密码"
						style="width: 200px">
				</div>
				<div class="control-group form-group"
					style="display: flex; margin-left: 20%;">
					<label for="name" class="control-label">密&nbsp;&nbsp;码3&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;</label><input
						class=" form-control " type="text" placeholder="请输入密码"
						style="width: 200px">
				</div>
				<div class="control-group" style="display: flex; margin-left: 20%;">
					<label for="name" class="control-label"
						style="display: inline-block;">验证码&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;</label><input
						class=" form-control" type="text" placeholder="请输入验证码"
						style="width: 200px">
				</div>


				<div class="control-group form-group">
					<div class="col-sm-10">
						<img id="captcha" style="height: 34px;" alt="验证码"
							onclick="flash()" src="captcha.action"> <span
							style="color: red">${requestScope.mes }</span>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="checkbox">
							<label><input type="checkbox">请记住我</label>
						</div>
						<input type="submit" name="登录" class="btn"
							style="margin-top: 20px;" />
					</div>
				</div>



			</form>

		</div>

	</center>
	<c:import url="foot.jsp"></c:import>
</body>
</html>