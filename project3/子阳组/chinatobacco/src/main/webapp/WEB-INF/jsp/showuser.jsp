<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<c:import url="common.jsp"></c:import>
</head>
<body>
	<c:import url="navuser.jsp"></c:import>
	<form action="" method="post">
		<div style="margin: 0 5%">
			<div style="display: flex;">
				<input class=" form-control" type="text" placeholder="请输入用户编号"
					style="width: 200px"> <select class="span3">
					<option>45</option>
					<option>4856</option>
					<option>78</option>
				</select> <input class=" form-control" type="text" placeholder="请输入用户性别"
					style="width: 200px"> <input class=" form-control"
					type="text" placeholder="请输入用户名字" style="width: 200px"> <input
					class=" form-control" type="text" placeholder="请输入用户地址"
					style="width: 200px">
				<button type="submit" class="btn btn-default">查询</button>
			</div>
		</div>
	</form>
	<form action="user/delete.do" method="post">
		<h1>员工信息展示</h1>
		<table class="table table-hover">
			<tr>
				<th><input type="checkbox" /></th>
				<th>员工编号</th>
				<th>角色</th>
				<th>员工姓名</th>
				<th>密码</th>
				<th>性别</th>
				<th>住址</th>
				<th>操作</th>
			</tr>
			<c:forEach var="user" items="${list}">
				<tr>
					<td><input name="ids" type="checkbox" value="${user.uid }" /></td>
					<td>${user.uid }</td>
					<td>${user.role.name}</td>
					<td>${user.uname }</td>
					<td>${user.password }</td>
					<td>${user.usex }</td>
					<td>${user.uaddr }</td>
					<td><input
						onclick="javascript:location.href='update.do?id=${user.uid }'"
						value="修改" type="button" /></td>
				</tr>
			</c:forEach>
		</table>
		<div class="form-group d1">
			<div class="col-sm-offset-2 col-sm-10">
				<a href="add.do"><input class="btn btn-default"
					style="margin-left: 30%;" type="button" value="添加" /></a>
				<button type="reset" class="btn btn-default">删除</button>
			</div>
		</div>
	</form>
	<c:import url="foot.jsp"></c:import>
</body>
</html>