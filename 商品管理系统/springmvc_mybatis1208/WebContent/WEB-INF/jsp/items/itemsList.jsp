<%@page import="cn.itcast.ssm.po.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="cn.itcast.ssm.po.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
#table{
  display: inline-block;

  margin-top:50px;
  margin-left:125px;
  width:80%;
  height:500px;

}
#showDate{
margin-left: 80%;
height:25px;

}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
function deleteItems(){
	//提交form
	document.itemsForm.action="${pageContext.request.contextPath }/items/deleteItems.action";
	document.itemsForm.submit();
}
function queryItems(){
	//提交form
	document.itemsForm.action="${pageContext.request.contextPath }/items/queryItems.action";
	document.itemsForm.submit();
}
function updateItems(){
	//提交form
	document.itemsForm.action="${pageContext.request.contextPath }/items/editItemsQuery.action";
	document.itemsForm.submit();
}

</script>
<title>查询商品列表</title>
</head>
<body> 


<div id="table">

  <div id="showDate"></div>
<table width="100%" border=1>
 <span> <marquee direction="left" behavior="alternate">欢迎您：${users.username} </marquee>  </span>  
<tr>
          
<td>商品名称：<input type="text" name="itemsCustom.name"> 
<input type="button" value="查询" onclick="queryItems()"/>
<input type="button" value="批量删除" onclick="deleteItems()"/>
<input type="button" value="批量修改" onclick="updateItems()"/>
</td>

</tr>
</table>
商品列表：

<table width="100%" border=1>
<tr> <td>选择</td>
	<td>商品名称</td>
	<td>商品价格</td>
	<td>生产日期</td>
	<td>商品描述</td>
	<td>操作</td>
</tr>
<c:forEach items="${itemsList }" var="item">
<tr> <td><input type="checkbox" name="items_id" value="${item.id }"></td>
	<td>${item.name }</td>
	<td>${item.price }</td>
	<td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	<td>${item.detail }</td>
	
	<td><a href="${pageContext.request.contextPath }/items/editItems.action?id=${item.id}">修改</a></td>

</tr>
</c:forEach>

</table>
</div>

</body>
<script type="text/javascript">

var ss ;
  function getDate() {
	var time = new Date();
	var year = time.getFullYear();
	var month = time.getMonth();
	var day = time.getDate();
	var hour = time.getHours();
	var minute = time.getMinutes();
	var seconed = time.getSeconds();
	//9:07:09;
    if (seconed<10&&minute<10) {
    	var sd =year+"年"+(month+1)+"月"+day+"日"+hour+":0"+minute+":0"+seconed;
	//9:07:29;
    }else if (seconed>=10&&minute<10) {
		var sd =year+"年"+(month+1)+"月"+day+"日"+hour+":0"+minute+":"+seconed;
	//9:17:09
    }else if (seconed<10&&minute>=10) {
		var sd =year+"年"+(month+1)+"月"+day+"日"+hour+":"+minute+":0"+seconed;
	//9:17:19
    }else{
		var sd =year+"年"+(month+1)+"月"+day+"日"+hour+":"+minute+":"+seconed;
	}
    var showDate = document.getElementById("showDate");
    showDate.innerHTML=sd;
  }
//定时器
   ss=setInterval("getDate()", "500");
</script>
   
</html>