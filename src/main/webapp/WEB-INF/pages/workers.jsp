<%--
  Created by IntelliJ IDEA.
  User: masla
  Date: 14.04.2020
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>WORKER</title>
</head>
<body>

<h2>Workers</h2>
<table>
    <tr>
        <th>id</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Age</th>
        <th>Gender</th>
        <th>Department</th>
        <th>Works or not</th>
    </tr>
    <c:forEach var="worker" items="${workersList}">
        <tr>
            <td>${worker.id}</td>
            <td>${worker.name}</td>
            <td>${worker.surname}</td>
            <td>${worker.age}</td>
            <td>${worker.gender}</td>
            <td>${worker.dept}</td>
            <td>${worker.works}</td>
            <td>
                <a href="/edit/${worker.id}">edit</a>
                <a href="/delete/${worker.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2>Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new worker</a>
</body>
</html>