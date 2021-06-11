package gr.qnr.employee.interview.controller.rest;

import gr.qnr.employee.interview.model.EmployeeModel;
import gr.qnr.employee.interview.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeDetailsRestController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employee-details/{empId}", produces = { MediaType.APPLICATION_XML_VALUE  })
    public ResponseEntity<EmployeeModel> getEmployee(@PathVariable(value = "empId") int empId) throws IOException {
        EmployeeModel employeeModel = employeeService.findEmployee(empId);
        if (employeeModel != null) {
            return new ResponseEntity<>(employeeModel, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
