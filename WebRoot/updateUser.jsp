<%@page import="model.User"%>
<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<script type="text/javascript">
 //错误提示信息
 var msg=""+'${message}'; 
 if(msg!=""){ 
    alert(msg); 
    window.location.href='checkAllUser.action';
 } 
    //-->
</script>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" />
		<link rel="stylesheet" href="css/Site.css" />
		<link rel="stylesheet" href="css/zy.all.css" />
		<link rel="stylesheet" href="css/font-awesome.min.css" />
		<link rel="stylesheet" href="css/amazeui.min.css" />
		<link rel="stylesheet" href="css/admin.css" />
	</head>
	<body>
		<div class="dvcontent">
			<div>
				<!--tab start-->
				<div class="tabs">
					<div class="hd">
						<ul>
							<li class="on" style="box-sizing: initial;-webkit-box-sizing: initial;">编辑用户</li>
						</ul>
					</div>
					<div class="admin-content">
			<div class="admin-content-body">
				
				<div class="am-g">
					<div class="am-u-sm-12 am-u-md-4 am-u-md-push-8">
						
					</div>
					<div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4"
						style="padding-top: 30px;">
						<s:form class="am-form am-form-horizontal"
							action="updateUser" method="post" theme="simple">
							<div class="am-form-group">
								<label for="user-name" class="am-u-sm-3 am-form-label">
									编号 / id </label>
								<div class="am-u-sm-9">
									<s:textfield  id="user-name" required="required"
										 name="changeUser.id" readonly="true"/>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-name" class="am-u-sm-3 am-form-label">
									姓名 / Name </label>
								<div class="am-u-sm-9">
									<s:textfield  id="user-name" required="required"
										 name="changeUser.name"/>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-name" class="am-u-sm-3 am-form-label">
									性别 / sex </label>
								<div class="am-u-sm-9" style="line-height: 30px;">
									<s:radio name="changeUser.sex" list="#{'男':'男','女':'女'}"/>
									 <br /> <small>性别...</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-name" class="am-u-sm-3 am-form-label">
									状态 / state </label>
								<div class="am-u-sm-9" style="line-height: 30px;">
									<s:radio name="changeUser.state" list="#{'1':'可用','0':'禁用'}"/>
									 <br /> <small>状态...</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-email" class="am-u-sm-3 am-form-label">
									联系电话 / phone </label>
								<div class="am-u-sm-9">
									<s:textfield name="changeUser.phone" id="user-phone" required="required"
										placeholder="请输入联系电话" /> <small>联系电话...</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-email" class="am-u-sm-3 am-form-label">
									籍贯 / place </label>
								<div class="am-u-sm-9">
									<s:textfield name="changeUser.place" id="user-email" required="required" placeholder="请输入籍贯"
										 /> <small>籍贯...</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-email" class="am-u-sm-3 am-form-label">
									账号 / Account </label>
								<div class="am-u-sm-9">
									<s:textfield name="changeUser.account" id="user-email" required="required"
										placeholder="输入账号"  /> <small>登陆账号...</small>
								</div>
							</div>
							
				
						
							<div class="am-form-group">
								<label for="user-intro" class="am-u-sm-3 am-form-label">
									密码/ Password </label>
								<div class="am-u-sm-9">
									<s:textfield id="user-intro" name="changeUser.password" required="required"
										placeholder="输入密码"/>
									<small>15字以内...</small>
								</div>
							</div>
							<div class="am-form-group">
								<div class="am-u-sm-9 am-u-sm-push-3">
									<input type="submit" class="am-btn am-btn-success" value="编辑用户" />
								</div>
							</div>
						</s:form>
					</div>
				</div>
			</div>
			
		</div>
							<!--添加角色 end--
						</ul>
					</div>
				</div>
				<!--tab end-->
			</div>
			 <script src="js/jquery-1.7.2.min.js" type="text/javascript"></script>
              <script src="js/plugs/Jqueryplugs.js" type="text/javascript"></script>
              <script src="js/_layout.js"></script>
             <script src="js/plugs/jquery.SuperSlide.source.js"></script>
			</div>
	</body>
</html>