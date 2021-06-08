package gr.qnr.employee.interview.model;

import gr.qnr.employee.interview.entity.DepartmentLocation;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Department")
public class DepartmentModel {
    private int departmentId;

    private String departmentName;

    private int DepartmentLocationId;

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentLocationId() {
        return DepartmentLocationId;
    }

    public void setDepartmentLocationId(int departmentLocationId) {
        DepartmentLocationId = departmentLocationId;
    }

    public DepartmentModel(int departmentId, String departmentName, int departmentLocationId) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        DepartmentLocationId = departmentLocationId;
    }

    public DepartmentModel() {
    }
}
