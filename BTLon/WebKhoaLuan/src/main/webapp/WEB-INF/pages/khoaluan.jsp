<%-- 
    Document   : khoaluan
    Created on : Sep 9, 2023, 8:41:38 PM
    Author     : MR.DUNG
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<h1 class="text-center text-info">DIỄN ĐÀN KHÓA LUẬN</h1>

<table class="table table-hover">
    <thead>
        <tr>
   
            <th>Tên</th>
            <th>Mô tả</th>
            <th>Điểm</th>
            <th>Ngày</th>
        </tr>
    </thead>
    <tbody>

        <c:forEach items="${khoaluan}" var="k">
            <tr>
              
                <td width>${k.ten}</td>
                <td>${k.mota}</td>
                <td>${k.dtb}</td>
                <td>${k.ngay}</td>
                <td>
                 <sec:authorize access="hasRole('ROLE_USER3')">   
                    <a href="<c:url value="/users/${s.id}"/>" class="btn btn-success">Chấm điểm</a>
                 </sec:authorize>   
                    <button class="btn btn-danger" onclick="delUser('${apiDel}',${s.id})">Xóa</button>
                </td>
            </tr>
        </c:forEach>

    </tbody>
</table>