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
	<form action="role/delete.do" method="post">
		<h1>角色信息展示</h1>
		<table class="table table-hover">
			<tr>
				<th><input type="checkbox" /></th>
				<th>角色编号</th>
				<th>角色名称</th>
				<th>员工管理权限</th>
				<th>角色管理权限</th>
				<th>商户管理权限</th>
				<th>库位管理权限</th>
				<th>库存管理权限</th>
				<th>财务管理权限</th>
				<th>订单管理权限</th>
				<th>商品管理权限</th>
				<th>配送管理权限</th>
			</tr>
			<c:forEach var="role" items="${list}">
				<tr>
					<td><input name="ids" type="checkbox" value="${role.roleid }" /></td>
					<td>${role.roleid }</td>
					<td>${role.name}</td>
					<td>${role.empmanage }</td>
					<td>${role.rolemanage }</td>
					<td>${role.storemanage }</td>
					<td>${role.entrepotmanage }</td>
					<td>${role.repertorymanage }</td>
					<td>${role.financemanage }</td>
					<td>${role.indentmanage }</td>
					<td>${role.commoditymanage }</td>
					<td>${role.delivery }</td>

					<td><input
						onclick="javascript:location.href='update.do?id=${role.roleid }'"
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