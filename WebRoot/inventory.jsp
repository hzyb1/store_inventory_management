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
							<li class="on" style="box-sizing: initial;-webkit-box-sizing: initial;">库存管理</li>
							<li class="" style="box-sizing: initial;-webkit-box-sizing: initial;">出库单</li>
							<li class="" style="box-sizing: initial;-webkit-box-sizing: initial;">出库记录</li>
							<li class="" style="box-sizing: initial;-webkit-box-sizing: initial;">商品入库</li>
							<li class="" style="box-sizing: initial;-webkit-box-sizing: initial;">入库单</li>
							<li class="" style="box-sizing: initial;-webkit-box-sizing: initial;">入库记录</li>
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
												<th>商品名称 </th>
												<th>商品数量</th>
												<th>入库时间</th>
												<th>出库</th>
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
												<td class="edit"><button onclick="btn_out(${user.id})"><i class="icon-edit bigger-120"></i>出库</button></td>
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
				<ul style="display: block;padding: 20px;">
							<li>
								<!--分页显示角色信息 start-->
								<div id="dv1">
									<table class="table" id="tbRecord">
										<thead>
											<tr>
												<th>编号</th>
												<th>商品名称</th>
												<th>商品分类</th>
												<th>出库数量 </th>
												<th>出库日期</th>
												<th>编辑</th>
												<th>删除</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
									<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
											
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
											
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
											
											
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
											
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
											
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
						<form class="am-form am-form-horizontal"
							action="user/addUser1Submit.action" method="post">
						
							<div class="am-form-group">
								<label for="user-email" class="am-u-sm-3 am-form-label">
								分类</label>
								<div class="am-u-sm-9">
									<select name="groupId" required>
										<option value="">请选择分类</option>
										
										
									</select> <small>分类</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-email" class="am-u-sm-3 am-form-label">
							商品名称</label>
								<div class="am-u-sm-9">
									<select name="groupId" required>
										<option value="">请选择商品</option>
										
										
									</select> <small>商品</small>
								</div>
							</div>
							
							<div class="am-form-group">
								<label for="name" class="am-u-sm-3 am-form-label">
									数量</label>
								<div class="am-u-sm-9">
									<input type="text" id="name" required
										placeholder="数量" name="name">
										<small>数量</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-intro" class="am-u-sm-3 am-form-label">
									备注</label>
								<div class="am-u-sm-9">
									<textarea class="" rows="5" id="user-intro" name="remark"
										placeholder="输入备注"></textarea>
									<small>250字以内...</small>
								</div>
							</div>
							<div class="am-form-group">
								<div class="am-u-sm-9 am-u-sm-push-3">
									<input type="submit" class="am-btn am-btn-success" value="添加分类" />
								</div>
							</div>
						</form>
					</div>
				</div>
				</div>
				</div>
				</div>
				</div>
				</ul>
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
				<ul style="display: block;padding: 20px;">
							<li>
								<!--分页显示角色信息 start-->
								<div id="dv1">
									<table class="table" id="tbRecord">
										<thead>
											<tr>
												<th>编号</th>
												<th>商品名称</th>
												<th>商品分类</th>
												<th>出库数量 </th>
												<th>出库日期</th>
												<th>编辑</th>
												<th>删除</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
									<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
											
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
											
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
											
											
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
											
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
												<tr>
												<td>1</td>
												<td>商品1</td>
												<td>肉类</td>
												<td>1000</td>
												<td>2012-12-10</td>
												<td class="edit"><button onclick="btn_edit(1)"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(1)"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
											
										</tbody>
									
									</table>
								</div>
								<!--分页显示角色信息 end-->
							</li>
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