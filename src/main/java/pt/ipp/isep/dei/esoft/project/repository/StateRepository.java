package pt.ipp.isep.dei.esoft.project.repository;

import pt.ipp.isep.dei.esoft.project.domain.District;
import pt.ipp.isep.dei.esoft.project.domain.State;

import java.util.*;

public class StateRepository {
    private List<State> states;

    public StateRepository(){
        this.states = new ArrayList<>();
    }

    public List<State> getStates(){
        return states;
    }

    public boolean registerState(State state){
        return states.add(state);
    }

    public boolean registerDistrictAtState(State state, District district){
        state.addDistrict(district);
        return true;
    }

    public boolean registerCityAtDistrict(District district, City city){
        district.addCity(city);
        return true;
    }

    public boolean createState(String id, String designation){
        return states.add(new State(id, designation));
    }

    public boolean createDistrict(String id, String designation){
        return districts.add(new District(id, designation));
    }

    public boolean createCity(String id, String designation){
        return cities.add(new City(id, designation));
    }
}
