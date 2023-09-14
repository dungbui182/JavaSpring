<%-- 
    Document   : user
    Created on : Sep 6, 2023, 3:35:24 PM
    Author     : MR.DUNG
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h1 class="text-center text-info">QUẢN LÝ NGƯỜI DÙNG</h1>

<c:url value="/users" var="action" />
<form:form method="post" action="${action}" modelAttribute="user" enctype="multipart/form-data">
    <form:errors path="*" element="div" cssClass="alert alert-danger" />
    <form:hidden path="id" />
    <form:hidden path="img" />
   
  
        <div class="form-floating mb-3 mt-3">
            <form:input type="text" class="form-control" path="username" id="username" placeholder="username nguoi dung" name="username" />
            <label for="username">username nguoi dung</label>
        </div>
        <div class="form-floating mb-3 mt-3">
            <form:input type="text" class="form-control" path="password" id="password" placeholder="password nguoi dung" name="password" />
            <label for="password">password nguoi dung</label>
        </div>
        <div class="form-floating">

            <form:select class="form-select" id="chucvu" path="chucvu" name="chucvu">
                <option>sinh vien</option>
                <option>giang vien</option>
                <option>giao vu</option>
            </form:select>
            <label for="chucvu" class="form-label">Chon vai tro:</label>
        </div>
        <div class="form-floating mb-3 mt-3">
            <form:input type="text" class="form-control" path="ten" id="ten" placeholder="Tên nguoi dung" name="ten" />
            <label for="ten">Tên nguoi dung</label>
             <form:errors path="ten" element="div" cssClass="text-danger" />
        </div> 
        <div class="form-floating mb-3 mt-3">
            <form:input type="text" class="form-control" path="nganh" id="nganh" placeholder="Nganh" name="nganh" />
            <label for="nganh">Nganh</label>
        </div>
        <div class="form-floating mb-3 mt-3">
            <form:input type="text" class="form-control" path="email" id="email" placeholder="Email nguoi dung" name="email" />
            <label for="email">Email nguoi dung</label>
        </div>
              <div class="form-floating mb-3 mt-3">
            <form:input type="file" class="form-control" path="file" id="file" />
            <label for="file">Avatar</label>
        </div> 


     <div class="form-floating mb-3 mt-3">
        <button type="submit" class="btn btn-info">
            <c:choose>
                <c:when test="${user.id != null}">Cập nhật</c:when>
                <c:otherwise>Thêm</c:otherwise>
            </c:choose>
        </button>
    </div>
</form:form>
