
<%--body for application list in evea --%>

<tbody>


    <c:choose>
        <c:when test="${employees.size() > 0 }">

            <c:forEach var="employee" items="${employees}" varStatus="tagStatus">

                <tr align="center" class='clickable-row' data-href='/home/${locationId}/departments/${employee.departmentId}/employee/${employee.employeeId}'>
                    <td>${employee.employeeId}</td>
                    <td>${employee.firstName}</td>
                    <td>${employee.lastName}</td>
                </tr>
            </c:forEach>

        </c:when>
        <c:otherwise>
            <tr align="center">
                <td colspan="6"><spring:message
                        code="employees.no.results"></spring:message></td>
            </tr>
        </c:otherwise>
    </c:choose>

</tbody>

<script>
    jQuery(document).ready(function($) {
        $(".clickable-row").click(function() {
            window.location = $(this).data("href");
        });
    });
</script>