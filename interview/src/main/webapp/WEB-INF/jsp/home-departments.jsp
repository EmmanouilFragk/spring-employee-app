<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>

    <title><spring:message
            code="departments.by.location.list"></spring:message></title>
    <%@include file="./partials/header.jsp" %>

    <%--    <link rel="stylesheet" href="../../resources/utils/css/icon-styles.css">--%>

</head>

<body>
<div class="wrapper">
    <!-- Navbar -->
    <nav class="main-header navbar navbar-expand navbar-white navbar-light">
        <!-- Left navbar links -->
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" data-widget="pushmenu" href="#"><i class="fas fa-bars"></i></a>
            </li>
        </ul>

    </nav>
    <!-- /.navbar -->

    <!-- Main Sidebar Container -->
    <aside class="main-sidebar sidebar-dark-primary elevation-4">

        <!-- Sidebar -->
        <div class="sidebar">
            <!-- Sidebar user (optional) -->
            <div class="user-panel mt-3 pb-3 mb-3 text-center">
                <a target="_blank" href="https://www.qnr.com.gr/">
                    <img alt="ΕΒΕΑ" class="logo-image" src="<c:url value="/resources/images/qnr.jpg"/>"/>
                </a>
            </div>

            <!-- Sidebar Menu -->
            <nav class="mt-2">
                <ul class="nav nav-pills nav-sidebar flex-column">
                    <li class="nav-item"><a class="nav-link" href="<c:url value="/client"/>"><spring:message
                            code="client.subsystem"></spring:message></a></li>
                    <li class="nav-item"><a class="nav-link"><spring:message
                            code="all.locations.list"></spring:message></a></li>
                    <c:forEach items="${departmentLocations}" var="departmentLocation">
                        <li class="nav-item"><a class="nav-link" href="<c:url value="/home/${departmentLocation.locationId}/departments"/>">${departmentLocation.locationName}</a></li>
                    </c:forEach>
                </ul>
            </nav>
            <!-- /.sidebar-menu -->
        </div>
        <!-- /.sidebar -->
    </aside>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">

        <!-- Main content -->
        <div class="row">
            <div class="col-12">
                <div class="card">
                    <div class="card-header">
                        <h3 class="card-title">${locationName}</h3>
                    </div>
                    <div class="card-body">
                        <section class="content">
                            <div class="card-body">
                                <table id="department-list" class="table table-bordered table-hover">

                                    <%@include file="./partials/content/departments/tableheader.jsp" %>

                                    <%@include file="./partials/content/departments/tablebody.jsp" %>


                                </table>

<%--                                <%@include file="../partials/content/pagination/table-navigation-pagination.jsp" %>--%>


                            </div>


                        </section>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<%@include file="./partials/scripts.jsp" %>
<%@include file="./partials/datatable-scripts.jsp" %>

</body>
</html>