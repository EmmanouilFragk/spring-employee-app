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