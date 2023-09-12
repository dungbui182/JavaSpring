<%-- 
    Document   : addtieuchi
    Created on : Sep 10, 2023, 4:00:23 PM
    Author     : MR.DUNG
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h1 class="text-center text-info">Quan ly tieu chi</h1>
<c:url value="/addtieuchi" var="action"/>
<form:form method="post" action="${action}" modelAttribute="tieuchi" enctype="multipart/form-data">
        <form:errors path="*" element="div" cssClass="alert alert-danger" />
     <form:hidden path="id" />
    <div class="form-floating mb-3 mt-3">
        <form:input type="text" class="form-control" path="tentieuchi" id="tentieuchi" placeholder="Ten tieu chi" name="tentieuchi" />
        <label for="ten">Tên tieu chi</label>
    </div>
 
     <div class="form-floating mb-3 mt-3">
        <button type="submit" class="btn btn-info">Thêm</button>
    </div>
</form:form>

<h1 class="text-center text-info">CAC TIEU CHI HIEN TAI</h1>

<table class="table table-hover">
    <thead>
        <tr>
            <th>Tên</th>
            <th>Giao vu</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${tieuchi1}" var="t">
            <tr>            
                <td >${t.tentieuchi}</td>
                <td>Bui Xuan Dung</td> 
                <td>
                    <button class="btn btn-danger" onclick="#">Xóa</button>
                </td>
            </tr>
        </c:forEach>

    </tbody>
</table>