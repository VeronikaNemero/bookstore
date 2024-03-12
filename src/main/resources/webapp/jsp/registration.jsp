<%@ page import="java.util.*" %>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ page import="by.teachmeskills.store.entity.*" %>
<html>
<form method="post"
      action="http://localhost:8080/january30/controller">
    <div class="container">
        <h1>Registration</h1>
        <p>Please fill in this form to create an account.</p>
        <hr>

        <label><b>Login</b></label>
        <input type="text" placeholder="Enter login" name="login">

        <label><b>Password</b></label>
        <input type="text" placeholder="Enter Password" name="password">

        <label><b>Name</b></label>
        <input type="text" placeholder="Enter name" name="name">

        <label><b>Surname</b></label>
        <input type="text" placeholder="Enter surname" name="surname">
        <hr>
        <p>By creating an account you agree to our <a href="http://localhost:8080/january30/error.jsp">Terms & Privacy</a>.</p>
        <button type="submit" class="registerbtn">Registration</button>
    </div>

    <div class="container signin">
        <p>Already have an account? <a href="http://localhost:8080/january30/authentication.jsp">Sign in</a>.</p>
    </div>
</form>
<form name="Form"
      method="get"
      action="http://localhost:8080/january30/jsp/users.jsp">
    </tаble>
    <input type=submit value="Show all users">
</form>
<form name="Form"
      method="get"
      action="http://localhost:8080/january30/jsp/products.jsp">
    </tаble>
    <input type=submit value="Show all products">
</form>

<br>
</html>>