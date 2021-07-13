<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="java.time.format.DateTimeFormatter" %>

<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="/css/style.css" type="text/css" />

        <title>mes emprunts</title>
    </head>

    <body>
	    <header>
		    <%@include file="header.jsp"%>
	    </header>
	   <div class = "contour">
            <div class="card-deck">
                <c:forEach var="borrowing" items="${borrowings}" varStatus="status">
                    <c:if test="${borrowing.returned != true}">
                        <form:form  method="post" action="/api/borrowings/borrowing-prolongation" modelAttribute="infosborrowing" cssStyle="padding:10px">
                            <div class="card bg-light">
                                <div class="card-header text-center text-info font-weight-bold">
                                    <c:out value="${borrowing.title}" /> - <c:out value="${borrowing.author}" />
                                </div>
                                <div class="card-body text-center">
                                    <p class="card-text">
                                            <c:if test="${borrowing.returned == true}"> livre rendu</c:if>
                                            <c:if test="${borrowing.returned != true}"> livre à rendre avant le ${borrowing.borrowingLimitDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))}</c:if>
                                    </p>
                                            <p class="card-text">
                                                <c:if test="${borrowing.renewal == true}"> le prêt a déjà été prolongé </c:if>
                                                    <c:if test="${borrowing.renewal != true}">
                                                    <form:hidden path="idBorrowing" value = "${borrowing.idBorrowing}"/>
                                                    <input class="btn btn-secondary" type="SUBMIT" value="Prolonger le prêt" />
                                                    </c:if>
                                            </p>
                                    </p>
                                </div>
                            </div>
                        </form:form>
                    </c:if>
                </c:forEach>
            </div>
       </div>
    </body>
</html>