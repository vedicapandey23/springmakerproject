<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap Elegant Modal Login Modal Form with Avatar Icon</title>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="msg" %>
<link href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<msg:url value="/assests/login.css" var="mainCss"></msg:url>
<link href="${mainCss}" rel="stylesheet">
</head>
<style>
body {
background-image:url(bg1.jpg);
background-size:cover;
}
</style>
<body >


<!-- Modal HTML -->
<div id="myModal">
	<div class="modal-dialog modal-login">
		<div class="modal-content">
			<div class="modal-header">
				<div class="avatar">
				
				<%-- <img src="<c:url value="/images/bg1.jpg"/>"/> --%>
				<!-- <img src="/resources/images/bg1.jpg" /> -->
				<%-- <img src="${pageContext.request.contextPath}/resources/images/bg1.jpg" /> --%>
					<img src=<c:url value="/resources/images/avatar2.jpg"/> alt="Avatar"/>
				</div>				
				<h4 class="modal-title">Member Login</h4>	
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
			</div>
			<div class="modal-body">
				<form action="j_spring_security_check" method="post">
					<div class="form-group">
						<input type="text" class="form-control" name="j_username" placeholder="Username" required="required">		
					</div>
					<div class="form-group">
						<input type="password" class="form-control" name="j_password" placeholder="Password" required="required">	
					</div>        
					<div class="form-group">
						<button type="submit" class="btn btn-primary btn-lg btn-block login-btn">Login</button>
					</div>
				</form>
			</div>
			<div>

 ${statusfail}
 ${statusdenied}
${statusrecord}

</div>
			<div class="modal-footer">
				<a href="cregisteruser">Create Account</a>
			</div>
		</div>
	</div>
</div>     
</body>
</html>                            