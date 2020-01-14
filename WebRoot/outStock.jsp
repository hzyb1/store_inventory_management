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
    window.location.href='checkAllOutStock.action';
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
							<li class="on" style="box-sizing: initial;-webkit-box-sizing: initial;">出库记录</li>
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