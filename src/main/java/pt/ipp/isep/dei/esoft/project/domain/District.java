package pt.ipp.isep.dei.esoft.project.domain;
import java.util.ArrayList;
import java.util.List;
public class District {
    private String name;
    private List<String> cities;

    public District(String name){
        this.name = name;
        cities = new ArrayList<>();
    }

    public District(String name, List<String> cities){
        this.name = name;
        this.cities = cities;
    }

    public String getName(){
        return name;
    }

    public List<String> getCities(){
        return cities;
    }

    public boolean addCity(String city){
        return cities.add(city);
    }

    public boolean removeCity(String city){
        return cities.remove(city);
    }

    public boolean checkIfContainsCity(String city){
        return cities.stream().anyMatch(c -> c.equals(city));
    }
}
