package gr.qnr.employee.interview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {
    @RequestMapping(value = "")
    public String clientHome() {
        return "client";
    }

    @RequestMapping(value = "/departmentLocations")
    public String departmentLocations() {
        return "departmentLocations";
    }

    @RequestMapping(value = "/departments")
    public String departments() {
        return "departments";
    }

    @RequestMapping(value = "/departmentsByLocation")
    public String departmentsByLocation() {
        return "departmentsByLocation";
    }

    @RequestMapping(value = "/employeesByDepartment")
    public String employeesByDepartment() {
        return "employeesByDepartment";
    }

    @RequestMapping(value = "/employeesByName")
    public String employeesByName() {
        return "employeesByName";
    }

    @RequestMapping(value = "/employeeInfo")
    public String employeeInfo() {
        return "employeeInfo";
    }
}
