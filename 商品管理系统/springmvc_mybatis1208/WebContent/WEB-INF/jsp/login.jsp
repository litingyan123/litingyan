<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
#d1{width:400px;
height:"300px";
margin:auto;
font-family: fantasy;
font-size: x-large;
text-align: center;}

#d2{
text-align: center;
font-family: inherit;
font-size: medium;



}
</style>
<script
 src="http://code.jquery.com/jquery-latest.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统登陆</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/login.action" method="post" id="form">
<div id="d1">
  用户名：<input type="text" id="username"  name="username" ><br>
   密码：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password"  name="password" id="password"> 
  <br/> <input type="button" id="d2"  value="登陆" />
  </div>
</form>
</body>
<script type="text/javascript">

$("#d2").click(function(){
	var username=$("#username").val();
	var password=$("#password").val();
	console.log(username);
	console.log(password);
	var error="";
	 if (username.length=="") {
			error+="用户名不能为空";
			error+="\n";
			
		}
	 if (password.length=="") {
	    	error+="密码不能为空";
	    	error+="\n";
	    	}
	 if (error!="") {
			alert(error);
			}
	 else{
			$.ajax({
				type:'POST',
				dataType:'json',
				url:'http://localhost:8080/springmvc_mybatis1208/login.action',
				contentType:'application/json;charset=UTF-8',
				
				data:JSON.stringify({"username":username,"password":password}),
				success:function(data){//返回json结果
					 console.log(data);
					if(data==1){
						window.location.href="items/queryItems.action"
					}
					else{
						alert("用户名密码错误")
					} 
					
				}
				
				
			});
			
			console.log({"username":username,"password":password});
			
		
	}
	
	
	
});

</script>
</html>