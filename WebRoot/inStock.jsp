<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
  
<html>
<script type="text/javascript">
 //错误提示信息
 var msg=""+'${message}'; 
 if(msg!=""){ 
    alert(msg); 
    window.location.href='checkAllInStock.action';
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
							<li class="" style="box-sizing: initial;-webkit-box-sizing: initial;">入库记录</li>
							<li class="" style="box-sizing: initial;-webkit-box-sizing: initial;">商品入库</li>
							<li class="" style="box-sizing: initial;-webkit-box-sizing: initial;">入库单</li>
							
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
												<th>商品名称</th>
												<th>入库数量</th>
												<th>供应商</th>
												<th>接收人</th>
												<th>入库时间</th>
												<th>删除</th>
											</tr>
										</thead>
										<tbody>
											<s:set name="InStockVos" value="#session['inStockVos']" />
											<s:iterator value ="inStockVos" var="mycontent" status="st" id="inStockVo">
											<tr>
												<td><s:property value="id" /></td>
												<td><s:property value="productName" /></td>
												<td><s:property value="amount" /></td>
												<td><s:property value="supplierName" /></td>
												<td><s:property value="approverName" /></td>
												<td><s:property value="completeTime" /></td>
												<td class="delete"><button onclick="btn_delete(${inStockVo.id})"><i class="icon-trash bigger-120"></i>删除</button></td>
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
							action="addToInList" method="post" theme="simple">	
							<div class="am-form-group">
								<label for="user-email" class="am-u-sm-3 am-form-label">
							商品名称</label>
								<div class="am-u-sm-9">
									<s:select name="inStockPo.productId" 
										list="listGood"
										listKey="id"
            							listValue="name"
            							emptyOption="false"
									/> <small>商品</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="name" class="am-u-sm-3 am-form-label">
									数量</label>
								<div class="am-u-sm-9">
									<s:textfield  id="name" required="required"
										placeholder="数量" name="inStockPo.amount"/>
										<small>数量</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-email" class="am-u-sm-3 am-form-label">
							供应商</label>
								<div class="am-u-sm-9">
									<s:select name="inStockPo.supplierId" 
										list="listSupplier"
										listKey="id"
            							listValue="name"
            							emptyOption="false"
									/> <small>供应商</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-email" class="am-u-sm-3 am-form-label">
							库区号</label>
								<div class="am-u-sm-9">
									<s:select name="inStockPo.areaNumber" 
										list="listNumber"
										listKey="id"
            							listValue="name"
            							emptyOption="false"
									/> <small>库区号</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-email" class="am-u-sm-3 am-form-label">
							货架号</label>
								<div class="am-u-sm-9">
									<s:select name="inStockPo.shelfNumber" 
										list="listNumber"
										listKey="id"
            							listValue="name"
            							emptyOption="false"
									/> <small>货架号</small>
								</div>
							</div>
							<div class="am-form-group">
								<label for="user-email" class="am-u-sm-3 am-form-label">
							货位号</label>
								<div class="am-u-sm-9">
									<s:select name="inStockPo.placeNumber" 
										list="listNumber"
										listKey="id"
            							listValue="name"
            							emptyOption="false"
									/> <small>货位号</small>
								</div>
							</div>
							<div class="am-form-group">
								<div class="am-u-sm-9 am-u-sm-push-3">
									<input type="submit" class="am-btn am-btn-success" value="加入入库单" />
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
				<ul style="display: block;padding: 20px;">
							<li>
								<!--分页显示角色信息 start-->
								<div id="dv1">
									<table class="table" id="tbRecord">
										<thead>
											<tr>
												<th>编号</th>
												<th>商品名称</th>
												<th>数量</th>
												<th>货区号</th>
												<th>货加号</th>
												<th>货位号</th>
												<th>供应商</th>				
												<th>删除</th>
											</tr>
										</thead>
										<tbody>
					
											<s:set name="inStockList" value="#session['inStockList']" />
											<s:iterator value ="inStockList" var="mycontent" status="st" id="inStockPo">
											<tr>
												<td><s:property value="id" /></td>
												<td><s:property value="productName" /></td>
												<td><s:property value="amount" /></td>
												<td><s:property value="areaNumber" /></td>
												<td><s:property value="shelfNumber" /></td>
												<td><s:property value="placeNumber" /></td>
												<td><s:property value="supplierName" /></td>
												<td class="delete"><button onclick="btn_delete5(${inStockPo.id})"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
											</s:iterator> 
										</tbody>
									</table>
									<div class="am-form-group">
								<div class="am-u-sm-9 am-u-sm-push-3">
									<a href="inStockOption" class="am-btn am-btn-success" target="right">入库</a>
								</div>
							</div>
								</div>
								<!--分页显示角色信息 end-->
							</li>
						</ul>
						
			
			 <script src="js/jquery-1.7.2.min.js" type="text/javascript"></script>
              <script src="js/plugs/Jqueryplugs.js" type="text/javascript"></script>
              <script src="js/_layout.js"></script>
             <script src="js/plugs/jquery.SuperSlide.source.js"></script>
			<script>
				var num = 1;
				$(function() {

				 $(".tabs").slide({ trigger: "click" });

				});
				var btn_delete = function(id) {
				$.jq_Confirm({
						message: "您确定要删除吗?",
						btnOkClick: function() {
							window.location.href='deleteInStockDetail.action?id='+id;
							
						}
					});
				}
					
			</script>

		</div>
	</body>

</html>	