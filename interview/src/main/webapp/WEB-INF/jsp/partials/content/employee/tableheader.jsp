<%--header for application list in evea --%>

<thead>


<c:choose>
    <c:when test="${employee.employeeId != -1 }">

        <tr align="center">

            <th>
                <div class="col px-md-2">
                    <div class="p-3">
                        <spring:message code="employee.id"></spring:message>: ${employee.employeeId}
                    </div>
                </div>
            </th>

                <%--                                    company vat    --%>
            <th>
                <div class="col px-md-2">
                    <div class="p-3">
                        <spring:message code="employee.first.name"></spring:message>: ${employee.firstName}
                    </div>
                </div>
            </th>

            <th>
                <div class="col px-md-2">
                    <div class="p-3">
                        <spring:message code="employee.last.name"></spring:message>: ${employee.lastName}
                    </div>
                </div>

            </th>

            <th>
                <div class="col px-md-2">
                    <div class="p-3">
                        <spring:message code="employee.job"></spring:message>: ${employee.job}
                    </div>
                </div>
            </th>

            <th>
                <div class="col px-md-2">
                    <div class="p-3">
                        <spring:message code="employee.manager"></spring:message>: ${employee.managerId}
                    </div>
                </div>
            </th>

            <th>
                <div class="col px-md-2">
                    <div class="p-3">
                        <spring:message code="employee.hire.date"></spring:message>: ${employee.hireDate}
                    </div>
                </div>

            </th>

            <th>
                <div class="col px-md-2">
                    <div class="p-3">
                        <spring:message code="employee.salary"></spring:message>: ${employee.salary}
                    </div>
                </div>
            </th>

                <%--                                    company vat    --%>
            <th>
                <div class="col px-md-2">
                    <div class="p-3">
                        <spring:message code="employee.comm"></spring:message>: ${employee.comm}
                    </div>
                </div>
            </th>

            <th>
                <div class="col px-md-2">
                    <div class="p-3">
                        <spring:message code="department.id"></spring:message>: ${employee.departmentId}
                    </div>
                </div>

            </th>
        </tr>

    </c:when>
    <c:otherwise>
        <tr align="center">
            <td colspan="6"><spring:message
                    code="employee.not.exist"></spring:message></td>
        </tr>
    </c:otherwise>
</c:choose>

</thead>