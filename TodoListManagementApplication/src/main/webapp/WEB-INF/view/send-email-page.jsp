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
<%--<%@ page language="java" session="false"%>--%>
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
<center>

<%--<c:set var = "pageEmail" scope = "session" value = "<%=session.getAttribute("pageEmail")%>"/>--%>

<div class="container mt-3">
    <div class="row">
        <div class="col-md-6 offset-md-3">
            <h1 class="text-center mb-3">Welcome to our Todo List Application</h1>
            <h2>

                    <label style="color: blueviolet">${sessionScope.username}</label>


            </h2>


            <form:form action="${pageContext.request.contextPath}/email/process-email" method="post" modelAttribute="email">
                <div class="form-group">

                     <div style="color: red">Press Enter Now to access the todo list</div>
                    <form:errors path="userEmail" cssClass="error"/>
                    <form:input type="hidden" class="form-control" path="userEmail" value="${sessionScope.pageEmail}" id="userEmail" name="userEmail" placeholder="Enter Username here" />
                </div>

                <div class="container text-center">
                    <a href="${pageContext.request.contextPath}" class="btn btn-outline-danger">Back</a>

                    <button type="submit" class="btn btn-primary">Enter now</button>

                </div>
            </form:form>
        </div>
    </div>
</div>

</center>

</body>
</html>

