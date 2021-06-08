package gr.qnr.employee.interview.service.impl;

import gr.qnr.employee.interview.entity.Department;
import gr.qnr.employee.interview.model.DepartmentModel;
import gr.qnr.employee.interview.repository.DepartmentRepository;
import gr.qnr.employee.interview.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public List<DepartmentModel> getDepartments() {
        List<Department> departments = departmentRepository.findAll();
        List<DepartmentModel> departmentModels = new ArrayList<>();
        for (Department department:departments) {
            departmentModels.add(new DepartmentModel(department.getDepartmentId(), department.getDepartmentName(), department.getDepartmentLocation().getLocationId()));
        }
        return departmentModels;
    }

    @Override
    public List<DepartmentModel> getDepartmentsByLocation(int id) {
        List<Department> departments = departmentRepository.findAllByDepartmentLocationLocationId(id);
        List<DepartmentModel> departmentModels = new ArrayList<>();
        for (Department department:departments) {
            departmentModels.add(new DepartmentModel(department.getDepartmentId(), department.getDepartmentName(), department.getDepartmentLocation().getLocationId()));
        }
        return departmentModels;
    }
}
