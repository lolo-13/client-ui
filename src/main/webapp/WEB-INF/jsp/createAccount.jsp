<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>signup</title>
<link rel="stylesheet" href="css/style.css" type="text/css" />
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.0.0-2/css/bootstrap.min.css" />

</head>
<body>
	<header>
		<%@include file="header.jsp"%>
	</header>

<div class="formulaire">
		<label>Vous pouvez vous inscrire via ce formulaire
		</label>
		<form:form  method="post" action="/connexion/signup" modelAttribute="user">
			<div class="form-group">
				<label class="mr-2" for="email">username</label>
				 <form:input path="email" />
			</div>
			<div class="form-group ml-3">
				<label class="mr-2" for="password">mot de passe</label>
				 <form:input path="password" />
			</div>
						<div class="form-group ml-3">
            				<label class="mr-2" for="name">name</label>
            				 <form:input path="name" />
            			</div>
						<div class="form-group ml-3">
            				<label class="mr-2" for="firstname">name</label>
            				 <form:input path="firstname" />
            			</div>
					<div class="formulaire">
			<input type="SUBMIT" value="Submit" />
		</div>
		</form:form>
	</div>
</body>
</html>