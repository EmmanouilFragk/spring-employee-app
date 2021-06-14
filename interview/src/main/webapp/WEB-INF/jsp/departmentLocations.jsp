<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>

    <title><spring:message
            code="all.locations.list"></spring:message></title>
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
    <%@include file="./partials/client-sidebar.jsp" %>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">

        <!-- Main content -->
        <div class="row">
            <div class="col-12">
                <div class="card">
                    <div class="card-header">
                        <h3 class="card-title"><spring:message
                                code="all.locations.list"></spring:message></h3>
                    </div>
                    <div class="card-body">
                        <section class="content col-md-3">
                            <button class="btn btn-primary" id="requestLoadData" type="button" onclick="loadData()">
                                <spring:message
                                        code="load.data"></spring:message>
                            </button>


                            <textarea rows="20" cols="30" style="border:none;">
                            </textarea>


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

<script>
    function loadData() {
        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
                myFunction(this);
            }
        };
        xhttp.open("GET", "/departments/locations", true);
        xhttp.send();
    }
    function myFunction(xml) {
        $('textarea').val(xml.responseText);
    }
</script>