package gr.qnr.employee.interview.service.impl;

import gr.qnr.employee.interview.entity.DepartmentLocation;
import gr.qnr.employee.interview.model.DepartmentLocationModel;
import gr.qnr.employee.interview.repository.DepartmentLocationRepository;
import gr.qnr.employee.interview.service.DepartmentLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentLocationImpl implements DepartmentLocationService {
    @Autowired
    DepartmentLocationRepository departmentLocationRepository;

    @Override
    public List<DepartmentLocationModel> getDepartmentLocations() {
        List<DepartmentLocation> departmentLocations = departmentLocationRepository.findAll();
        List<DepartmentLocationModel> departmentLocationModels = new ArrayList<>();
        for (DepartmentLocation departmentLocation:departmentLocations) {
            departmentLocationModels.add(new DepartmentLocationModel(departmentLocation.getLocationId(), departmentLocation.getLocationName()));
        }
        return departmentLocationModels;
    }
}
