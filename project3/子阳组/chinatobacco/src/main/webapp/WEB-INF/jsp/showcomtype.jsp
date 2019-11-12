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
	<form action="comtype/delete.do" method="post">
		<h1>商品类型展示</h1>
		<table class="table table-hover">
			<tr>
				<th><input type="checkbox" /></th>
				<th>商品类型编号</th>
				<th>商品类型名称</th>
			</tr>
			<c:forEach var="comtype" items="${list}">
				<tr>
					<td><input name="ids" type="checkbox" value="${comtype.comtypeid }" /></td>
					<td>${comtype.comtypeid }</td>
					<td>${comtype.comtypename}</td>
					<td><input
						onclick="javascript:location.href='comtype/update.do?id=${comtype.comtypeid }'"
						value="修改" type="button" /></td>
				</tr>
			</c:forEach>
		</table>
		<div class="form-group d1">
			<div class="col-sm-offset-2 col-sm-10">
				<a href="comtype/add.do"><input class="btn btn-default"
					style="margin-left: 30%;" type="button" value="添加" /></a>
				<button type="reset" class="btn btn-default">删除</button>
			</div>
		</div>
	</form>
	<c:import url="foot.jsp"></c:import>

</body>
</html>