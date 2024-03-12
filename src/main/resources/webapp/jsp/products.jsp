<%@ page import="java.util.*" %>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ page import="by.teachmeslills.store.api.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <html>
  <form method="get"      action="http://localhost:8080/january30/controller">
<button type="submit">AllProducts</button>
  </form>

<table>
 <c:forEach var="product" items="${products}">
 <tr>
 <td>Name: ${product.name}</td>
 </tr>
 <tr>
 <td>Price: ${product.price} <br><br></td>
 </tr>
 <tr>
 <td>Amount: ${product.amount} <br><br></td>
 </tr>
 </c:forEach>
</table>

</html>