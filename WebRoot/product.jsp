<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ taglib uri="/struts-tags" prefix="s"%>  

<html>
<script type="text/javascript">
 //错误提示信息
 var msg=""+'${message}'; 
 if(msg!=""){ 
    alert(msg); 
    window.location.href='checkAllProduct.action';
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
							<li class="on" style="box-sizing: initial;-webkit-box-sizing: initial;">查看商品</li>
							<li class="" style="box-sizing: initial;-webkit-box-sizing: initial;">添加商品</li>
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
												<th>商品价格</th>
												<th>商品条形码</th>
												<th>库存数量</th>
												<th>修改</th>
												<th>删除</th>
											</tr>
										</thead>
										<tbody>
											<s:set name="productVos" value="#session['productVos']" />
											<s:iterator value ="productVos" var="mycontent" status="st" id="productVo">
											<tr>
												<td><s:property value="id" /></td>
												<td><s:property value="name" /></td>
												<td><s:property value="price" /></td>
												<td><s:property value="barcode" /></td>
												<td><s:property value="amount" /></td>
												<td class="edit"><button onclick="btn_edit(${productVo.id})"><i class="icon-edit bigger-120"></i>编辑</button></td>
												<td class="delete"><button onclick="btn_delete(${productVo.id})"><i class="icon-trash bigger-120"></i>删除</button></td>
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
						<form class="am-form am-form-horizontal"
							action="addProduct" method="post">
						
							<div class="am-form-group">
								<label for="name" class="am-u-sm-3 am-form-label">
									商品名称</label>
								<div class="am-u-sm-9">
									<input type="text" id="name" required
										placeholder="商品名称" name="product.name">
										<small>10字以内...</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="name" class="am-u-sm-3 am-form-label">
									商品价格</label>
								<div class="am-u-sm-9">
									<input type="text" id="name" required
										placeholder="商品价格" name="product.price">
										<small>...</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="name" class="am-u-sm-3 am-form-label">
									商品条形码</label>
								<div class="am-u-sm-9">
									<input type="text" id="name" required
										placeholder="商品名称" name="product.barcode">
										<small>6位数字...</small>
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
					window.location.href='updateProductForm.action?id='+id;
				}
				var btn_delete = function(id) {
				$.jq_Confirm({
						message: "您确定要删除吗?",
						btnOkClick: function() {
							window.location.href='deleteProduct.action?id='+id;
							
						}
					});
				}
					
			</script>

		</div>
	</body>

</html>