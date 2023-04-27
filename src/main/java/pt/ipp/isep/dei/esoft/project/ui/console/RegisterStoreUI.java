package pt.ipp.isep.dei.esoft.project.ui.console;

import pt.ipp.isep.dei.esoft.project.application.controller.RegisterStoreController;


import java.util.*;

public class RegisterStoreUI {
    private RegisterStoreController registerStoreController;

    public RegisterStoreUI(RegisterStoreController registerStoreController){
        this.registerStoreController = registerStoreController;
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        System.out.println("Register Store [1]");
        System.out.println("Exit [2]");
        option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.println("Where is the store located?");
                System.out.println("Please select the state:");
                registerStoreController.listStates();
                String state = scanner.next();

                System.out.println("Please select the district:");
                registerStoreController.listDistricts(registerStoreController.getStateByDesignation(state));
                String district = scanner.next();

                System.out.println("Please select the city:");
                registerStoreController.listCities(registerStoreController.getCityByDesignation(registerStoreController.getStateByDesignation(state),district));
                String city = scanner.next();

                System.out.println("Please enter the street address:");
                String streetAddress = scanner.next();

                System.out.println("Please enter the zip code:");
                String zipCode = scanner.next();

                System.out.println("Please enter the store id:");
                String id = scanner.next();

                System.out.println("Please enter the store designation:");
                String designation = scanner.next();

                System.out.println("Please enter the store email address:");
                String emailAddress = scanner.next();

                System.out.println("Please enter the store phone number:");
                String phoneNumber = scanner.next();

                /*Do try and catchs to check the acceptance criteria for the parameter*/

                registerStoreController.registerStore(registerStoreController.createStore(id, designation,  registerStoreController.createStoreLocation(streetAddress, city, district, state, zipCode),  emailAddress, phoneNumber));


                /* Check if registers auto in the store or new object, check and then controller.regist(store)*/

                break;
            case 2:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

    }
}

