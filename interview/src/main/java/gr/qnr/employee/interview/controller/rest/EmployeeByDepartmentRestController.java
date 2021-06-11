package gr.qnr.employee.interview.controller.rest;

import gr.qnr.employee.interview.model.EmployeeModel;
import gr.qnr.employee.interview.model.EmployeeModelList;
import gr.qnr.employee.interview.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class EmployeeByDepartmentRestController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employees/{departmentId}")
    public EmployeeModelList<EmployeeModel> getEmployeesByDepartment(@PathVariable int departmentId) throws IOException {
        List<EmployeeModel> employeeModels = employeeService.findEmployeesByDepartmentId(departmentId);
        EmployeeModelList<EmployeeModel> modelList = new EmployeeModelList<>(employeeModels);
        return modelList;
    }
}
