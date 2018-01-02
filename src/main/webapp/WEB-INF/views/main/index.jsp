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

	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="/resources/image/theme1.jpg" class="img-responsive img-rounded">
				<!-- 이미 하단 자막 넣기
				<div class="carousel-caption">
					<h3>Title</h3>
					<p>Lorem Ipsum Dolar Sitt</p>
				</div> -->
			</div>

			<div class="item">
				<img src="/resources/image/theme2.jpg" class="img-responsive img-rounded">
				<!-- 이미 하단 자막 넣기
				<div class="carousel-caption">
					<h3>Title</h3>
					<p>Lorem Ipsum Dolar Sitt</p>
				</div> -->
			</div>

			<div class="item">
				<img src="/resources/image/theme3.jpg" class="img-responsive img-rounded">
				<!-- 이미 하단 자막 넣기
				<div class="carousel-caption">
					<h3>Title</h3>
					<p>Lorem Ipsum Dolar Sitt</p>
				</div> -->
			</div>
		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
			<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
			<span class="sr-only">Previous</span>
		</a>
		<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
			<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>


	<c:import url="/include/footer"/>
</body>
</html>