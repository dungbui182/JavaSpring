<%-- 
    Document   : index
    Created on : Sep 5, 2023, 1:45:29 PM
    Author     : MR.DUNG
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<section class="container">

    <div class="container mt-3">

        <!--        <ul class="nav justify-content-center">
                    <li class="nav-item">
                        <a class="nav-link btn btn-dark" href="<c:url value="/users"/>" style="color: white">Giảng viên</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link btn btn-dark" href="#section2" style="color: white">Sinh viên</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link btn btn-dark" href="#section3" style="color: white">Giáo vụ</a>
                    </li>
    
            <li class="nav-item">
                <a class="nav-link btn btn-danger" href="<c:url value="/users"/>" style="color: white">Thêm mới</a>
            </li>

    </ul>-->


        <ul class="nav nav-tabs">
            <sec:authorize access="hasRole('ROLE_ADMIN')">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#" style="color: red; font-weight: bold; ">QUẢN LÝ NGƯỜI DÙNG</a>
                    <h1>Sinh viên</h1>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Avatar</th>
                                <th>Tên</th>
                                <th>Ngành</th>
                                <th>Email</th>
                                <th>Vai Trò</th>
                            </tr>
                        </thead>
                        <tbody>

                            <c:forEach items="${usersAll}" var="s">
                                <tr>
                                    <td>
                                        <img src="${s.img}" alt="${s.img}" width="80" height="80" style="border-radius: 50px" />
                                    </td>
                                    <td width>${s.ten}</td>
                                    <td>${s.nganh}</td>
                                    <td>${s.email}</td>
                                    <td>${s.chucvu}</td>
                                    <td>
                                        <c:url value="/api/users/${s.id}" var="apiDel"/>
                                        <a href="<c:url value="/users/${s.id}"/>" class="btn btn-success">Cập nhật</a>
                                        <button class="btn btn-danger" onclick="delUser('${apiDel}',${s.id})">Xóa</button>
                                        
                                    </td>
                                </tr>
                            </c:forEach>

                        </tbody>
                    </table>
                </li>
            </sec:authorize>

            <sec:authorize access="hasRole('ROLE_ADMIN')">
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/users"/>" style="color: red; font-weight: bold; ">Thêm mới</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#" style="color: red; font-weight: bold; ">Thống kê</a>
                </li>
            </sec:authorize>

            <sec:authorize access="hasRole('ROLE_USER3')">
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/addkhoaluan"/>" style="color: red; font-weight: bold; ">Đăng Ký Khóa Luận</a>
                </li>

            </sec:authorize>
            <li class="nav-item">
                <a class="nav-link" href="<c:url value="/khoaluan"/>"  style="color: red; font-weight: bold; ">Diễn đàn</a>
            </li>
             <sec:authorize access="hasRole('ROLE_USER1')">
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/addhoidong"/>" style="color: red; font-weight: bold; ">Thanh lap hoi dong</a>
                </li>
                 <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/addtieuchi"/>" style="color: red; font-weight: bold; ">quan ly tieu chi</a>
                </li>
            </sec:authorize>

        </ul>

    </div>

</section>
<script src="<c:url value="/js/main.js"/>"></script>