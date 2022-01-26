<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 12/20/2021
  Time: 7:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="base.jsp" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
</head>
<body>

<div class="container mt-3">
    <div class="row">
        <div class="col-md-12">
            <h1 class="text-center mb-3">YoU cAn DoO iT</h1>
            <h2 class="text-center mb-3">Todo List</h2>


            <%--            Search todo--%>
            <form action="<s:url value="/search-todo"/> ">
                <div class="input-group mb-3">
                    <div class="input-group-prepend">
                        <span class="input-group-text" id="inputGroup-sizing-default">Search</span>
                    </div>
                    <input type="text" name="freeText" placeholder="Enter search" class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default">
                </div>
            </form>



            <table class="table">
                <thead class="thead-dark">
                <tr>
                    <th scope="col">Serial No</th>
                    <th scope="col">Name</th>
                    <th scope="col">Description</th>
                    <th scope="col">Terget Date</th>
                    <th scope="col">Action</th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${todos}" var="t">
                    <tr>
                        <th scope="row">${t.id}</th>
                        <td>${t.name}</td>
                        <td>${t.description}</td>
                        <td class="font-weight-bold">${t.tergetDate}</td>
                        <td>
                            <a href="delete?id=${t.id}"><i class="fas fa-trash-alt text-danger" style="font-size: 30px"></i></a>
                            &nbsp&nbsp
                            <a href="update?id=${t.id}"><i class="fas fa-edit" style="font-size: 30px"></i></a>
                        </td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>

            <div class="container text-center">
                <a href="${pageContext.request.contextPath}/todo/create" class="btn btn-outline-success">Add New Todo</a>
            </div>
        </div>
    </div>
</div>


</body>
</html>
