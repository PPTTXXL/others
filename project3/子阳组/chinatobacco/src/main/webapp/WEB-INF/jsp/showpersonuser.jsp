<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工个人信息展示</title>
<c:import url="common.jsp"></c:import>
</head>
<body>

	<c:import url="navuser.jsp"></c:import>
	<div style="margin: 0 5%">
		<form action="selectById.do" method="post">
			<h1>员工个人信息展示</h1>
			<table class="table table-hover">
				<tr>
					<th>员工编号</th>
					<th>角色</th>
					<th>员工姓名</th>
					<th>性别</th>
					<th>住址</th>
					<th>操作</th>
				</tr>
				<tr>
					<td>${user.uid }</td>
					<td>${user.role.name}</td>
					<td>${user.uname }</td>
					<td>${user.usex }</td>
					<td>${user.uaddr }</td>
					<td><input
						onclick="javascript:location.href='update1.do?id=${user.uid }'"
						value="修改" type="button" /></td>
				</tr>
			</table>
		</form>
	</div>
	<c:import url="foot.jsp"></c:import>

</body>
</html>