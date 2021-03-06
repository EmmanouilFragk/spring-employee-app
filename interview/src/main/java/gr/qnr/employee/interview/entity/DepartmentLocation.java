package gr.qnr.employee.interview.entity;

import javax.persistence.*;


@Entity
@Table(name = "Dept_Locations")
public class DepartmentLocation {
    private static final int LOCATION_NAME_LENGTH  = 50;

    @Id
    @Column(name = "LocId", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int locationId;

    @Column(name = "Locname", length = LOCATION_NAME_LENGTH)
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
}
