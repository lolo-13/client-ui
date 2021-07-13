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

	   <div class = "formulaire">
            <div class="container">
            </div>
       </div>
       	<div class="listBook">
       		<ul class="flex books" >
       			<c:forEach items="${books}" var="book" varStatus="status">
       				<li class="spot">${book.title} - ${book.authorDto.firstname} ${book.authorDto.name}
       					<a class="img-container" href="/api/books/book/<c:out value="${book.idBook}"/>">
       					<img src="/images/<c:out value="${book.title}"/>.png">
       				</a>
       				<div> exemplaires disponibles : ${book.numberOfCopies}</div>
       				</li>
       			</c:forEach>

       		</ul>
       	</div>
    </body>
</html>