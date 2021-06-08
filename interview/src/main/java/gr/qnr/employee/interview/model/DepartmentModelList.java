package gr.qnr.employee.interview.model;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Departments")
@XmlSeeAlso({DepartmentModel.class})
public class DepartmentModelList<T> {

    private List<T> listOfDepartments;

    public DepartmentModelList() {
        listOfDepartments = new ArrayList<T>();
    }

    public DepartmentModelList(List<T> listOfEntityObjects) {
        this.listOfDepartments = listOfEntityObjects;
    }

    @XmlAnyElement
    public List<T> getItems() {
        return listOfDepartments;
    }
}
