<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@page import="po.InStockPo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
  
<html>
<script type="text/javascript">
 //错误提示信息
 var msg=""+'${message}'; 
 if(msg!=""){ 
    alert(msg); 
    window.location.href='checkAllStock.action';
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
												<th>库区号 </th>
												<th>货架号</th>
												<th>货位号</th>
												<th>入库时间</th>
												<th>出库</th>
												<th>删除</th>
											</tr>
										</thead>
										<tbody>
					
											<s:set name="stockVos" value="#session['stockVos']" />
											<s:iterator value ="stockVos" var="mycontent" status="st" id="stockVo">
											<tr>
												<td><s:property value="id" /></td>
												<td><s:property value="productName" /></td>
												<td><s:property value="amount" /></td>
												<td><s:property value="areaNumber" /></td>
												<td><s:property value="shelfNumber" /></td>
												<td><s:property value="placeNumber" /></td>
												<td><s:property value="inStockTime" /></td>
												<td class="edit"><button onclick="btn_out(${stockVo.id})"><i class="icon-edit bigger-120"></i>出库</button></td>
												<td class="delete"><button onclick="btn_delete(${stockVo.id})"><i class="icon-trash bigger-120"></i>删除</button></td>
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
												<th>数量</th>
												<th>货区号</th>
												<th>货加号</th>
												<th>货位号</th>
												<th>操作人</th>
												<th>删除</th>
											</tr>
										</thead>
										<tbody>
					
											<s:set name="outStockList" value="#session['outStockList']" />
											<s:iterator value ="outStockList" var="mycontent" status="st" id="outStockPo">
											<tr>
												<td><s:property value="id" /></td>
												<td><s:property value="productName" /></td>
												<td><s:property value="amount" /></td>
												<td><s:property value="areaNumber" /></td>
												<td><s:property value="shelfNumber" /></td>
												<td><s:property value="placeNumber" /></td>
												<td><s:property value="approverName" /></td>
												<td class="delete"><button onclick="btn_delete5(${outStockPo.id})"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
											</s:iterator> 
										</tbody>
									</table>
									<div class="am-form-group">
								<div class="am-u-sm-9 am-u-sm-push-3">
									<a href="outStockOption" class="am-btn am-btn-success" target="right">出库</a>
								</div>
							</div>
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
												<th>出库数量</th>
												<th>操作人</th>
												<th>出库时间</th>
												<th>删除</th>
											</tr>
										</thead>
										<tbody>
											<s:set name="outStockVos" value="#session['outStockVos']" />
											<s:iterator value ="outStockVos" var="mycontent" status="st" id="outStockVo">
											<tr>
												<td><s:property value="id" /></td>
												<td><s:property value="productName" /></td>
												<td><s:property value="amount" /></td>
												<td><s:property value="approverName" /></td>
												<td><s:property value="completeTime" /></td>
												<td class="delete"><button onclick="btn_delete(${outStockVo.id})"><i class="icon-trash bigger-120"></i>删除</button></td>
											</tr>
											</s:iterator> 
											
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
				var btn_out = function(id) {
					window.location.href='addToOutList.action?id='+id;
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