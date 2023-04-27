package pt.ipp.isep.dei.esoft.project.domain;

import java.util.ArrayList;
import java.util.List;

public class State {
    private String name;
    private List<District> districts;

    public State(String name){
        this.name = name;
        districts = new ArrayList<>();
    }

    public State(String name, List<District> districts){
        this.name = name;
        this.districts = districts;
    }

    public String getName(){
        return name;
    }

    public List<District> getDistricts(){
        return districts;
    }

    public boolean addDistrict(District district){
        return districts.add(district);
    }

    public boolean removeDistrict(District district){
        return districts.remove(district);
    }

    public boolean removeDistrict(String name){
        int size = districts.size();
        return districts.removeIf(district -> district.getName().equals(name));
    }

    public boolean checkIfContainsDistrict(String name){
        return districts.stream().anyMatch(district -> district.getName().equals(name));
    }
}
