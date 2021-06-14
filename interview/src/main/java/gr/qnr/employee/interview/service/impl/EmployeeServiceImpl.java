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
        EmployeeModel employeeModel;
        Employee employee = employeeRepository.findByEmployeeId(id);
        if (employee != null) {
            employeeModel = new EmployeeModel(employee.getEmployeeId(),
                    employee.getLastName(),
                    employee.getFirstName(),
                    employee.getJob(),
                    employee.getManagerId(),
                    employee.getHireDate().toString(),
                    employee.getSalary(),
                    employee.getComm(),
                    employee.getDepartment().getDepartmentId());
        } else {
            employeeModel = new EmployeeModel(-1,
                    "",
                    "",
                    "",
                    -1,
                    "",
                    0,
                    0,
                    -1);
        }
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

    @Override
    public List<EmployeeModel> findEmployees(String firstName, String lastName) {
        List<EmployeeModel> employeeModels = new ArrayList<>();
        if (!firstName.isEmpty() && !lastName.isEmpty()) {
            List<Employee> employees = employeeRepository.findEmployeesByFirstNameLikeAndLastNameLike(firstName, lastName);
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
        List<Employee> employees = employeeRepository.findEmployeesByFirstNameLike(firstName);

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

        employees = employeeRepository.findEmployeesByLastNameLike(lastName);

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

    @Override
    public List<EmployeeModel> findEmployees(String name) {
        List<EmployeeModel> employeeModels = new ArrayList<>();
        List<Employee> employees = employeeRepository.findEmployeesBySearch(name);

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
