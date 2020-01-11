<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ taglib uri="/struts-tags" prefix="s"%>  

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
							<li class="on" style="box-sizing: initial;-webkit-box-sizing: initial;">查看用户</li>
							<li class="" style="box-sizing: initial;-webkit-box-sizing: initial;">添加用户</li>
						</ul>
					</div>
					<div class="bd">
						<ul style="display: block;padding: 20px;">
							<li>
								<!--分页显示角色信息 start-->
								<div id="dv1">
									<table class="table" id="tbRecord">
										<thead>
											<tr>
												<th>编号</th>
												<th>姓名 </th>
												<th>电话号</th>
												<th>性别</th>
												<th>籍贯</th>
												<th>状态</th>
												<th>修改</th>
												<th>删除</th>
											</tr>
										</thead>
										<tbody>
					
											<s:set name="users" value="#session['users']" />
											<s:iterator value ="users" var="mycontent" status="st" id="user">
											<tr>
												<td><s:property value="id" /></td>
												<td><s:property value="name" /></td>
												<td><s:property value="phone" /></td>
												<td><s:property value="sex" /></td>
												<td><s:property value="place" /></td>
												<s:if test='#user.state==0'>
							     					<td>禁用</td>
        										</s:if>
        										<s:elseif test='#user.state==1'>
        											<td>正常</td>
        										</s:elseif>
												<td class="edit"><button onclick="btn_edit(${user.id})"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(${user.id})"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
											</s:iterator> 
										</tbody>
									</table>
								</div>
								<!--分页显示角色信息 end-->
							</li>
						</ul>
						<ul class="theme-popbod dform" style="display: none;">
							<div class="am-cf admin-main" style="padding-top: 0px;">
			<!-- content start -->
						<div class="am-cf admin-main" style="padding-top: 0px;">
		<!-- content start -->
		<div class="admin-content">
			<div class="admin-content-body">
				
				<div class="am-g">
					<div class="am-u-sm-12 am-u-md-4 am-u-md-push-8">
						
					</div>
					<div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4"
						style="padding-top: 30px;">
						<s:form class="am-form am-form-horizontal"
							action="addUser" method="post" theme="simple">
						
							<div class="am-form-group">
								<label for="user-name" class="am-u-sm-3 am-form-label">
									姓名 / Name </label>
								<div class="am-u-sm-9">
									<s:textfield  id="user-name" required="required"
										placeholder="姓名 / Name" name="user.name"/>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-name" class="am-u-sm-3 am-form-label">
									性别 / sex </label>
								<div class="am-u-sm-9" style="line-height: 30px;">
									<s:radio name="user.sex" list="#{'男':'男','女':'女'}"/>
									 <br /> <small>性别...</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-email" class="am-u-sm-3 am-form-label">
									联系电话 / phone </label>
								<div class="am-u-sm-9">
									<s:textfield name="user.phone" id="user-phone" required="required"
										placeholder="请输入联系电话" /> <small>联系电话...</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-email" class="am-u-sm-3 am-form-label">
									籍贯 / place </label>
								<div class="am-u-sm-9">
									<s:textfield name="user.place" id="user-email" required="required" placeholder="请输入籍贯"
										 /> <small>籍贯...</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-email" class="am-u-sm-3 am-form-label">
									账号 / Account </label>
								<div class="am-u-sm-9">
									<s:textfield name="user.account" id="user-email" required="required"
										placeholder="输入账号"  /> <small>登陆账号...</small>
								</div>
							</div>
							
				
						
							<div class="am-form-group">
								<label for="user-intro" class="am-u-sm-3 am-form-label">
									密码/ Password </label>
								<div class="am-u-sm-9">
									<s:textfield id="user-intro" name="user.password" required="required"
										placeholder="输入密码"/>
									<small>15字以内...</small>
								</div>
							</div>
							<div class="am-form-group">
								<div class="am-u-sm-9 am-u-sm-push-3">
									<input type="submit" class="am-btn am-btn-success" value="添加用户" />
								</div>
							</div>
						</s:form>
					</div>
				</div>
			</div>
			</div>
			</div>
			</div>
			</ul>

			</div>

			
			 <script src="js/jquery-1.7.2.min.js" type="text/javascript"></script>
              <script src="js/plugs/Jqueryplugs.js" type="text/javascript"></script>
              <script src="js/_layout.js"></script>
             <script src="js/plugs/jquery.SuperSlide.source.js"></script>
			<script>
				var num = 1;
				$(function() {

				 $(".tabs").slide({ trigger: "click" });

				});
				var btn_edit = function(id) {
					window.location.href='updateUserForm.action?id='+id;
				}
				var btn_delete = function(id) {
				$.jq_Confirm({
						message: "您确定要删除吗?",
						btnOkClick: function() {
							window.location.href='deleteUser.action?id='+id;
							
						}
					});
				}
					
			</script>

		</div>
	</body>

</html>