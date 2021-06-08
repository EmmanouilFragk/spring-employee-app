package gr.qnr.employee.interview.controller.rest;

import gr.qnr.employee.interview.model.DepartmentLocationModelList;
import gr.qnr.employee.interview.model.DepartmentLocationModel;
import gr.qnr.employee.interview.service.DepartmentLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class DepartmentLocationRestController {

    @Autowired
    DepartmentLocationService departmentLocationService;

    @RequestMapping(value = "/departments/locations")
    public DepartmentLocationModelList<DepartmentLocationModel> getDepartmentLocations() throws IOException {
        List<DepartmentLocationModel> departmentLocationModelList = departmentLocationService.getDepartmentLocations();
        DepartmentLocationModelList<DepartmentLocationModel> departmentsLocationList = new DepartmentLocationModelList<>(departmentLocationModelList);
        return departmentsLocationList;
    }
}
