<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>アカウント作成</title>
</head>
<body>
    <h1>アカウント作成</h1>
    <p>アカウントをお持ちの方は　<a href="LoginCustmer.jsp">サイトイン</a></p>

    <form action="register" method="POST">
        <label>お名前: <input type="text" name="userMei" placeholder="姓"><input type="text" name="userSei" placeholder="名"></label><br>
        <label>メールアドレス: <input type="text" name="email" placeholder="XXXX@mail.com"></label><br>
        <label>ID: <input type="text" name="userID"></label><br>
        <label>パスワード: <input type="password" name="password"></label><br>
        <a href="test.html">トップに戻る</a><input type="submit" value="サイトアップ">
    </form>
</body>
</html>