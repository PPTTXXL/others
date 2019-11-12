$(function() {
	// 用户名称加载出来
	$.post("user/showuser1.do", {}, function(result) {

		console.log(result);
		var html = "<option value='0'>输出你的名字</option>";
		// 将集合遍历到一个html字符串中
		$.each(result.list, function(i, data) {
			html += "<option value='" + data.uid + "'>" + data.uname
					+ "</option>";
		});
		// 将html放入到页面里面
		console.log(12);
		console.log(html);
		$("#uname").html(html);
	}, "json");
	
});
