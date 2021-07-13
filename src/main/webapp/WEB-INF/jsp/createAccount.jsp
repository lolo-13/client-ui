<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="/css/style.css" type="text/css" />

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