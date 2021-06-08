package gr.qnr.employee.interview.controller.rest;

import gr.qnr.employee.interview.model.DepartmentModel;
import gr.qnr.employee.interview.model.DepartmentModelList;
import gr.qnr.employee.interview.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class DepartmentByLocationRestController {
    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "/departments/location/{locationId}")
    public DepartmentModelList<DepartmentModel> getDepartmentLocations(@PathVariable int locationId) throws IOException {
        List<DepartmentModel> departmentModelList = departmentService.getDepartmentsByLocation(locationId);
        DepartmentModelList<DepartmentModel> modelList = new DepartmentModelList<>(departmentModelList);
        return modelList;
    }
}
