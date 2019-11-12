<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>支付成功</title>
<style type="text/css">
div {
	margin: 100px auto;
	text-align: center;
}

h1 {
	color: red;
}
</style>

</head>

<body>
	<div>
		<h1>支付成功！</h1>
		<h3>成功支付：${total_amount}元</h3>
		<h3>订单号：${out_trade_no}</h3>
		<h3>支付宝交易号：${trade_no}</h3>
	</div>
	<c:import url="foot.jsp"></c:import>
</body>
</html>