<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 12/20/2021
  Time: 7:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="base.jsp"%>
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>
<div class="container mt-3">
    <div class="row">
        <div class="col-md-6 offset-md-3">
            <h1 class="text-center mb-3">Registration</h1>

            <form:form action="save" method="post" modelAttribute="registration">
                <div class="form-group">
                    <label for="name">User Name</label>
                    <form:errors path="username" cssClass="error"/>
                    <form:input type="text" class="form-control" path="username" id="name" aria-describedby="emailHelp" name="name" placeholder="Enter User name here"/>
                </div>
                <div class="form-group">
                    <label for="password">Passoword</label>
                    <form:errors path="password" cssClass="error"/>
                    <form:password class="form-control" path="password" name="description" id="description" rows="5" placeholder="Enter your Password"/>
                </div>
                <div class="form-group">
                    <label for="fullname">Full Name</label>
                    <form:errors path="fullname" cssClass="error"/>
                    <form:input class="form-control" path="fullname" name="description" id="description" rows="5" placeholder="Enter your Full Name"/>
                </div>
                <div class="form-group">
                    <label for="mobile">Mobile</label>
                    <form:errors path="mobile" cssClass="error"/>
                    <form:input class="form-control" path="mobile" name="description" id="description" rows="5" placeholder="Enter your Mobile no"/>
                </div>
                <div class="form-group">
                    <label for="dob">Date of Birth</label>
                    <form:errors path="dob" cssClass="error"/>
                    <form:input type="date" path="dob" placeholder="Enter your terget date" name="tergetDate" class="form-control" id="tergetDate"/>
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <form:errors path="email" cssClass="error"/>
                    <form:input class="form-control" path="email" name="description" id="description" rows="5" placeholder="Enter your Email"/>
                </div>
                <div class="container text-center">
                    <a href="${pageContext.request.contextPath}/login/login" class="btn btn-outline-danger">Login</a>

                    <button type="submit" class="btn btn-primary">Register</button>

                </div>
            </form:form>
        </div>
    </div>
</div>



</body>
</html>
