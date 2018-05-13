<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<title>helloWorld</title>
</head>
<body>

	<a href="user/new">添加</a>

	<table>
		<thead>
			<tr>
				<td>用户id</td>
				<td>用户名</td>
				<td>年龄</td>
				<td>操作</td>
			</tr>
		</thead>
		<tbody>

			<c:forEach items="${users}" var="user">
				<tr>
					<td>${user.user_id}</td>
					<td>${user.username}</td>
					<td>${user.age}</td>
					<td>
						<a href="user/edit/${user.user_id}">更新</a>
						<input type="button" data-user_id="${user.user_id}" data-opt="delete" value="删除" />
					</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>


</body>

<script type="text/javascript" src="../../../js/lib/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="../../../js/user/users.js"></script>

</html>