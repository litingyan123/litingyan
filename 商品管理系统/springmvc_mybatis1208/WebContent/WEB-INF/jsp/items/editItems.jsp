<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
#d1{
color: red;
font-size:large;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品信息</title>

</head>
<body> 
<c:if test="${allErrors!=null}">
<c:forEach items="${allErrors}" var="error" >
     <div id="d1"> ${error.defaultMessage} </div>
</c:forEach>
</c:if>

<form id="itemForm" action="${pageContext.request.contextPath }/items/editItemsSubmit.action" method="post" 
enctype="multipart/form-data">
<input type="hidden" name="id" value="${itemsCustom.id }"/>
修改商品信息：
<table width="100%" border=1>
<tr>
	<td>商品名称</td>
	<td><input type="text" name="name" value="${itemsCustom.name }"/></td>
</tr>
<tr>
	<td>商品价格</td>
	<td><input type="text" name="price" value="${itemsCustom.price }"/></td>
</tr>
<tr>
	<td>商品生产日期</td>
	<td><input type="text" name="createtime" value="<fmt:formatDate value="${itemsCustom.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></td>
<%-- 	<td><input type="text" name="createtime" value="${itemsCustom.createtime}"/></td> --%>
</tr>
<tr>
	<td>商品图片</td>
	<td>
		<c:if test="${itemsCustom.pic !=null}">
			<img src="/pic/TomcatPicture/${itemsCustom.pic}" width=300 height=400/>
			<br/>
		</c:if>
		<input type="file"  name="items_pic"/> 
	</td>
</tr> 
<tr>
	<td>商品简介</td>
	<td>
	<textarea rows="3" cols="30" name="detail">${itemsCustom.detail }</textarea>
	</td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="提交"/>
</td>
</tr>
</table>

</form>
</body>

</html>