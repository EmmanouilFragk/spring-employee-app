
<%--body for application list in evea --%>

<tbody>


    <c:choose>
        <c:when test="${employee.employeeId != -1 }">

            <c:forEach var="department" items="${departments}" varStatus="tagStatus">

                <tr align="center" class='clickable-row' data-href='/home/${department.departmentLocationId}/departments/${department.departmentId}'>
                    <td>${department.departmentId}</td>
                    <td>${department.departmentName}</td>
                    <td>${department.departmentLocationId}</td>
                </tr>
            </c:forEach>

        </c:when>
        <c:otherwise>
            <tr align="center">
                <td colspan="6"><spring:message
                        code="employee.not.exist"></spring:message></td>
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