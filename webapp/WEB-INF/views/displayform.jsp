<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="errorFile.css"/>


<link href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="login.css">


<%@page isELIgnored="false" %>
<title>Insert title here</title>
</head>

<body style="background-color:lightblue" >
<%@ include file="sample.jsp" %>
 
<div align="right">
<a href="j_spring_security_logout">logout</a>
</div>
<table border="2" width="70%" cellpadding="2">
<tr><th>Customer Code</th><th>Customer Name</th><th>Address</th><th>Address2</th><th>Pincode</th><th>Email</th><th>Contact Number</th><th>Primary Contact Number</th><th>Record status</th><th>Active/Inactive</th></tr>
<tr><td>${customer.customerCode}</td>
<td>${customer.customerName}</td>
<td>${customer.customerAddress1}</td>
<td>${customer.customerAddress2}</td>
<td>${customer.customerPinCode}</td>
<td>${customer.emailAddress}</td>
<td>${customer.contactNumber}</td>
<td>${customer.primaryContactPerson}</td>
<td>${customer.recordStatus}</td>
<td>${customer.activeInactiveFlag}</td>
<%-- <td>${customer.createDate}</td>
<td>${customer.createdBy}</td>
<td>${customer.modifiedDate}</td>
<td>${customer.modifiedBy}</td>
<td>${customer.authorizedDate}</td>
<td>${customer.authorizedBy}</td> --%>
</tr>



</table> 

<br>
${statusupdate}
<br>

<a href="index.jsp">home</a>
</body>

</html>