
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>accueil</title>
<link rel="stylesheet" href="css/style.css" type="text/css" />
   <link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.0.0-2/css/bootstrap.min.css" />

</head>
<body>
	<header>
		<%@include file="header.jsp"%>
	</header>
	<p class="text-center">
	Bienvenue sur le site des bibliothèques de la ville de Polis.
	</p>
</body>
</html>