<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
    <%@ include file="sample.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:lightblue" >
<div align="center">
<form action="cretrieveby2" method="post" >
enter the code:<input type="text" name="customerCode"/>
<input type="submit" value="retrieve by"/>
</form>
</div>
<div align="center">${statusretrieve}</div>
<div align="center"><a href="index.jsp">Home</a></div>
</body>
</html>