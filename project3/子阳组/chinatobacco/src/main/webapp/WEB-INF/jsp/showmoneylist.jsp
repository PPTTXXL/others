<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>账户流水</title>
<c:import url="common.jsp"></c:import>
</head>
<body>

	<c:import url="navuser.jsp"></c:import>
	<div style="margin: 0 5%">
		<form action="" method="post">
			<h1>账户流水</h1>
			<table class="table table-hover">
				<tr>

					<th>类型</th>
					<th>金额</th>
					<th>时间</th>
					<th>资金流向</th>
				</tr>
				<c:forEach var="list" items="${list}">
					<tr>
						<td>${list.moneylisttype.name }</td>
						<td>${list.moneynum }</td>
						<td>${list.sdate}</td>
						<td>${list.direction}</td>
				</c:forEach>

			</table>


		</form>
	</div>
	<c:import url="foot.jsp"></c:import>
</body>
</html>
