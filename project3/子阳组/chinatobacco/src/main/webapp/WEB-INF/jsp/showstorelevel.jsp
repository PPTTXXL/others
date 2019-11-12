<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<c:import url="common.jsp"></c:import>
</head>
<body>

	<c:import url="navuser.jsp"></c:import>
	<div style="margin: 0 5%">
		<form method="post">
			<h1>商户等级信息展示</h1>
			<table class="table table-hover">
				<tr>
					<th>等级编号</th>
					<th>等级名称</th>
					<th>操作</th>
				</tr>
				<c:forEach var="storelevel" items="${list}">
					<tr>
						<td>${storelevel.lvid }</td>
						<td>${storelevel.lvname }</td>
						<td><input type="button"
							onclick="javascript:location.href='update.do?id=${store.storeid}'"
							value="修改" class="btn btn-default" /> <input type="button"
							class="btn btn-default" value="删除"
							onclick="javascript:location.href='delete.do?id=${store.storeid}'" /></td>
					</tr>
				</c:forEach>

			</table>
			<div class="form-group d1">
				<div class="col-sm-offset-2 col-sm-10">
					<a href="add.do"><input class="btn btn-default"
						style="margin-left: 30%;" type="button" value="添加" /></a>
				</div>
			</div>
		</form>
	</div>
	<c:import url="foot.jsp"></c:import>
</body>
</html>