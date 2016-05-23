<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="c" uri="" %> --%>
<form method="post" action="#">
 用户名<input type="text" name='name' id="name" onbulr="check(name)"><span id="checkname"></span><br/>
密   码<input type="password " name='password' onbulr="check(password)" id="password">
<span id="checkpassword"></span><br/>
<button onclick="check()"> 提交</button> <input type="reset" value="重置">

<script type="text/javascript">
	function check(obj){//传参，判断是密码或者用户名
	
	
	
	
	
	switch(obj){
	case "name":
			doucument.getElementById('name').value;
		break;
	case "password":
		break;
	default:break;
	}
	}
</script>


