package gr.qnr.employee.interview.model;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Employees")
@XmlSeeAlso({EmployeeModel.class})
public class EmployeeModelList<T> {
    private List<T> listOfEmployees;

    public EmployeeModelList() {
        listOfEmployees = new ArrayList<T>();
    }

    public EmployeeModelList(List<T> listOfEntityObjects) {
        this.listOfEmployees = listOfEntityObjects;
    }

    @XmlAnyElement
    public List<T> getItems() {
        return listOfEmployees;
    }
}
