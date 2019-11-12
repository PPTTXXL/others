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

<title>我的购物车</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<c:import url="common.jsp"></c:import>
<link rel="stylesheet" type="text/css" href="css/input.css">
<!-- JS代码，将前端数据打包到一个集合，传递给控制器 -->
<script src="js/shopcar.js"></script>
</head>
<body>
	<c:import url="navstore.jsp"></c:import>
	<div style="width: 80%; margin: 0 auto">

			<h1>购物车</h1>
			<table class="table table-hover" id="table">
				<tr>
					<th><input type="checkbox" /></th>
					<th>商品</th>
					<th>价格</th>
					<th>数量</th>
					<th>操作</th>
				</tr>
				<c:forEach var="shopcar" items="${list}">
					<tr>
						<td><input name="comid" type="checkbox"
							value="${shopcar.commodity.comid }" /></td>
						<td>${shopcar.commodity.comname }</td>
						<td>${shopcar.commodity.price}</td>
						<td><input class="input-mini" type="number" name="spnum"
							min="1" value="1"></td>
						<td><input
							onclick="javascript:location.href='user/update.do?id=${user.uid }'"
							value="移除" type="button" /></td>
					</tr>
				</c:forEach>
			</table>
			<div class="form-group d1">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="button" class="btn btn-default" style="float: right"
						value="创建订单" id="sub" onclick="fun()">
				</div>
			</div>





	</div>
<c:import url="foot.jsp"></c:import>

</body>
</html>
