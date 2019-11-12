
$(function() {
	//等级加载出来
	$.post("./storelevel/list1.do", {}, function(result) {
		
		console.log(result);
		var html = "<option value='0'></option>";
		// 将集合遍历到一个html字符串中
		$.each(result.list, function(i, data) {
			html += "<option value='" + data.lvid + "'>" + data.lvname
					+ "</option>";
		});
		// 将html放入到页面里面
		console.log(12);
		console.log(html);
		$("#lvid").html(html);
	}, "json");
	
	
	
	//商品状态加载出来
	$.post("./comstate/showcomstate.do", {}, function(result) {
		
		console.log(result);
		var html = "<option value='0'></option>";
		// 将集合遍历到一个html字符串中
		$.each(result.list, function(i, data) {
			html += "<option value='" + data.stareid + "'>" + data.stareid
					+ "</option>";
		});
		// 将html放入到页面里面
		console.log(12);
		console.log(html);
		$("#stareid").html(html);
	}, "json");
	
	
	
	//角色id加载出来
	$.post("role/showrole1.do", {}, function(result) {
		console.log(result);
		var html = "<option value='0'></option>";
		// 将集合遍历到一个html字符串中
		$.each(result.list, function(i, data) {
			html += "<option value='" + data.roleid + "'>" + data.roleid
					+ "</option>";
		});
		// 将html放入到页面里面
		console.log(12);
		console.log(html);
		$("#roleid").html(html);
	}, "json");
	
	//角色加载出来
	$.post("role/showrole1.do", {}, function(result) {
		console.log(122132);
		console.log(result);
		var html = "<option value='0'></option>";
		// 将集合遍历到一个html字符串中
		$.each(result.list, function(i, data) {
			html += "<option value='" + data.roleid + "'>" + data.name
					+ "</option>";
		});
		// 将html放入到页面里面
		console.log(12);
		console.log(html);
		$("#name").html(html);
	}, "json");
	
	//商品类型加载出来
	$.post("commodity/showcommodity.do", {}, function(result) {
		console.log(122132);
		console.log(result);
		var html = "<option value='0'></option>";
		// 将集合遍历到一个html字符串中
		$.each(result.list, function(i, data) {
			html += "<option value='" + data.comtypeid + "'>" + data.comtypename
					+ "</option>";
		});
		// 将html放入到页面里面
		console.log(12);
		console.log(html);
		$("#comtypeid").html(html);
	}, "json");
	
	//页面加载就将省分加载出来
	$.post("./pcc/pfind.do", {}, function(result) {
		console.log(result);
		var html = "<option value='0'></option>";
		// 将集合遍历到一个html字符串中
		$.each(result.list, function(i, data) {
			html += "<option value='" + data.provinceID + "'>" + data.province
					+ "</option>";
		});
		// 将html放入到页面里面
		console.log(12);
		console.log(html);
		$("#provincedId").html(html);
	}, "json");
});
// 显示出所有的市
function showCity(provincedId) {
	$.post("./pcc/cfind.do", {
		provinceId : provincedId
	}, function(result) {
		console.log(result);
		var html = "<option value='0'></option>";
		$.each(result.list, function(i, data) {
			html += "<option value='" + data.cityID + "'>" + data.city
					+ "</option>";
		});
		// 将html放入到页面里面
		console.log(html);
		$("#cityID").html(html);
	}, "json");
	showArea(0);
}
function showArea(cityID) {
	$.post("./pcc/cofind.do", {
		cityID : cityID
	}, function(result) {
		console.log(result);
		var html = "<option value='0'></option>";
		$.each(result.list, function(i, data) {
			html += "<option value='" + data.areaID + "'>" + data.areas
					+ "</option>";

		});
		// 将html放入到页面里面
		console.log("id");
		console.log(html);
		$("#areaID").html(html);
	}, "json");

}