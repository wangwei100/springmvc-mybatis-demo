function deleteUser() {
	var user_id = $(this).attr("data-user_id");
	$.ajax({
		url : "user/delete",
		type : "post",
		data : {
			user_id : user_id
		},
		success : function(resp) {
			if ("success" == resp) {
				alert("删除成功");
				window.location.reload();// 刷新页面
			}
		}
	});
}

$(document).ready(function() {
	$("[data-opt=delete]").click(deleteUser);
});