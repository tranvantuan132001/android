
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="addphone.jsp">Create</a>
<br/>
<div class="w3-container">
    <table class="w3-table w3-striped" style="width: 50%">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Description</th>
            <th>Brand</th>
        </tr>
        <c:forEach var="p" items="${requestScope.products}">
            <tr style="margin: 0">
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.price}</td>
                <td>${p.description}</td>
                <td>${p.brand}</td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>