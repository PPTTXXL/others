
function idblur() {
	var id1 = $("#roleid").val();
	$.ajax({
		type : 'post',
		url : 'check.action',
		data : {
			type : 2,
			id : id1
		},
		success : function(result) {
			console.log(result);
			if (result == "true") {
				$("#id_exit").html("");
			} else {
				$("#id_exit").html("ID已经存在！");
			}
		},
		dataType : 'text'
	});
}
/**
 * 校验是否成功，如果成功则提交表单
 * 
 * @return {Boolean}
 */
function check() {
	var pass1 = $("#pass1").val();
	var pass2 = $("#pass2").val();
	var name = $("#name").val();
	var name_exit = $("#name_exit").html();
	var did = $("#did").val();
	var tel = $("#tel").val();
	var card = $("#card").val();
	var age = $("#age").val();
	if (name == "") {
		alert("用户名不能为空");
		return false;
	}
	if (name_exit != "") {
		alert("用户名已经存在");
		return false;
	}
	if (pass1 == "") {
		alert("密码不能为空");
		return false;
	}
	if (age == "") {
		alert("年龄不能为空");
		return false;
	}

	if (did == "0") {
		alert("请选择客户类型")
		return false;
	}
	if (tel == "") {
		alert("请务必填写联系方式")
		return false;
	}
	if (card == "") {
		alert("本系统要求实名，请输入正确的身份证号码！")
		return false;
	}
	if (pass1 == pass2) {
		document.getElementsByTagName("form").item(0).submit();
	} else {
		alert("密码不相同");
		return false;
	}

}
function check1() {

	document.getElementsByTagName("form").item(0).submit();

}
function check2() {
	var pass1 = $("#pass1").val();
	var pass2 = $("#pass2").val();
	var did = $("#did").val();
	var tel = $("#tel").val();
	var card = $("#card").val();
	var age = $("#age").val();
	if (pass1 == "") {
		alert("密码不能为空");
		return false;
	}
	if (age == "") {
		alert("年龄不能为空");
		return false;
	}

	if (did == "0") {
		alert("请选择客户类型")
		return false;
	}
	if (tel == "") {
		alert("请务必填写联系方式")
		return false;
	}
	if (card == "") {
		alert("本系统要求实名，请输入正确的身份证号码！")
		return false;
	}
	if (pass1 == pass2) {
		document.getElementsByTagName("form").item(0).submit();
	} else {
		alert("密码不相同");
		return false;
	}

}
