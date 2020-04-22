<%--
  Created by IntelliJ IDEA.
  User: masla
  Date: 14.04.2020
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test="${empty worker.name}">
    <title>Add</title>
    </c:if>
    <c:if test="${empty worker.name}">
    <title>Edit</title>
    </c:if>
</head>
<body>
<c:if test="${empty worker.name}">
    <c:url value="/add" var="var"/>
</c:if>
<c:if test="${!empty worker.name}">
    <c:url value="/edit" var="var"/>
</c:if>
<form action="${var}" method="POST">
        <c:if test="${!empty worker.name}">
    <input type="hidden" name="id" value="${worker.id}">
        </c:if>
    <label for="name">Name</label>
    <input type="text" name="name" id="name">
    <label for="surname">Surname</label>
    <input type="text" name="surname" id="surname">
    <label for="gender">Gender</label>
    <input type="text" name="gender" id="gender">
    <label for="age">Age</label>
    <input type="text" name="age" id="age">
    <label for="dept">Departament</label>
    <input type="text" name="dept" id="dept">
    <label for="works">Works</label>
    <input type="text" name="works" id="works">
    <c:if test="${empty worker.name}">
        <input type="submit" value="Add new worker">
    </c:if>
    <c:if test="${!empty worker.name}">
    <input type="submit" value="Edit worker">
    </c:if>
</form>
</body>
</html>