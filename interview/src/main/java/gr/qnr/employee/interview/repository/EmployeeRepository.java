package gr.qnr.employee.interview.repository;

import gr.qnr.employee.interview.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findAllByDepartmentDepartmentId(int id);
    Employee findByEmployeeId(int id);
    List<Employee> findEmployeesByFirstNameLike(String firstName);
    List<Employee> findEmployeesByLastNameLike(String lastName);
    List<Employee> findEmployeesByFirstNameLikeAndLastNameLike(String firstName, String lastname);
}
