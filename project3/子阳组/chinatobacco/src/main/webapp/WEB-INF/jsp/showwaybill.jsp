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
	<div style="margin: 0 5%">
		<form action="delete.action" method="post">
			<h1>员工信息展示</h1>
			<table class="table table-hover">
				<tr>
					<th><input type="checkbox" /></th>
					<th>运单号</th>
					<th>订单号</th>
					<th>商户名称</th>
					<th>配送日期</th>
					<th>配送地址</th>
				</tr>

				<c:forEach var="inv" items="${list }">
					<tr>
						<td><input name="ids" type="checkbox" value="${inv.id }" /></td>
						<td>${inv.id }</td>
						<td><a href="findById.action?id=${inv.id }">${inv.title }</a></td>
						<td>${inv.author }</td>
						<td>${inv.createdate }</td>
						<td><input
							onclick="javascript:location.href='update.action?id=${inv.id }'"
							value="修改" type="button" /></td>
					</tr>
				</c:forEach>

			</table>
			<div class="form-group d1">
				<div class="col-sm-offset-2 col-sm-10">
					<a href=""><input class="btn btn-default"
						style="margin-left: 30%;" type="button" value="添加" /></a>
					<button type="reset" class="btn btn-default">删除</button>
				</div>
			</div>
		</form>
	</div>
	<c:import url="foot.jsp"></c:import>
</body>
</html>