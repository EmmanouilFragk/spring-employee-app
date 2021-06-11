package gr.qnr.employee.interview.service;

import gr.qnr.employee.interview.entity.Employee;
import gr.qnr.employee.interview.model.EmployeeModel;

import java.util.List;

public interface EmployeeService {
    EmployeeModel findEmployee(int id);
    List<EmployeeModel> findEmployees(String firstName, String lastName);
    List<EmployeeModel> findEmployeesByDepartmentId(int id);
}
