<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%--Для подключения jstl обязательно добавить эту директиву. с. 417--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="pvt.tomcat.start.api.user.*" %>
<html>
<body>

Hello put
<div>
<%--Выводит значение на html страничке--%>
<c:out value="${firstUser.name}"/>
</div>

<br>
<%--c:forEach Для вывода каких-то циклов с. 448--%>
<table>
 <c:forEach var="user" items="${userList}">
 <tr>
 <td>Name: ${user.name}</td>
 </tr>
 <tr>
 <td>Surname: ${user.surname} <br><br></td>
 </tr>
 </c:forEach>
</table>

<br>
<%--c:if Условные теги. В аттрибут test записывается проверяемое значение таким образом как показано ниже (через eq). Else у него нет.--%>
<div>
<c:if test="${firstUser.name eq 'Коля'}">
 <jsp:include page="include-e.jsp" />
</c:if>
</div>

<%--c:choose c:when c:otherwise Условные теги. Это и есть аналог if else.--%>
<div>
<c:choose>
<c:when test="${firstUser.name eq 'Коля'}">
Hello Nikolai
</c:when>
<c:when test="${firstUser.name eq 'Петя'}">
Оля
</c:when>
<c:otherwise>
 <jsp:include page="include-e.jsp" />
</c:otherwise>
</c:choose>
</div>
</body>
</html>