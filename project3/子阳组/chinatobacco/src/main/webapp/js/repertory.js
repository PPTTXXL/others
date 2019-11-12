
	$(function () {
		// 仓库名称加载出来
		$.post("./commodity/list1.do", {}, function(result) {

			console.log(result);
			var html = "";
			// 将集合遍历到一个html字符串中
			$.each(result.list, function(i, data) {
				html += "<option value='" + data.comid + "'>" + data.comname
						+ "</option>";
			});
			// 将html放入到页面里面
			console.log(12);
			console.log(html);
			$("#comid").html(html);
		}, "json");
		// 货架名称加载出来
		$.post("./location/list1.do", {}, function(result) {
			
			console.log(result);
			var html = "";
			// 将集合遍历到一个html字符串中
			$.each(result.list, function(i, data) {
				html += "<option value='" + data.locid + "'>" + data.locid
						+ "</option>";
			});
			// 将html放入到页面里面
			console.log(12);
			console.log(html);
			$("#locid").html(html);
		}, "json");
	});