<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<c:set var="bp" value="<%=basePath%>"></c:set>

<link href="${bp}/css/bootstrap.min.css" rel="stylesheet">
<%-- <link href="${bp}/statics/css/bootstrap-theme.css.map" rel="stylesheet">
<link href="${bp}/statics/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="${bp}/statics/css/bootstrap-theme.min.css.map" rel="stylesheet">
<link href="${bp}/statics/css/bootstrap.css.map" rel="stylesheet">
<link href="${bp}/statics/css/bootstrap.css" rel="stylesheet">
<link href="${bp}/statics/css/bootstrap.min.css.map" rel="stylesheet"> --%>
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="${bp}/js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="${bp}/js/bootstrap.min.js"></script>
<%-- <script src="${bp}/statics/js/bootstrap.js"></script>
<script src="${bp}/statics/js/npm.js"></script> --%>
