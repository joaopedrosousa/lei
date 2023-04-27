package pt.ipp.isep.dei.esoft.project.domain;

public class Location {
    private String streetAddress;
    private String city;
    private District district;
    private State state;
    private String zipCode;

    public Location(String streetAddress, String city, District district, State state, String zipCode) {
        setStreetAddress(streetAddress);
        setCity(city);
        setDistrict(district);
        setState(state);
        setZipCode(zipCode);
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        if (streetAddress == null || streetAddress.trim().isEmpty())
            throw new IllegalArgumentException("Street address must not be empty or null");
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.trim().isEmpty())
            throw new IllegalArgumentException("City must not be empty or null");
        this.city = city;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        if (district == null) {
            throw new IllegalArgumentException("District must not be null");
        }
        this.district = district;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        if (state == null) {
            throw new IllegalArgumentException("State must not be empty or null");
        }
        this.state =state;
    }

    public String getZipCode() {
        return streetAddress;
    }

    public void setZipCode(String zipCode) {
        if (zipCode == null || zipCode.trim().isEmpty()) {
            throw new IllegalArgumentException("zip-Code must not be empty or null");
        }
        this.zipCode = zipCode;
    }
}