package gr.qnr.employee.interview.repository;

import gr.qnr.employee.interview.entity.Department;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface DepartmentRepository extends PagingAndSortingRepository<Department, Long> {
    List<Department> findAll();
    List<Department> findAllByDepartmentLocationLocationId(int locationId);
}
