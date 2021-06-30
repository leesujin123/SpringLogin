<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
</head>
<body>
<form action="login.do" method="post">
    <div class="input-wrap">
        <input type="text" name="memberId"  placeholder="ID"
               required="">
        <input type="password"  name="memberPwd"  placeholder="PASSWORD"
               required="">
        <input type="submit">
    </div>
</form>
</body>
</html>
