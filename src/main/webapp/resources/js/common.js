$(document).ready(function() {

	$('#mbrName').keydown(function(e) {
		if (e.keyCode == 13) {
			$('#mbrPw').focus();
		}
	});

	$('#mbrPw').keydown(function(e) {
		if (e.keyCode == 13) {
			$('#loginBtn').click();
		}
	});

	$('#loginBtn').click(function() {
		var mbrName = $('#mbrName').val();
		var mbrPw = $('#mbrPw').val();

		if (isEmpty(mbrName)) {
			alert('아이디 입력');
			$('#mbrName').focus();
			return;
		}
		if (isEmpty(mbrPw)) {
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
			url : '/include/header/ajax/login',
			data : 'mbrName=' + mbrName + '&mbrPw=' + mbrPw,
			type : 'post',
			cache : false,
			success : function(data) {
				if (data.resCode != '0000') {
					alert(data.resMsg);
					return;
				}
				console.log(data.resCode);
				console.log(data.resMsg);
				location.reload();

			},
			error : function(e) {
				alert("SERVER-ERROR");
			}
		});

	});
	
	$('#logoutBtn').click(function() {
		
		$.ajax({
			url : '/include/header/ajax/logout',
			data : '',
			type : 'post',
			cache : false,
			success : function(data) {
				if (data.resCode != '0000') {
					alert(data.resMsg);
					return;
				}
				alert( '정상적으로 로그아웃 했어.' )
				location.reload();

			},
			error : function(e) {
				alert("SERVER-ERROR");
			}
		});		
		
	});

});