package pt.ipp.isep.dei.esoft.project.domain;
import javax.xml.stream.Location;
public class Store {
    private String id;
    private String designation;
    private Location location;
    private String emailAddress;
    private String phoneNumber;

    public Store(String id, String designation,String emailAddress,String phoneNumber){
        setId(id);
        setDesignation(designation);
        setEmailAddress(emailAddress);
        setPhoneNumber(phoneNumber);
    }

    public Store(String id, String designation,Location location,String emailAddress,String phoneNumber){
        setId(id);
        setDesignation(designation);
        setLocation(location);
        setEmailAddress(emailAddress);
        setPhoneNumber(phoneNumber);
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        if (id == null || id.trim().isEmpty()){
            throw new IllegalArgumentException("ID must not be empty or null");
        }
        this.id = id;
    }

    public String getDesignation(){
        return designation;
    }

    public void setDesignation(String designation){
        if (designation == null || designation.trim().isEmpty()){
            throw new IllegalArgumentException("Designation must not be empty or null");
        }
        if (designation.length() > 40){
            throw new IllegalArgumentException("Designation must not be longer than 40 characters");
        }
        this.designation = designation;
    }

    public Location getLocation(){
        return   location;
    }

    public void setLocation(Location location) {
        if (location == null)
            throw new IllegalArgumentException("Location must not be null");
        this.location = location;
    }

   public String getEmailAddress(){
        return emailAddress;
   }

    public void setEmailAddress(String emailAddress){
        if(emailAddress == null || emailAddress.trim().isEmpty()){
            throw new IllegalArgumentException("Email address must not be empty or null");
        }
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        if (phoneNumber == null || phoneNumber.trim().isEmpty()){
            throw new IllegalArgumentException("Phone number must not be empty or null");
        }
        this.phoneNumber = phoneNumber;
    }

    public Location createLocation(String streetAddress, String city, District district, State state, String state, String zipCode){
        return new Location(streetAddress,city,district,state,zipCode);
    }

    @Override

    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Store)){
            return false;
        }
        Store store = (Store) obj;
        return store.getId().equals(this.getId());
    }

    public String toString(){
        return String.format("Store: %s - %s", getId(),getDesignation());
    }
}


