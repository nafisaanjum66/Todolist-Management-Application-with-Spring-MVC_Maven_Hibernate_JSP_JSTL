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
            <h1 class="text-center mb-3">Add Your New Todo</h1>

            <form:form action="save" method="post" modelAttribute="todo">
                <div class="form-group">
                    <label for="name">Todo Name</label>
                    <form:errors path="name" cssClass="error"/>
                    <form:input type="text" class="form-control" path="name" id="name" aria-describedby="emailHelp" name="name" placeholder="Enter Todo name here"/>
                </div>
                <div class="form-group">
                    <label for="description">Todo Description</label>
                    <form:errors path="description" cssClass="error"/>
                    <form:textarea class="form-control" path="description" name="description" id="description" rows="5" placeholder="Enter your todo description"/>
                </div>
                <div class="form-group">
                    <label for="tergetDate">Date</label>
                    <form:errors path="tergetDate" cssClass="error"/>
                    <form:input type="date" path="tergetDate" placeholder="Enter your terget date" name="tergetDate" class="form-control" id="tergetDate"/>
                </div>
                <div class="container text-center">
                    <a href="${pageContext.request.contextPath}/todo/list" class="btn btn-outline-danger">Back</a>

                    <button type="submit" class="btn btn-primary">Add</button>

                </div>
            </form:form>
        </div>
    </div>
</div>


</body>
</html>
