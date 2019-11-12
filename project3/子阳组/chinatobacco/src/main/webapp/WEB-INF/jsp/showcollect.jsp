<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">

<title>我的收藏</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<c:import url="common.jsp"></c:import>
<link rel="stylesheet" type="text/css" href="css/input.css">
</head>
<body>
	<c:import url="navstore.jsp"></c:import>
	<div style="width: 60%; margin: 0 auto">

		<h1>我的收藏</h1>
		<table class="table table-hover" id="table">

			<c:if test="${list!=null}">
				<tr>
					<th>商品</th>
					<th>价格</th>
					<th>操作</th>
				</tr>
				<c:forEach var="collect" items="${list}">

					<tr>
						<td>${collect.commodity.comname }</td>
						<td>${collect.commodity.price }</td>
						<td><input onclick="javascript:location.href=''" value="移除"
							type="button" /> <input onclick="javascript:location.href='http://localhost:8080/chinatobacco/shopcar/add.do?comid=${collect.commodity.comid}'"
							value="加入购物车" type="button" /></td>
					</tr>
				</c:forEach>
			</c:if>
			<c:if test="${list.size()==0}">
				<div style="margin: 100px auto; text-align: center;">
					<h1 style="color: red">暂无收藏</h1>
				</div>
			</c:if>

		</table>






	</div>

</body>
</html>
