<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<c:import url="common.jsp"></c:import>
</head>
<body>
	<c:import url="navuser.jsp"></c:import>
	<form action="commodity/delete.do" method="post">
		<h1>商品信息展示</h1>
		<table class="table table-hover">
			<tr>
				<th><input type="checkbox" /></th>
				<th>商品编号</th>
				<th>商品类型编号</th>
				<th>商品类型</th>
				<th>商品名称</th>
				<th>商品价格</th>
				<th>商品图片地址</th>
				<th>商品状态</th>
				<th>商品状态</th>
				<th>商品详情</th>
			</tr>
			<c:forEach var="commodity" items="${list}">
				<tr>
					<td><input name="ids" type="checkbox"
						value="${commodity.comid }" /></td>
					<td>${commodity.comid }</td>
					<td>${commodity.comtypeid}</td>
					<td>${commodity.comtype.comtypename}</td>
					<td>${commodity.comname}</td>
					<td>${commodity.price}</td>
					<td>${commodity.comimg}</td>
					<td>${commodity.stareid}</td>
					<td>${commodity.comstate.statename}</td>
					<td>${commodity.info}</td>
					<td><input
						onclick="javascript:location.href='commodity/update.do?id=${commodity.comid }'"
						value="修改" type="button" /> <input
						onclick="javascript:location.href='commodity/success.do?id=${commodity.comid }'"
						value="查看图片" type="button" /></td>
				</tr>
			</c:forEach>
		</table>
		<div class="form-group d1">
			<div class="col-sm-offset-2 col-sm-10">
				<a href="commodity/add.do"><input class="btn btn-default"
					style="margin-left: 30%;" type="button" value="添加" /></a>
				<button type="reset" class="btn btn-default">删除</button>
			</div>
		</div>
	</form>
	
	<c:import url="foot.jsp"></c:import>

</body>
</html>