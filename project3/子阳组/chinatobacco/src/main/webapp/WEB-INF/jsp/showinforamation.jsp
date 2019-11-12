<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示信息</title>
<c:import url="common.jsp"></c:import>
</head>
<body>
	<%-- <c:import url="navuser.jsp"></c:import> --%>
	<div style="width: 80%; margin: 0 auto;">
		<form action="inforamation/delete.do" method="post">
			<h1 style="margin: 50px 0px 30px 0px">显示信息</h1>
			<table class="table table-hover">
				<tr>
					<th><input type="checkbox" /></th>
					<th>信息编号</th>
					<th>员工名称</th>
					<th>标题</th>
					<th>概要</th>
					<th>正文</th>
					<th>操作</th>
				</tr>
				<c:forEach var="inforamation" items="${list}">
					<tr>
						<td><input name="ids" type="checkbox"
							value="${inforamation.infoid }" /></td>
						<td>${inforamation.infoid }</td>
						<td>${inforamation.user.uname}</td>
						<td>${inforamation.title }</td>
						<td>${inforamation.outline }</td>
						<td>${inforamation.info }</td>
						<td><input
							onclick="javascript:location.href='update.do?infoid=${inforamation.infoid }'"
							value="修改" type="button" class="btn btn-default" /></td>
					</tr>
				</c:forEach>
			</table>
			<div class="form-group d1">
				<div class="col-sm-offset-2 col-sm-10">
					<a href="add.do"><input class="btn btn-default"
						style="margin-left: 30%;" type="button" value="添加" /></a>
					<button type="reset" class="btn btn-default">删除</button>
				</div>
			</div>
		</form>
	</div>
	<c:import url="foot.jsp"></c:import>
</body>
</html>