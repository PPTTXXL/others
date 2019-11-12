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
<title>用户登录</title>
<c:import url="common.jsp"></c:import>
</head>
<body style="margin: 0; padding: 0; background-color: #f0fcff">
	<c:import url="navstore.jsp"></c:import>
	<div style="width: 100%">
		<div
			style="text-align: center; width: 500px; padding-top: 8%; margin: 0 auto">

			<form action="login.do" method="post" class="form-horizontal">
				<h1>商户登录</h1>
				<br>
				<div class="control-group form-group"
					style="display: flex; margin-left: 20%;">
					<label for="name" class="control-label">商户编号&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;</label><input
						class=" form-control" type="text" placeholder="请输入商户编号"
						style="width: 200px" name="storeid">
				</div>
				<div class="control-group form-group"
					style="display: flex; margin-left: 20%;">
					<label for="name" class="control-label">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:&nbsp;&nbsp;&nbsp;&nbsp;</label><input
						class=" form-control " type="password" placeholder="请输入密码"
						style="width: 200px" name="password">
				</div>


				<div class="control-group">
					<div class="controls">
						<div class="checkbox">
							<label><input type="checkbox">请记住我</label>

						</div>
						<input type="submit" class="btn" style="margin-top: 20px;"
							value="登录" />
					</div>
				</div>

			</form>
		</div>
	</div>
	<c:import url="foot.jsp"></c:import>
</body>
</html>