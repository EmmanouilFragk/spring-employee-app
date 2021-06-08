package gr.qnr.employee.interview.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DepartmentLocation")
public class DepartmentLocationModel {

    private int locationId;

    private String locationName;

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public DepartmentLocationModel() {
    }

    public DepartmentLocationModel(int locationId, String locationName) {
        this.locationId = locationId;
        this.locationName = locationName;
    }
}
