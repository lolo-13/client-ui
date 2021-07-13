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

        <title>books</title>
    </head>

    <body>
	    <header>
		    <%@include file="header.jsp"%>
	    </header>

	   <div class="container-xl">
       	    <div class="row">
       		    <div class="col-5">
       				<a class="img-container">
       				<img src="/images/<c:out value="${book.title}"/>.png">
       				</a>
       			</div>
       			<div class="col-7"
       			    <div class="text-dark">
       			        <p class="font-weight-bold"> Auteur:</p>
       			        <p>${book.authorDto.name} </p>
       			        <p class="font-weight-bold">Résumé:</p>
       			        <p>${book.summary}</p>
                    </div>
       		    </div>
       	    </div>
       </div>
    </body>
</html>