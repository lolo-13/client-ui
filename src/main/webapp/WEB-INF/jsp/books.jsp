<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Books</title>

    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.0.0-2/css/bootstrap.min.css" />

</head>
<body>
	<header>
		<%@include file="header.jsp"%>
	</header>

<div class="container">

    <c:forEach items="${books}" var="book" varStatus="status">
        <p> Titre: <c:out value="${book.title}"/> </p>
    </c:forEach>

</div>

<script type="text/javascript" src="webjars/bootstrap/4.0.0-2/js/bootstrap.min.js"></script>

</body>
</html>