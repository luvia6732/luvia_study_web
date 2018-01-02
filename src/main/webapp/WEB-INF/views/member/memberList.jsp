<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
   	<title>${CONSTANTS.serviceTitle }</title>
   	<!-- bootstrap CSS-->
    <link href="/resources/bootstrap-3.3.2-dist/css/bootstrap.min.css" rel="stylesheet">
   	<!-- jQuery -->
   	<script type="text/javascript" src="/resources/js/jquery-3.2.1.min.js"></script>
   	<!-- bootstrap JS -->
    <script type="text/javascript" src="/resources/bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
   	<!-- Custom JS -->
   	<script type="text/javascript" src="/resources/js/global.js"></script>
   	<script type="text/javascript" src="/resources/js/common.js"></script>   	
   	<!-- Custom CSS -->
   	<link href="/resources/css/navbar.css" rel="stylesheet">
   	<link href="/resources/css/jumbotron-narrow.css" rel="stylesheet">   	
   	<link href="/resources/css/menubar.css" rel="stylesheet">
   	   	
</head>
<body>
	<c:import url="/include/header"/>	
	<c:import url="/include/menubar"/>
	
	<div>
		<h1>이 페이지는 memberList 페이지 입니다</h1>
	</div>
	
	<c:import url="/include/footer"/>
</body>
</html>