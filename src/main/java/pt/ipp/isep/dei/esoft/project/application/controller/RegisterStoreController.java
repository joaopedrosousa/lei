package pt.ipp.isep.dei.esoft.project.application.controller;

import pt.ipp.isep.dei.esoft.project.domain.District;
import pt.ipp.isep.dei.esoft.project.domain.State;
import pt.ipp.isep.dei.esoft.project.domain.Store;
import pt.ipp.isep.dei.esoft.project.repository.StateRepository;
import pt.ipp.isep.dei.esoft.project.repository.StoreRepository;
import pt.ipp.isep.dei.esoft.project.domain.Location;


import java.util.*;
public class RegisterStoreController {
    private StoreRepository storeRepository;
    private StateRepository stateRepository;

    public RegisterStoreController(StoreRepository storeRepository){
        this.storeRepository = storeRepository;
    }

    public List<Store> getStores(){
        return storeRepository.getStores();
    }

    public Store createStore(String id, String designation, String emailAddress,String phoneNumber){
        return storeRepository.createStore(id,designation,emailAddress,phoneNumber);
    }

    public Store createStore(String id,String designation,Location  location, String emailAddress, String phoneNumber){
        return storeRepository.createStore(id,designation,location,emailAddress,phoneNumber);
    }

    public boolean registerStore(Store store){
        return storeRepository.registerStore(store);
    }

    public boolean registerLocationAtStore(Store store, Location location){
        return storeRepository.registerLocationAtStore(store, location);
    }

    public boolean createStoreLocation(String id,String designation, String Address, String zipCode,String city,String country){
        return storeRepository.createStoreLocation(streetAddress,city,district,state,zipCode);
    }

    public void listStates(){
        List<State> states = stateRepository.getStates();
        for (State state : states){
            System.out.println(state.getDesignation());
        }
    }

    public void listDistricts(State state){
        List<District> districts = state.getDistricts();
        for (District district : districts){
            System.out.println(district.getDesignation());
        }
    }

    public void listCities(District district){
        List<City> cities = district.getCities();
        for (City city : cities){
            System.out.println(city.getDesignation());
        }
    }

    public State getStateByDesignation(String designation){
        List<State> states = stateRepository.getStates();
        for (State state : states){
            if (state.getDesignation().equals(designation)){
                return state;
            }
        }
        return null;
    }
    public District getCityByDesignation(State state, String designation){
        List<City> cities = state.getCities();
        for (City city : cities){
            if (city.getDesignation().equals(designation)){
                return city;
            }
        }
        return null;
    }
}
