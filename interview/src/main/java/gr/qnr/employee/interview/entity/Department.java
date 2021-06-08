package gr.qnr.employee.interview.entity;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTMENTS")
public class Department {
    private static final int DEPARTMENT_NAME_LENGTH  = 14;

    @Id
    @Column(name = "DeptId", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int departmentId;

    @Column(name = "Dname", length = DEPARTMENT_NAME_LENGTH)
    private String departmentName;

    @ManyToOne
    @JoinColumn(name = "LocId", insertable = false, updatable = false)
    private DepartmentLocation departmentLocation;

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

    public DepartmentLocation getDepartmentLocation() {
        return departmentLocation;
    }

    public void setDepartmentLocation(DepartmentLocation departmentLocation) {
        this.departmentLocation = departmentLocation;
    }
}
