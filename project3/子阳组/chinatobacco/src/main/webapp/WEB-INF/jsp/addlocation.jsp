<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>添加货架</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<c:import url="common.jsp"></c:import>
<link rel="stylesheet" type="text/css" href="css/input.css">
<script src="js/shelf.js"></script>
</head>
<body>
	<c:import url="navuser.jsp"></c:import>
	<center>

		<form class="form-horizontal from" action="location/add.do">
			<h1>添加货物</h1>
			<div class="form-group d1">
				<label for="inputEmail3" class="col-sm-2 control-label">仓库名称:</label>
				<div class="col-sm-10">
					<select class="form-control" name="entid" id="entid"
						value="${location.ent.entname }"><option></option></select>
				</div>
			</div>
			<div class="form-group d1">
				<label for="inputEmail3" class="col-sm-2 control-label">货架名称:</label>
				<div class="col-sm-10">
					<select class="form-control" name="shelfid" id="shelfid"><option
							value="${location.shelf.shelfname }"></option></select>
				</div>
			</div>
			<div class="form-group d1">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">提交</button>
					<button type="reset" class="btn btn-default">重置</button>
				</div>
			</div>
		</form>



	</center>
	<c:import url="foot.jsp"></c:import>
</body>
</html>
