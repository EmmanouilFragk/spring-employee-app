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
                <li class="nav-item"><a class="nav-link" href="<c:url value="/home"/>"><spring:message
                        code="home.page"></spring:message></a></li>
                <li class="nav-item"><a class="nav-link" href="<c:url value="/client/departmentLocations"/>"><spring:message
                        code="all.locations.list"></spring:message></a></li>
                <li class="nav-item"><a class="nav-link"
                                        href="<c:url value="/client/departments"/>"><spring:message
                        code="all.departments.list"></spring:message></a></li>
                <li class="nav-item"><a class="nav-link"
                                        href="<c:url value="/client/departmentsByLocation"/>"><spring:message
                        code="departments.by.location.list"></spring:message></a></li>
                <li class="nav-item"><a class="nav-link"
                                        href="<c:url value="/client/employeesByDepartment"/>"><spring:message
                        code="employee.by.department.list"></spring:message></a></li>
                <li class="nav-item"><a class="nav-link"
                                        href="<c:url value="/client/employeesByName"/>"><spring:message
                        code="employee.by.name.list"></spring:message></a></li>
                <li class="nav-item"><a class="nav-link"
                                        href="<c:url value="/client/employeeInfo"/>"><spring:message
                        code="employee.info"></spring:message></a></li>
            </ul>
        </nav>
        <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
</aside>