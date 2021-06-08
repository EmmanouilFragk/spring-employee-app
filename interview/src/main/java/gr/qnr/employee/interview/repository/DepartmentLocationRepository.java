package gr.qnr.employee.interview.repository;

import gr.qnr.employee.interview.entity.DepartmentLocation;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface DepartmentLocationRepository extends PagingAndSortingRepository<DepartmentLocation, Long> {
    List<DepartmentLocation> findAll();
    DepartmentLocation findDepartmentLocationByLocationId(int locId);
    DepartmentLocation findDepartmentLocationByLocationName(String locationName);
}
