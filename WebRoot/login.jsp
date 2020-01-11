<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
<script type="text/javascript">
 //错误提示信息
 var msg=""+'${message}'; 
 if(msg!=""){ 
    alert(msg); 
 } 
    //-->
</script>
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
                <s:form action="login" method="post" theme="simple">
                    <div class="inputLi">
                            <s:textfield name="user.account" class="user" autofocus="autofocus" title="账户" placeholder="请输入账户" required="required"/>
                    </div>
                    <div class="inputLi">
                            <s:textfield type="password" name = "user.password" class="pwd" title="密码" placeholder="请输入密码" required="required"/>
                    </div>
                    <div class="button-group">
                        <button>登录</button>
                    </div>
                 </s:form>
            </div>
        </div>
    </div>
</body>
</html>