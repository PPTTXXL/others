function fun() {
	var a = $(":checked").parents("td").parents("tr")
	var com = []
	var b = [];
	$.each(a,
			function(index) {
				com[index] = a.eq(index).children("td").eq(0).find(
						"input:first").val();
				b[index] = a.eq(index).children("td").eq(3).find("input:first")
						.val();
				console.log(b[index]);
				console.log(a.eq(index).children("td").eq(0)
						.find("input:first").val());
			});
	var s1 = JSON.stringify(com);
	var s2 = JSON.stringify(b);
	console.log(s1);
	console.log(s2);
	$.ajax({
		type : "post",
		url : "./indent/add.do",
		data : {
			"cid" : s1,
			"num" : s2
		},
		success : function(result) {
			console.log(result);
			if (result.flagi) {
				window.location.href = "indent/one.do?indentid="
						+ result.indentid
			} else {
				window.location.href = "404.do"
			}
		},
		dataType : "JSON"
	});

	/*
	 * $.post("./indent/add.do", { "comid" : JSON.stringify(com), "spnum "
	 * :JSON.stringify(b) }, function() { console.log("进入ajax"); },
	 * "application");
	 */

	/*
	 * data : JSON.stringify(com), data : JSON.stringify(b) dataType:"json",
	 * contentType:"application/json",
	 */
}