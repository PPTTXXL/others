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

<title>修改商户</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<c:import url="common.jsp"></c:import>
<link rel="stylesheet" type="text/css" href="css/input.css">
<script src="js/pcc.js"></script>
</head>
<body>
	<c:import url="navstore.jsp"></c:import>
	<center>

		<form class="form-horizontal from" action="store/update1Save.do">
			<h1>修改商户</h1>
			<div class="form-group d1">
				<label for="inputEmail3" class="col-sm-2 control-label">姓名</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="inputEmail3"
						placeholder="请输入你的名称" name="storename">
						<input type="hidden" name="storeid" value="${storeid}">
				</div>
			</div>
			<div class="form-group d1">
				<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="inputPassword3"
						placeholder="请输入你的密码" name="password">
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
