<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="container">
	<div class="header">
		<!-- Static navbar -->
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar" aria-expanded="false"
						aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="/">
						<span class="glyphicon glyphicon-star" aria-hidden="true"></span>eightStar</a>
				</div>
				<c:if test="${empty LoginInfo}">			
				<div id="navbar" class="navbar-collapse collapse">
					<form class="navbar-form navbar-right">
					<div class="form-group">
							<label for="mbrName" class="sr-only">Nickname</label>
							<input type="text" id="mbrName" name="mbrName" maxlength="20px"
								class="form-control" placeholder="Nickname">
					</div>
					<div class="form-group">	
							<label for="mbrPw" class="sr-only">Password</label>
							<input type="password" id="mbrPw" name="mbrPw" maxlength="20px"
								class="form-control" placeholder="Password">
					</div>		
					<button type="button" class="btn btn-primary" id="loginBtn">Sign in</button>
					</form>
				</div>	<!--/.navbar-collapse -->
				</c:if>
				
				<c:if test="${!empty LoginInfo }">
				<div id="navbar" class="collapse navbar-collapse">				
					<ul class="nav navbar-nav navbar-right">
						<li><a href="#">어서와, ${LoginInfo.mbrName } ! </a></li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
								aria-expanded="false">My Menu<span class="caret"></span></a>
							<ul class="dropdown-menu" role="menu">
								<li><a href="#"></a>메뉴1</li>
								<li><a href="#"></a>메뉴2</li>
								<li><a href="#"></a>메뉴3</li>
							</ul>
						</li>
						<li><button type="button" class="btn btn-warning navbar-btn" id="logoutBtn">Sign off</button></li>
					</ul>			
					<input type="hidden" name="hd-mbrSeq" id="hd-mbrSeq" value="${LoginInfo.mbrSeq }"/>
					<input type="hidden" name="hd-mbrName" id="hd-mbrName" value="${LoginInfo.mbrName }"/>
					<input type="hidden" name="hd-jobName" id="hd-jobName" value="${LoginInfo.jobName }"/>
					<input type="hidden" name="hd-jobRole" id="hd-jobRole" value="${LoginInfo.jobRole }"/>					
				</div>	<!--/.navbar-collapse -->	
				</c:if>
				
			</div>	<!--/.ontainer-fluid -->
		</nav>
	</div>