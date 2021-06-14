package gr.qnr.employee.interview.model;

import gr.qnr.employee.interview.entity.DepartmentLocation;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Department")
public class DepartmentModel {
    private int departmentId;

    private String departmentName;

    private int departmentLocationId;

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
        return departmentLocationId;
    }

    public void setDepartmentLocationId(int departmentLocationId) {
        departmentLocationId = departmentLocationId;
    }

    public DepartmentModel(int departmentId, String departmentName, int departmentLocationId) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentLocationId = departmentLocationId;
    }

    public DepartmentModel() {
    }
}
