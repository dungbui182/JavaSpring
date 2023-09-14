<%-- 
    Document   : addhoidong
    Created on : Sep 10, 2023, 2:38:54 PM
    Author     : MR.DUNG
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h1 class="text-center text-info">Thanh lap hoi dong</h1

<c:url value="/addhoidong" var="action"/>
<form:form method="post" action="${action}" modelAttribute="hoidong" enctype="multipart/form-data">
    <form:errors path="*" element="div" cssClass="alert alert-danger" />
    <form:hidden path="id" />
    <div class="form-floating mb-3 mt-3">
        <form:input type="text" class="form-control" path="tenhoidong" id="tenhoidong" placeholder="Ten hoi dong" name="tenhoidong" />
        <label for="tenhoidong">Tên hoi dong</label>
    </div>
    <div class="form-floating mb-3 mt-3">
        <button type="submit" class="btn btn-info">Them </button>
    </div>
</form:form>


<table class="table table-hover">
    <thead>
        <tr>
            <th>Tên</th>  
            <th></th>
        </tr>
    </thead>
    <tbody>

        <c:forEach items="${usersAll}" var="u">
            <tr>            
                <td >${u.ten}</td>
                <td> <<a href="<c:url value="/suauser/${u.id}"/>"class="btn btn-success">Cập nhật</a></td>

            </tr>
        </c:forEach>

    </tbody>
</table>
