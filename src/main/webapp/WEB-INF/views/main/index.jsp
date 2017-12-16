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
   	<script type="text/javascript" src="/resources/js/global.js"></script>
   	<script type="text/javascript">
   		$(document).ready(function() {
   			
   			$('#mbrName').keydown( function(e) {
   				if(e.keyCode == 13) {
   					$('#mbrPw').focus();
   				}
   			});
   			
   			$('#mbrPw').keydown( function(e) {
   				if(e.keyCode == 13) {
   					$('#loginBtn').click();
   				}
   			});
   			
   			$('#loginBtn').click( function() {
   				var mbrName = $('#mbrName').val();
   				var mbrPw = $('#mbrPw').val();
   				
   				if ( isEmpty(mbrName) ) {
   					alert('아이디 입력');
   					$('#mbrName').focus();
   					return;
   				}
   				if ( isEmpty(mbrPw) ) {
   					alert('비밀번호 입력');
   					$('#mbrPw').focus();
   					return;
   				}
   				
   				/*
   				{
   					'resCode' : '0000',
   					'resMsg' : 'SUCCESS'
   				}
   				*/
   				
   				$.ajax({
   					url : '/main/ajax/login',
   					data : 'mbrName=' + mbrName + '&mbrPw=' + mbrPw,
   					type : 'post',
   					cache : false,
   					success : function( data ) {
   						if( data.resCode != '0000' ) {
   							alert( data.resMsg );
   							return;
   						}
   						console.log( data.resCode );
   						console.log( data.resMsg );
   						
   					}, error : function( e ) {
   						alert("SERVER-ERROR");
   					}
   				});
   				
   			});
   			
   		});
   	</script>	
   	   	
</head>
<body>
	<c:import url="/include/header"/>
	
	<div class="wrap-content">
		<div class="loginDiv">
			<ul>
				<li>
					<span>닉네임: </span>
					<input type="text" class="w200 no-spacing" name="mbrName" id="mbrName" maxlength="20px" />
				</li>
				<li>
					<span>패스워드: </span>
					<input type="password" class="w200" name="mbrPw" id="mbrPw" maxlength="20px" />
				</li>
				<li>
					<button class="sky" id="loginBtn">로그인</button>
				</li>
			</ul>
		</div>
	</div>
	
	<c:import url="/include/footer"/>
</body>
</html>