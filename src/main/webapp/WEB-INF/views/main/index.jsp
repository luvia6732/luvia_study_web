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
   	   	
</head>
<body>
	<c:import url="/include/header"/>
	<!-- div로 구성할지, table로 구성할지 고민해보기.
	div 구성시 각 메뉴에 hover이벤트 발생시 직관적으로 알아보기 쉬운 style 적용이 가능하지만
	구현하기가 귀찮고........
	table은 그 반대 -->
	<div class="table-responsive">
		<table class="table table-condensed">
			<tr class="text-center">
				<td class="active">목록1</td>
				<td class="active">목록2</td>
				<td class="active">목록3</td>
				<td class="active">목록4</td>
				<td class="active">목록5</td>
				<td class="active">목록6</td>
				<td class="active">목록7</td>
				<td class="active">목록8</td>
			</tr>
		</table>
	</div>
	<div class="jumbotron">
		<h1>이번주의 공지사항</h1>
		<p>한줄 간단한 공지사항이 들어갈 공간이데 일단 크기가 얼마나 되야될지 몰라서 텍스트 내용을 막 늘려서 적어보고 있긴해</p>
		<p>
			<a class="btn btn-lg btn-primary" href="#" role="button">보러가기 &raquo;</a>
		</p>
	</div>
	<c:import url="/include/footer"/>
</body>
</html>