package pt.ipp.isep.dei.esoft.project.repository;

import pt.ipp.isep.dei.esoft.project.domain.Store;

import javax.xml.stream.Location;
import java.util.*;

public class StoreRepository {
    private List<Store> stores;

    public StoreRepository(){
        this.stores = new ArrayList<>();
    }

    public List<Store> getStores(){
        return stores;
    }

    public Store createStore(String id, String designation, String emailAddress, String phoneNumber){
        return new Store(id, designation, emailAddress, phoneNumber);
    }

    public Store createStore(String id, String designation, Location location, String emailAddress, String phoneNumber){
        return new Store(id, designation, location, emailAddress, phoneNumber);
    }

    public boolean registerStore(Store store){
        return stores.add(store);
    }

    public boolean registerLocationAtStore(Store store, Location location){
        store.setLocation(location);
        return true;
    }

    public boolean createStoreLocation(String id, String designation, String address, String zipCode, String city, String country){
        return storeRepository.createStoreLocation(streetAddress, city, district, state, zipCode);
    }

}
