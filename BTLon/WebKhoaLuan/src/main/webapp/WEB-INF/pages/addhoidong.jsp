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
        <div class="form-floating" style="margin-bottom: 12px">
        <form:select class="form-select" id="idchutich" name="idchutich" path="idchutich">
            <c:forEach items="${usersGV}" var="s">
                <c:choose>
                    <c:when test="${s.id == hoidong.idchutich.id}"><option value="${s.id}" selected>${s.ten}</option></c:when>
                    <c:otherwise><option value="${s.id}">${s.ten}</option></c:otherwise>
                </c:choose>
            </c:forEach> 
        </form:select>

    </div>
    <div class="form-floating" style="margin-bottom: 12px">
        <form:select class="form-select" id="idthuky" name="idthuky" path="idthuky">
            <c:forEach items="${usersGV}" var="s">
                <c:choose>
                    <c:when test="${s.id == hoidong.idthuky.id}"><option value="${s.id}" selected>${s.ten}</option></c:when>
                    <c:otherwise><option value="${s.id}">${s.ten}</option></c:otherwise>
                </c:choose>

            </c:forEach> 
        </form:select>

    </div>
    <div class="form-floating" style="margin-bottom: 12px" >
        <form:select class="form-select" id="idphanbien" name="idphanbien" path="idphanbien">
            <c:forEach items="${usersGV}" var="s">
                <c:choose>
                    <c:when test="${s.id == hoidong.idphanbien.id}">
                        <option value="${s.id}" selected>${s.ten}</option>
                    </c:when>
                    <c:otherwise>
                        <option value="${s.id}">${s.ten}</option>
                    </c:otherwise>
                </c:choose>

            </c:forEach> 
        </form:select>
    </div>

    <div class="form-floating mb-3 mt-3">
        <button type="submit" class="btn btn-info">Them </button>
    </div>
</form:form>

<table class="table table-hover">
    <thead>
        <tr>

            <th>Tên</th>
            <th>Chủ tịch</th>
            <th>Phản biện</th>
            <th>Thư ký</th>
        </tr>
    </thead>
    <tbody>

        <c:forEach items="${hoidong1}" var="h">
            <tr>            
                <td >${h.tenhoidong}</td>
                <td>${h.idchutich.ten}</td> 
                 <td>${h.idphanbien.ten}</td>
                <td>${h.idthuky.ten}</td>    
            </tr>
        </c:forEach>

    </tbody>
</table>