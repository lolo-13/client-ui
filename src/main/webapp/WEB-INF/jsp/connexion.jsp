<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Books</title>
<link rel="stylesheet" href="css/style.css" type="text/css" />
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.0.0-2/css/bootstrap.min.css" />

</head>
<body>
	<header>
		<%@include file="header.jsp"%>
	</header>

<div class="formulaire">
		<label>Vous pouvez vous connecter via ce formulaire (ou pour
			créer un compte cliquer <a href="Inscription">ici</a>)
		</label>
		<form:form  method="post" action="/connexion/login" modelAttribute="userlogin">
			<div class="form-group">
				<label class="mr-2" for="prenom">username</label>
				 <form:input path="username" />
			</div>
			<div class="form-group ml-3">
				<label class="mr-2" for="mail">mot de passe</label>
				 <form:input path="password" />
			</div>
					<div class="formulaire">
			<input type="SUBMIT" value="Submit" />
		</div>
		</form:form>
	</div>
</body>
</html>