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
<form id="logoutForm" action="/mavenWebTest/logout" method="POST">  
  <input type="hidden" name="${_csrf.parameterName}"  
         value="${_csrf.token}" />  
</form>  
  welcome:${username}|<a href="javascript:formSubmit()"> Logout</a>  
   welcome:<sec:authentication property="name"/>|<a href="javascript:formSubmit()"> 这里的POSTLogout</a>  
</body>  
</html>  