<%--
  Created by IntelliJ IDEA.
  User: SonTung
  Date: 25/03/2021
  Time: 2:44 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/sandwich">
        <input type="checkbox" name="condiment" id="lettuce" value="lettuce">
        <label for="lettuce">Lettuce</label>
        <input type="checkbox" name="condiment" id="tomato" value="tomato">
        <label for="tomato">Tomato</label>
        <input type="checkbox" name="condiment" id="mustard" value="mustard">
        <label for="mustard">Mustard</label>
        <input type="checkbox" name="condiment" id="sprouts" value="sprouts">
        <label for="sprouts">Sprouts</label>
        <br>
        <button type="submit">Save</button>
    </form>
<p>You chose:
    <c:forEach items="${condiments}" var="condiment">
        <span>${condiment}, </span>
    </c:forEach>
</p>
</body>
</html>
