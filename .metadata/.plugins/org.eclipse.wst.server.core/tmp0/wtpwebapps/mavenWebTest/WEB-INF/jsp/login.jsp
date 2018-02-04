<%@ page contentType="text/html;charset=UTF-8" language="java" %>  
<html>  
<head>  
    <title></title>  
</head>  
<body>  
<form action="/mavenWebTest/login" method="POST">  
  <table>  
    <tr>  
      <td>User:</td>  
      <td><input type='text' name='username'></td>  
    </tr>  
    <tr>  
      <td>Password:</td>  
      <td><input type='password' name='password' /></td>  
    </tr>  
    <tr>  
      <td colspan='2'><input name="submit" type="submit"  
                             value="submit" /></td>  
    </tr>  
  </table>  
  
  <input type="hidden" name="${_csrf.parameterName}"  
         value="${_csrf.token}" />  
  ${sessionScope.SPRING_SECURITY_LAST_EXCEPTION.message }
</form>  
</form>  
</body>  
</html>  