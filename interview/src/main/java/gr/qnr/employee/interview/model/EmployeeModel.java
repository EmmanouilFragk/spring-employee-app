package gr.qnr.employee.interview.model;

import gr.qnr.employee.interview.entity.Department;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Employee")
public class EmployeeModel {
    private int employeeId;

    private String lastName;

    private String firstName;

    private String job;

    private int managerId;

    // check datetime in spring
    private String hireDate;

    private float salary;

    private float comm;

    private int departmentId;

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

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
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

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public EmployeeModel() {
    }

    public EmployeeModel(int employeeId, String lastName, String firstName, String job, int managerId, String hireDate, float salary, float comm, int departmentId) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.job = job;
        this.managerId = managerId;
        this.hireDate = hireDate;
        this.salary = salary;
        this.comm = comm;
        this.departmentId = departmentId;
    }
}
