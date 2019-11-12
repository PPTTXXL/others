<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订货商城</title>
<c:import url="common.jsp"></c:import>

<link rel="stylesheet" type="text/css" href="../css/shangpin.css" />
</head>
<body>
	<c:import url="navstore.jsp"></c:import>

	<div class="body">
		<c:forEach var="commodity" items="${list1}">
			<div class="kuai">
				<a href="#"><div class="imgs">
						<img alt="商品图片" src="../imgs/timg (1).jpg">
					</div></a>
				<div class=info>
					<a href="#"><p>${commodity.comname}</p></a>
					<p>价格：${commodity.price}元</p>
					<input type="hidden" id="cid" value="${commodity.comid}">
				</div>
				<div class="but">
					<span id="sca"> <a
						href="http://localhost:8080/chinatobacco/collect/add.do?comid=${commodity.comid}">收藏</a></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a
						href="http://localhost:8080/chinatobacco/shopcar/add.do?comid=${commodity.comid}">加入购物车</a>
				</div>
			</div>
		</c:forEach>
	</div>

	<c:import url="foot.jsp"></c:import>

</body>
</html>