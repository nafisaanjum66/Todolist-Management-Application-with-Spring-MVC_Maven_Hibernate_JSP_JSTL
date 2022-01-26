<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 12/21/2021
  Time: 10:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <%@include file="base.jsp"%>
    <style>
        .error{
            margin-left: 4%;
            color: red;
            text-align:center
        }

    </style>
</head>
<body>

<div class="container mt-3">
    <div class="row">
        <div class="col-md-6 offset-md-3">
            <h1 class="text-center mb-3">Login</h1>

            <form:form action="${pageContext.request.contextPath}/login/verify" method="post" modelAttribute="login">
                <div class="form-group">
                    <label for="username">User Name</label>
                    <form:errors path="username" cssClass="error"/>
                    <form:input type="text" class="form-control" path="username" id="username" name="username" placeholder="Enter Username here"/>
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <form:errors path="password" cssClass="error"/>
                    <form:password class="form-control" path="password" rows="5" placeholder="Enter your Password"/>
                </div>

                <div class="container text-center">
                    <a href="${pageContext.request.contextPath}" class="btn btn-outline-danger">Forget Password</a>

                    <button type="submit" class="btn btn-primary">Login</button>

                </div>
            </form:form>
        </div>
    </div>
</div>




</body>
</html>
