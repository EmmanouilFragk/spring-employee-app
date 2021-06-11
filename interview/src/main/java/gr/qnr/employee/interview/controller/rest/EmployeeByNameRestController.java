package gr.qnr.employee.interview.controller.rest;

import com.fasterxml.jackson.databind.node.ObjectNode;
import gr.qnr.employee.interview.model.DepartmentModel;
import gr.qnr.employee.interview.model.DepartmentModelList;
import gr.qnr.employee.interview.model.EmployeeModel;
import gr.qnr.employee.interview.model.EmployeeModelList;
import gr.qnr.employee.interview.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class EmployeeByNameRestController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employee/search", method = RequestMethod.POST, produces = { MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE  }, consumes = { MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE, })
    public EmployeeModelList<EmployeeModel> getEmployees(@RequestBody ObjectNode objectNode) throws IOException {
        List<EmployeeModel> employeeModels = employeeService.findEmployees(objectNode.get("firstName").asText(), objectNode.get("lastName").asText());
        EmployeeModelList<EmployeeModel> modelList = new EmployeeModelList<>(employeeModels);
        return modelList;
    }
}
