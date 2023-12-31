<%-- 
    Document   : header
    Created on : Sep 6, 2023, 11:50:44 AM
    Author     : MR.DUNG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-expand-sm navbar" style="background-color: #1A6E66 ">
    <div class="container">
<!--<div class="container-fluid">
    <div class="row flex-nowrap">
        <div class="col-auto col-md-3 col-xl-2 px-sm-2 px-0" style="background-color: #3c4b64;width: 300px;">
            <div class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2 text-white min-vh-100">-->
                <a class="navbar-brand" href="javascript:void(0)" style="color: white">Logo</a>
                              
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="mynavbar">
                    <ul class="navbar-nav me-auto">
                        <!--                <li class="nav-item">
                                            <a class="nav-link" href="javascript:void(0)">Quan Ly Nguoi Dung</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="javascript:void(0)">Thong Ke</a>
                                        </li>-->

                        <c:choose>
                            <c:when test="${pageContext.request.userPrincipal.name != null}">
                                <li class="nav-item">
                                    <a class="nav-link text-danger" href="<c:url value="/" />" style="color: white; font-weight: bold">Chào ${pageContext.request.userPrincipal.name}!</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="<c:url value="/logout" />" style="color: white">Đăng xuất</a>
                                </li>
                            </c:when>
                            <c:otherwise>
                                <li class="nav-item">
                                    <a class="nav-link" href="<c:url value="/login" />" style="color: white">Đăng nhập</a>
                                </li>
                            </c:otherwise>
                        </c:choose>
                    </ul>
                </div>
<!--            </div>
        </div>-->

            </div>
        </nav>
