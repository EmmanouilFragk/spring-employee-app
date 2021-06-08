package gr.qnr.employee.interview.service.impl;

import gr.qnr.employee.interview.entity.Employee;
import gr.qnr.employee.interview.model.EmployeeModel;
import gr.qnr.employee.interview.repository.EmployeeRepository;
import gr.qnr.employee.interview.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public EmployeeModel findEmployee(int id) {
        Employee employee = employeeRepository.findByEmployeeId(1);
        EmployeeModel employeeModel = new EmployeeModel(employee.getEmployeeId(),
                employee.getLastName(),
                employee.getFirstName(),
                employee.getJob(),
                employee.getManagerId(),
                employee.getHireDate().toString(),
                employee.getSalary(),
                employee.getComm(),
                2);
        return employeeModel;
    }

    @Override
    public List<EmployeeModel> findEmployeesByDepartmentId(int id) {
        List<Employee> employees = employeeRepository.findAllByDepartmentDepartmentId(id);
        List<EmployeeModel> employeeModels = new ArrayList<>();
        for (Employee employee : employees) {
            employeeModels.add(new EmployeeModel(employee.getEmployeeId(),
                    employee.getLastName(),
                    employee.getFirstName(),
                    employee.getJob(),
                    employee.getManagerId(),
                    employee.getHireDate().toString(),
                    employee.getSalary(),
                    employee.getComm(),
                    employee.getDepartment().getDepartmentId()));

        }
        return employeeModels;
    }
}
