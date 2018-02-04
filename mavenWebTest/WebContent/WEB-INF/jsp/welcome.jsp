<%@ page contentType="text/html;charset=UTF-8" language="java" %>  
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>  
<head>  
    <title></title>  
</head>  
<body>  
<script>  
  function formSubmit() {  
    document.getElementById("logoutForm").submit();  
  }  
</script>  
<form id="logoutForm" action="/logout" method="post">  
  <input type="hidden" name="${_csrf.parameterName}"  
         value="${_csrf.token}" />  
</form>  
  welcome:${username}|<a href="javascript:formSubmit()"> Logout</a> 
  
  welcome:<sec:authentication property="name"/>|<a href="javascript:formSubmit()"> Logout</a>  
	<sec:authorize url="/admin/info" ><!-- access="hasRole('ROLE_ADMIN')" -->
		<a href="www.baidu.com">这是一条私密连接</a>
	</sec:authorize>
	<a href="j_spring_security_logout">退出系统</a>	
 
</body>  
</html>  