<%@page import="model.Supplier"%>
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
							<li class="on" style="box-sizing: initial;-webkit-box-sizing: initial;">编辑商品</li>
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
							action="updateSupplier" method="post" theme="simple">
							<div class="am-form-group">
								<label for="user-name" class="am-u-sm-3 am-form-label">
									编号 / id </label>
								<div class="am-u-sm-9">
									<s:textfield  id="user-name" required="required"
										 name="changeSupplier.id" readonly="true"/>
								</div>
							</div>
							<div class="am-form-group">
								<label for="name" class="am-u-sm-3 am-form-label">
									供应商名称</label>
								<div class="am-u-sm-9">
									<s:textfield  id="name" required="required"
										placeholder="供应商名称" name="changeSupplier.name"/>
										<small>10字以内...</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="name" class="am-u-sm-3 am-form-label">
									供应商电话</label>
								<div class="am-u-sm-9">
									<s:textfield  id="name" required="required"
										placeholder="供应商电话" name="changeSupplier.phone"/>
										<small>...</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="name" class="am-u-sm-3 am-form-label">
									供应商地址</label>
								<div class="am-u-sm-9">
									<s:textfield  id="name" required="required"
										placeholder="供应商地址" name="changeSupplier.address"/>
										<small>...</small>
								</div>
							</div>
							
				
						
							
							<div class="am-form-group">
								<div class="am-u-sm-9 am-u-sm-push-3">
									<input type="submit" class="am-btn am-btn-success" value="编辑商品" />
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