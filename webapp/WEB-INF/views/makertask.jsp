<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<%-- <%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %> --%>
<%@page isELIgnored="false"%>
<%@ include file="sample.jsp" %>
<body style="background-color:lightblue">
<h2 align="center">XYZ Bank</h2>
<h3 align="center">Maker</h3>


<%-- <security:authorize ifAnyGranted="ROLE_MAKER"> --%>
<div align="center">
<a href="ccreateform">create</a><br>
<a href="cretieveAll">retrieve</a><br>
<a href="cretieveBy1">retrieve by</a><br>
<a href="cupdateBy1">update</a><br>
<a href="cdeleteForm">delete</a>
</div>
<%-- </security:authorize>
<security:authorize ifAnyGranted="ROLE_CHECKER">
CHECKER
</security:authorize> --%>

</body>
</html>
