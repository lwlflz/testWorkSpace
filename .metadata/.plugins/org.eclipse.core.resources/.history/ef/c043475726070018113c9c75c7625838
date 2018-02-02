<%@ page contentType="text/html;charset=UTF-8" language="java" %>  
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
</body>  
</html>  