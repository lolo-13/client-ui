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
        <title>connexion</title>
    </head>
    <body>
	    <header>
		    <%@include file="header.jsp"%>
	    </header>

        <div class="formulaire">
		    <form:form  method="post" action="/connexion/login" modelAttribute="userlogin">
			    <div class="form-group">
				    <form:label for="username" path="username">login</form:label>
				    <form:input path="username" />
			    </div>
			    <div class="form-group">
				    <form:label for="password" path="password">login</form:label>
				    <form:password path="password" />
			    </div>
				<div class="formulaire">
			        <input class="btn btn-secondary" type="SUBMIT" value="Submit" />
		        </div>
		    </form:form>
	    </div>
    </body>
</html>