package gr.qnr.employee.interview.repository;

import gr.qnr.employee.interview.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findAllByDepartmentDepartmentId(int id);
    Employee findByEmployeeId(int id);
    List<Employee> findEmployeesByFirstNameLike(String firstName);
    List<Employee> findEmployeesByLastNameLike(String lastName);
    List<Employee> findEmployeesByFirstNameLikeAndLastNameLike(String firstName, String lastname);

    @Query(value = "SELECT * FROM employees WHERE concat(employees.firstname, \" \", qnr_db.employees.lastname) LIKE %:name%", nativeQuery = true)
    List<Employee> findEmployeesBySearch(@Param("name") String name);
}
