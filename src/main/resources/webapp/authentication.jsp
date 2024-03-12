<%@ page import="java.util.*" %>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ page import="by.teachmeskills.store.entity.*" %>
<html>
<form method="post"
      action="http://localhost:8080/january30/controller">
    <div class="container">
        <h1>Sign in</h1>
        <hr>

        <label><b>Login</b></label>
        <input type="text" placeholder="Enter login" name="login">

        <label><b>Password</b></label>
        <input type="text" placeholder="Enter Password" name="password">

        <hr>
        <p>By creating an account you agree to our <a href="http://localhost:8080/january30/error.jsp">Terms & Privacy</a>.</p>
        <button type="submit" class="registerbtn">Enter</button>
    </div>

    <div class="container signin">
            <p>Don't have an account? <a href="http://localhost:8080/january30/registration.jsp">Create</a>.</p>

    </div>
</form>
</html>