var appUrl = "http://localhost:8080/rest/";

function ajaxGet(urlArg, cfunction) {
	$.ajax({
		url : appUrl + urlArg,
		dataType : 'json',
		success : cfunction
	});
}

function ajaxPost(urlArg, dataArg, cfunction) {
	$.ajax({
		type : 'POST',
		url : appUrl + urlArg,
		data : JSON.stringify(dataArg),
		async : false,
		contentType : "application/json",
		dataType : 'json',
		success : cfunction,
		error : function(e) {
			alert(e.message);
		}
	});
}