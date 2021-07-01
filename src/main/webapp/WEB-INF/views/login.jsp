<%@ page import="com.mysql.cj.Session" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<% String errMsg = (String)session.getAttribute("errMsg");
    if (errMsg == null) errMsg = "";
    session.invalidate(); %>
    <!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<form action="login.do" method="post">
    <div class="input-wrap">
        <input type="text" name="memberId"  placeholder="ID"
               required="">
        <input type="password"  name="memberPwd"  placeholder="PASSWORD"
               required="">
        <input type="submit" value="login">
    </div>
</form>
<br />
<div id="errMsg" style="color:red"><%=errMsg%></div>
</body>
</html>
