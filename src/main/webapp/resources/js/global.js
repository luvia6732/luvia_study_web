$(document).ready(function() {
	// 기본 앞, 뒤 trim
	$('input.triming').keyup(function() {
		$(this).val( $.trim( $(this).val() ) );
	}).blur(function() {
		$(this).trigger("keyup");
	});
	
	// 공백 비허용
	$('input.no-spacing').keyup(function() {
		$(this).val( $(this).val().replace( /[ ]/g, '' ) );
	}).blur(function() {
		$(this).trigger("keyup");
	});
});

// val 값 검증, 빈 값 일때 true 반환.
function isEmpty( val ) {
	if( val == null || val == undefined || val == '' ) {
		return true;
	}
	return false;
}