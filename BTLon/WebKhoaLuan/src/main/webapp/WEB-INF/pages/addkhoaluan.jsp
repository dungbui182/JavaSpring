<%-- 
    Document   : khoaluan
    Created on : Sep 9, 2023, 8:41:38 PM
    Author     : MR.DUNG
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h1 class="text-center text-info">DANG KY KHOA LUAN</h1>

<c:url value="/addkhoaluan" var="action"/>
<form:form method="post" action="${action}" modelAttribute="khoaluan" enctype="multipart/form-data">
        <form:errors path="*" element="div" cssClass="alert alert-danger" />

     <form:hidden path="id" />
    
    
    
    <div class="form-floating mb-3 mt-3">
        <form:input type="text" class="form-control" path="ten" id="ten" placeholder="Ten khoa luan" name="ten" />
        <label for="ten">Tên khóa luận</label>
    </div>
    <div class="form-floating mb-3 mt-3">
        <form:input type="text" class="form-control" path="mota" id="mota" placeholder="mo ta ve khoa luan" name="mota" />
        <label for="mota">Giới thiệu về khóa luận </label>
    </div>
 
     <div class="form-floating mb-3 mt-3">
        <button type="submit" class="btn btn-info">Thêm</button>
    </div>
</form:form>