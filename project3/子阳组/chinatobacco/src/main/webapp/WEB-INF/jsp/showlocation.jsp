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

	<form action="location/delete.do" method="post">
		<h1>库位信息展示</h1>
		<table class="table table-hover">
			<tr>
				<th><input type="checkbox" /></th>
				<th>库位编号</th>
				<th>仓库名称</th>
				<th>货架名称</th>
				<th>操作</th>
			</tr>
			<c:forEach var="location" items="${list}">
				<tr>
					<td><input name="ids" type="checkbox" value="${repertory.locid }" /></td>
					<td>${location.locid}</td>
					<td>${location.ent.entname }</td>
					<td>${location.shelf.shelfname }</td>
					<td><input
						onclick="javascript:location.href='toupdate.do?locid=${location.locid}'"
						value="修改" type="button" /></td>
				</tr>
			</c:forEach>
		</table>
		<div class="form-group d1">
			<div class="col-sm-offset-2 col-sm-10">
				<a href="toadd.do"><input class="btn btn-default"
					style="margin-left: 30%;" type="button" value="添加" /></a>


				<button type="submit" class="btn btn-default">删除</button>
			</div>
		</div>
	</form>
	<c:import url="foot.jsp"></c:import>
</body>
</html>