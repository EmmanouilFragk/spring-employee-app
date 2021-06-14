package gr.qnr.employee.interview.controller;

import gr.qnr.employee.interview.model.DepartmentLocationModel;
import gr.qnr.employee.interview.model.DepartmentModel;
import gr.qnr.employee.interview.model.EmployeeModel;
import gr.qnr.employee.interview.service.DepartmentLocationService;
import gr.qnr.employee.interview.service.DepartmentService;
import gr.qnr.employee.interview.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    DepartmentLocationService departmentLocationService;

    @Autowired
    DepartmentService departmentService;

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "")
    public String home(Model model) {
        List<DepartmentLocationModel> departmentLocations = departmentLocationService.getDepartmentLocations();

        model.addAttribute("departmentLocations", departmentLocations);

        return "home";
    }

    @RequestMapping(value = "/{locationId}/departments")
    public String departments(@PathVariable int locationId, Model model) {
        List<DepartmentModel> departments = departmentService.getDepartmentsByLocation(locationId);
        DepartmentLocationModel departmentLocationModel = departmentLocationService.getDepartmentLocationByLocationId(locationId);
        List<DepartmentLocationModel> departmentLocations = departmentLocationService.getDepartmentLocations();
        model.addAttribute("departmentLocations", departmentLocations);
        model.addAttribute("locationName", departmentLocationModel.getLocationName());
        model.addAttribute("locationId", departmentLocationModel.getLocationId());
        model.addAttribute("departments", departments);
        return "home-departments";
    }

    @RequestMapping(value = "/{locationId}/departments/{departmentId}")
    public String employees(@PathVariable int locationId, @PathVariable int departmentId, Model model) {
        List<DepartmentLocationModel> departmentLocations = departmentLocationService.getDepartmentLocations();
        DepartmentLocationModel departmentLocationModel = departmentLocationService.getDepartmentLocationByLocationId(locationId);
        List<EmployeeModel> employees = employeeService.findEmployeesByDepartmentId(departmentId);
        model.addAttribute("departmentLocations", departmentLocations);
        model.addAttribute("locationName", departmentLocationModel.getLocationName());
        model.addAttribute("departmentName", departmentService.getDepartmentByDepartmentId(departmentId).getDepartmentName());
        model.addAttribute("locationId", departmentLocationModel.getLocationId());
        model.addAttribute("employees", employees);
        return "home-employees";
    }

    @RequestMapping(value = "/{locationId}/departments/{departmentId}/employee/{employeeId}")
    public String employeeInfo(@PathVariable int locationId, @PathVariable int departmentId, @PathVariable int employeeId, Model model) {
        List<DepartmentLocationModel> departmentLocations = departmentLocationService.getDepartmentLocations();
        DepartmentLocationModel departmentLocationModel = departmentLocationService.getDepartmentLocationByLocationId(locationId);
        EmployeeModel employee = employeeService.findEmployee(employeeId);
        model.addAttribute("departmentLocations", departmentLocations);
        model.addAttribute("locationName", departmentLocationModel.getLocationName());
        model.addAttribute("departmentName", departmentService.getDepartmentByDepartmentId(departmentId).getDepartmentName());
        model.addAttribute("locationId", departmentLocationModel.getLocationId());
        model.addAttribute("employee", employee);
        return "home-employee";
    }
}
