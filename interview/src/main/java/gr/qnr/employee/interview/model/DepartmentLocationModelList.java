package gr.qnr.employee.interview.model;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "DepartmentsLocation")
@XmlSeeAlso({DepartmentLocationModel.class})
public class DepartmentLocationModelList<T> {

    private List<T> listOfDepartmentLocation;

    public DepartmentLocationModelList() {
        listOfDepartmentLocation = new ArrayList<T>();
    }

    public DepartmentLocationModelList(List<T> listOfEntityObjects) {
        this.listOfDepartmentLocation = listOfEntityObjects;
    }

//    public List<T> getListOfDepartmentLocation() {
//        return listOfDepartmentLocation;
//    }
//
//    public void setListOfDepartmentLocation(List<T> listOfDepartmentLocation) {
//        this.listOfDepartmentLocation = listOfDepartmentLocation;
//    }

    @XmlAnyElement
    public List<T> getItems() {
        return listOfDepartmentLocation;
    }
}
