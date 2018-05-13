<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<title>${empty user_id ? "添加用户" : "修改用户"}</title>
</head>
<body>

<c:if test="${user_id == null}">
<form action="create" method="post">
</c:if>

<c:if test="${user_id != null}">
<form action="../update" method="post" enctype="application/x-www-form-urlencoded;charset=UTF-8">
	<input type="hidden" name="user_id" value="${user.user_id}"/>
	<br />
</c:if>
	用户名称<input type="text" name="username" value="${user.username}" />
	<br />
	年龄<input type="text" name="age" value="${user.age}"/>
	<br />

	<input type="submit" value="保存" />
</form>

</body>
</html>