<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせ</title>
</head>
<body>
    <h1>お問い合わせ</h1>

    <form action="register" method="POST">
        <label>お名前<input type="text" name="userName" placeholder="お名前"></label><br>
        <label>メールアドレス<input type="text" name="email" placeholder="XXXX@mail.com"></label><br>
        <label>件名<input type="text" name="userID"></label><br>
        <label>パスワード<input type="password" name="password"></label><br>
        <a href="test.html">トップに戻る</a><input type="submit" value="サイトアップ">
    </form>
</body>
</html>