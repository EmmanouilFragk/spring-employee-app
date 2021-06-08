package gr.qnr.employee.interview.controller.rest;

import gr.qnr.employee.interview.model.DepartmentLocationModel;
import gr.qnr.employee.interview.model.DepartmentLocationModelList;
import gr.qnr.employee.interview.model.DepartmentModel;
import gr.qnr.employee.interview.model.DepartmentModelList;
import gr.qnr.employee.interview.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class DepartmentRestController {

    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "/departments")
    public DepartmentModelList<DepartmentModel> getDepartmentLocations() throws IOException {
        List<DepartmentModel> departmentModelList = departmentService.getDepartments();
        DepartmentModelList<DepartmentModel> modelList = new DepartmentModelList<>(departmentModelList);
        return modelList;
    }

}
