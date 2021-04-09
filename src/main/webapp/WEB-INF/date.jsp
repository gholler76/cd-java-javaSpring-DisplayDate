<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
 <script type="text/javascript" src="js/date.js"></script>
<style><%@include file="/WEB-INF/css/style.css"%></style>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

<h2 class="blue"><c:out value="${date}"/></h2>


	    
</body>
</html>