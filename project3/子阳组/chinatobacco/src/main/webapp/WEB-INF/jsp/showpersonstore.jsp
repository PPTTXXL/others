<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商户个人信息展示</title>
<c:import url="common.jsp"></c:import>
</head>
<body>

	<c:import url="navstore.jsp"></c:import>
	<div style="margin: 0 5%">
		<form  method="post"  action="selectOne1.do">
			<h1>商户个人信息展示</h1>
			<table class="table table-hover">
				<tr>
					<th>商户编号</th>
					<th>等级</th>
					<th>商户名称</th>
					<th>商户地址</th>
					<th>操作</th>
				</tr>
				<tr>
					<td>${store.storeid }</td>
					<td>${store.storelevel.lvname }</td>
					<td>${store.storename}</td>
					<td>${store.storeaddr}</td>
					<td><input
						onclick="javascript:location.href='update1.do?storeid=${store.storeid}'"
						value="修改" type="button" class="btn btn-default"/> 
				</tr>
			</table>
		</form>
	</div>
	<c:import url="foot.jsp"></c:import>
</body>
</html>
