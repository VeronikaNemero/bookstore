<%@ page import="java.util.*" %>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ page import="by.teachmeskills.store.controller.*" %>


<% if (request.getAttribute("forward")!=null && request.getAttribute("forward").equals("true")) { %>
     <jsp:forward page="forward-e.jsp" />
<% } %>





<html><head>
<meta http-equiv="Content-Type" charset="UTF-8" content="text/html"></head>
<form method="post"      action="http://localhost:8080/shop/register">
    <div class="container">        <h1>Register</h1>
        <p>Please fill in this form to create an account.</p>        <hr>

        <label><b>Login</b></label>        <input type="text" placeholder="Enter login" name="login">
        <label><b>Password</b></label>
        <input type="text" placeholder="Enter Password" name="password">
        <label><b>Name</b></label>        <input type="text" placeholder="Enter name" name="name">
        <label><b>Surname</b></label>
        <input type="text" placeholder="Enter surname" name="surname">        <hr>
        <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>        <button type="submit">Register</button>
    </div>
</form></html>