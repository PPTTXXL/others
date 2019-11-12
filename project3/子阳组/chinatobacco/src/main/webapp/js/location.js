
	$(function () {
		// 仓库名称加载出来
		$.post("./ent/list1.do", {}, function(result) {

			console.log(result);
	
			
			var html = "";
			// 将集合遍历到一个html字符串中
			$.each(result.list, function(i, data) {
				html += "<option value='" + data.entid + "'>" + data.entname
						+ "</option>";
			});
			// 将html放入到页面里面
			console.log(12);
			console.log(html);
			$("#entid").html(html);
		}, "json");
		// 货架名称加载出来
		$.post("./shelf/list1.do", {}, function(result) {
		
			console.log(result);
			var html = "";
			// 将集合遍历到一个html字符串中
			$.each(result.list, function(i, data) {
				html += "<option value='" + data.shelfid + "'>" + data.shelfname
						+ "</option>";
			});
			// 将html放入到页面里面
			console.log(12);
			console.log(html);
			$("#shelfid").html(html);
		}, "json");
	});