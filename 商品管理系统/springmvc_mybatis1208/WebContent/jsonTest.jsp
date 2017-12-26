<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript"  src="js/jquery-1.4.2.js" ></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type="button" id="jsonTest1" value="请求json，输出json"/>
<input type="button" id="jsonTest1" value="请求key/value，输出json"/>
</body>
<script type="text/javascript">
$("#jsonTest1").click(function(){
	$.ajax({
		type:'post',
		url:'http://localhost:8080/springmvc_mybatis1208/requestJson.action',
		contentType:'json',
		//数据格式是json串，商品信息
		data:'{"name":"手机","price":999}',
		success:function(data){//返回json结果
			alert(JSON.stringify(data));
		}
		
	});
	
});
$("#jsonTest2").click(function(){
	$.ajax({
		type:'post',
		url:'http://localhost:8080/springmvc_mybatis1208/requestJson.action',
		//请求是key/value这里不需要指定contentType，因为默认就 是key/value类型
		//contentType:'application/json;charset=utf-8',
		//数据格式是json串，商品信息
		data:'name=手机&price=999',
		success:function(data){//返回json结果
			alert(JSON.stringify(data));
		}
		
	});
	
});

	

</script>

</html>