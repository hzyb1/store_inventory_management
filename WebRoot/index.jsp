<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>登录</title>
    <link rel="stylesheet" href="./css/login.css">
</head>

<body>
    <div class="login">
        <div class="center">
            <div class="main">
                <div class="title"></div>
                <s:form action="login" method="post">
                    <div class="inputLi">
                            <s:textfield name="account" class="user" autofocus="autofocus" title="账户" placeholder="请输入账户" required/>
                    </div>
                    <div class="inputLi">
                            <s:password name = "password" class="pwd" title="密码" placeholder="请输入密码" required/>
                    </div>


                    <div class="button-group">
                        <s:submit value="登录"/>
                    </div>
                 </s:form>
            </div>
        </div>
    </div>
</body>
</html>
