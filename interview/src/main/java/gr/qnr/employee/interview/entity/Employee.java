package gr.qnr.employee.interview.entity;

import javax.persistence.*;


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
    private String hireDate;

    @Column(precision=10, scale=2)
    private float salary;

    @Column(precision=7, scale=2)
    private float comm;

    @ManyToOne
    @JoinColumn(name = "DeptId", insertable = false, updatable = false)
    private Department department;
}
