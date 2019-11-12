<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的订单</title>
<c:import url="common.jsp"></c:import>
</head>
<body>

	<c:import url="navstore.jsp"></c:import>
	<div style="margin: 0 5%">
		<form action="" method="post">
			<h1>我的订单</h1>
			<table class="table table-hover">
				<tr>

					<th>订单编号</th>
					<th>总价</th>
					<th>创建时间</th>
					<th>成交时间</th>
					<th>状态</th>
					<th>支付单号</th>
				</tr>
				<c:forEach var="list" items="${list}">
					<tr>
						<td>${list.indentid }</td>
						<td>${list.grossprice }</td>
						<td>${list.screatedate}</td>
						<td>${list.senddate}</td>
						<td>${list.indentstate.statename}</td>
						<td>${list.payid}</td>

						<td><input
							onclick="javascript:location.href='http://localhost:8080/chinatobacco/indent/one.do?indentid=${list.indentid }'"
							value="详情" type="button" /></td>
					</tr>
				</c:forEach>

			</table>


		</form>
	</div>
	<c:import url="foot.jsp"></c:import>
</body>
</html>
