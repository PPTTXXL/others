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

<title>我的订单</title>

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
	<div style="width: 80%; margin: 0 auto">

		<form name=alipayment method="post" action="alipay.trade.page.pay.jsp"
			target="_blank">
			<h1>订单</h1>
			<table class="table table-hover" id="table">
				<tr>
					<th>商品</th>
					<th>单价</th>
					<th>数量</th>

				</tr>
				<c:forEach var="cbaglist" items="${indent.cbaglist}">
					<tr>
						<td>${cbaglist.commodity.comname }</td>
						<td>${cbaglist.commodity.price }</td>
						<td>${cbaglist.spnum}</td>
					</tr>
				</c:forEach>
				<tr>
					<td>订单号：${indent.indentid}<br> <c:if
							test="${indent.indentstate.stateid!=1}">
							支付宝交易号：${indent.payid}
						</c:if></td>
					<td>创建日期：${indent.screatedate}<br> <c:if
							test="${indent.indentstate.stateid!=1}">
							成交日期：${indent.senddate}
						</c:if>
					</td>

					<td>总价：<span style="color: red;">${indent.grossprice}</span></td>
				</tr>
			</table>
			<input value="${indent.indentid}" type="hidden" id="WIDout_trade_no"
				name="WIDout_trade_no" /> <input
				value="${indent.store.storename}订货单" type="hidden" id="WIDsubject"
				name="WIDsubject" /> <input value="${indent.grossprice}"
				type="hidden" id="WIDtotal_amount" name="WIDtotal_amount" /> <input
				value="" type="hidden" id="WIDbody" name="WIDbody" />
			<c:if test="${indent.indentstate.stateid==1}">
				<div class="form-group d1">
					<div class="col-sm-offset-2 col-sm-10">
						<input type="submit" class="btn btn-default" style="float: right"
							value="付款" id="sub">
					</div>
				</div>
			</c:if>
			<c:if test="${indent.indentstate.stateid!=1}">
				<div class="form-group d1">
					<div class="col-sm-offset-2 col-sm-10">
						<h3>状态：已完成</h3>
					</div>
				</div>
			</c:if>

		</form>



	</div>
	<c:import url="foot.jsp"></c:import>
</body>
</html>
