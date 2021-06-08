package gr.qnr.employee.interview.service;

import gr.qnr.employee.interview.entity.Department;
import gr.qnr.employee.interview.model.DepartmentModel;

import java.util.List;

public interface DepartmentService {
    List<DepartmentModel> getDepartments();
    List<DepartmentModel> getDepartmentsByLocation(int id);
}
