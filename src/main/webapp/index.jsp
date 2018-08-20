<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type"content="text/html; charset=utf-8">
    <title>Show</title>
</head>
<body>

<h1>Information of this person:</h1>
Name:${person.name}<br/>
Age:${person.age}<br/>
Favorites:
<c:forEach var="fav" items="${person.favorites}">
    ${fav};
</c:forEach>
<br/>
Friends:
<c:forEach var="fri" items="${person.friends}">
    ${fri.key},${fri.value};
</c:forEach>
</body>
</html>