package gr.qnr.employee.interview.entity;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "EMPLOYEES")
public class Employee {
    private static final int LAST_NAME_LENGTH  = 20;
    private static final int FIRST_NAME_LENGTH  = 15;
    private static final int JOB_LENGTH  = 9;

    @Id
    @Column(name = "Empid", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int employeeId;

    @Column(name = "Lastname", length = LAST_NAME_LENGTH)
    private String lastName;

    @Column(name = "Firstname", length = FIRST_NAME_LENGTH)
    private String firstName;

    @Column(name = "Job", length = JOB_LENGTH)
    private String job;

    @Column(name = "MNGID")
    private int managerId;

    // check datetime in spring
    @Column(name = "Hiredate")
    private Timestamp hireDate;

    @Column(precision=10, scale=2)
    private float salary;

    @Column(precision=7, scale=2)
    private float comm;

    @ManyToOne
    @JoinColumn(name = "DeptId", insertable = false, updatable = false)
    private Department department;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getComm() {
        return comm;
    }

    public void setComm(float comm) {
        this.comm = comm;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
