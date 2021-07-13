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
		    <form:form  method="get" action="/api/books/filtered" modelAttribute="filters">
			    <div class="row mb-3">
			        <div class="col">
				    <form:label for="title" path="title">Titre</form:label>
				    <form:input path="title" />
			    </div>
			    <div class="col">
				    <form:label for="authorName" path="authorName">Auteur (nom)</form:label>
				    <form:input path="authorName" />
			    </div>
			    <div class="col">
                    <form:label for="category" path="category">Catégorie</form:label>
                    <form:input path="category" />
                </div>
				<div class="col">
			        <input class="btn btn-secondary" type="SUBMIT" value="chercher" />
		        </div>
		        </div>
		    </form:form>
	    </div>
    </body>
</html>