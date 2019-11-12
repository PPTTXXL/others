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

<title>修改库存</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<c:import url="common.jsp"></c:import>
<link rel="stylesheet" type="text/css" href="css/input.css">
<script src="js/location.js"></script>
</head>
<body>
	<c:import url="navuser.jsp"></c:import>
	<%-- <center>  --%>

	<form class="form-horizontal from" style="margin: 0 auto;"
		action="location/update.do">
		<h1 style="text-align: center;">修改库位</h1>
		<div class="form-group d1">
			<label for="inputEmail3" class="col-sm-2 control-label">仓库名称:</label>
			<div class="col-sm-10">
				<select class="form-control" name="entid" id="entid"></select> <input
					type="hidden" name="locid" id="locid" value="${locid}" />
			</div>
		</div>
		<div class="form-group d1">
			<label for="inputEmail3" class="col-sm-2 control-label">货架名称:</label>
			<div class="col-sm-10">
				<select class="form-control" name="shelfid" id="shelfid"></select>
			</div>
		</div>
		<div class="form-group d1">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default"
					style="margin-left: 30%">提交</button>
				<button type="reset" class="btn btn-default">重置</button>
			</div>
		</div>
	</form>
	<%--  </center>  --%>
	<c:import url="foot.jsp"></c:import>
</body>
</html>
