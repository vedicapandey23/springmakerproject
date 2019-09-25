<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<title>Insert title here</title>
</head>
<body style="background-color:lightblue">
<div align="center"><h2>Register User</h2>
<s:form action="cregisteruser1" modelAttribute="users">
<table>
<tr><td>Enter username:<s:input path="username"/><br></td></tr>
<tr><td>Enter password:<s:input path="password"/></td></tr>
<%-- <tr><td>Role:<s:input path="authorities.role"/></td></tr --%>

<tr><td>Role:<s:select path = "authorities.role">
                     <s:option value = "ROLE_MAKER" label = "Maker"/>
                      <s:option value = "ROLE_CHECKER" label = "Checker"/>
                  </s:select>     	
</td></tr>
<tr><td><input type="submit" value="register"/></td></tr>
</table>


</s:form>
</div>
</body>
</html>