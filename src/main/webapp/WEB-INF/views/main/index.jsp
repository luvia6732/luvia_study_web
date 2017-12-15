<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
   	<title>${CONSTANTS.serviceTitle }</title>
   	<link rel="stylesheet" href="/resources/css/global.css" />
   	<link rel="stylesheet" href="/resources/css/layout.css" />
   	<script type="text/javascript" src="/resources/js/jquery-1.11.2.js"></script>
   	   	
</head>
<body>
	<c:import url="/include/header"/>
	
	<div class="wrap-content">
		로그인
	</div>
	
	<c:import url="/include/footer"/>
</body>
</html>