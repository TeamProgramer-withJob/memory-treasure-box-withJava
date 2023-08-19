<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%-- リクエスト属性からアカウント情報を取得 --%>
<@ page import="com.memorytreasurebox.customerRegist.model.CustomerRegistModel" %>
<% CustomerRegistModel customer = (CustomerRegistModel) request.getAttribute("newAccount"); %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>アカウント確認画面</title>
</head>
<body>
	<h1>確認画面</h1>

	<p>ユーザー名: <%= account.getUsername() %></p>
	<p>パスワード: <%= account.getPassword() %></p>

</body>
</html>