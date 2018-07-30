package viewVehicles;

import interfaces.VehiclesModel;
import models.Vehicle;
import read.ReadFromFile;

import java.util.*;

import java.util.stream.Collectors;

public class ViewVehiclesBy implements VehiclesModel {

    List<Vehicle> myVehicles;

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return 0;
    }

    @Override
    public List<Vehicle> sortedVehiclesType() {

        List<Vehicle> printVehicles = new ArrayList<>();

        try {
            myVehicles = ReadFromFile.readVehicles();
            printVehicles = myVehicles.stream().sorted((v1,v2)->v1.getType().name().compareTo(v2.getType().name()))
                    .collect(Collectors.toList());//.filter(p -> p.getType().equals(myType)).collect(Collectors.toList());
            System.out.println(printVehicles);

/*              Metoda Veche

                for (Iterator<Vehicle> iterator = myVehicles.iterator(); iterator.hasNext(); ) {
                Vehicle value = iterator.next();
                if (value.getType().equals(myType)) {
                    printVehicles.add(value);
                    iterator.remove();
                }
            }
            printVehicles.addAll(myVehicles);
            System.out.println(printVehicles);
            */

        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        return printVehicles;
    }


    @Override
    public List<Vehicle> sortedVehiclesBy(String choose) {
        List<Vehicle> listOfPropertiesWanted = new ArrayList<>();
        try {

            listOfPropertiesWanted = ReadFromFile.readVehicles();

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (choose.toLowerCase().equals("brand")) {

            Collections.sort(listOfPropertiesWanted, (Vehicle v1, Vehicle v2) -> v1.getBrand().compareTo(v2.getBrand()));
            System.out.println(listOfPropertiesWanted);

        } else if (choose.toLowerCase().equals("manufacturing year")) {

            Collections.sort(listOfPropertiesWanted, (Vehicle v1, Vehicle v2) -> v1.getManufacturingYear() - v2.getManufacturingYear());
            System.out.println(listOfPropertiesWanted);
        }

        return listOfPropertiesWanted;
    }

    @Override
    public List<Vehicle> viewAllVehicles() {
        List<Vehicle> allVehicles = new ArrayList<>();
        try {

            myVehicles = ReadFromFile.readVehicles();
            allVehicles = myVehicles.stream().collect(Collectors.toList()); // or
            //allVehicles = myVehicles.stream().collect(Collectors.toCollection(() -> new ArrayList<Vehicles>()));
            System.out.println(allVehicles);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return allVehicles;
    }

    public void display() {
    }

    @Override
    public List<Vehicle> sortedVehiclesByBrand() {
        List<Vehicle> listOfPropertiesWanted = new ArrayList<>();
        try {

            listOfPropertiesWanted = ReadFromFile.readVehicles();

        } catch (Exception e) {
            e.printStackTrace();
        }
        Collections.sort(listOfPropertiesWanted, (Vehicle v1, Vehicle v2) -> v1.getBrand().compareTo(v2.getBrand()));
        System.out.println(listOfPropertiesWanted);

        return listOfPropertiesWanted;

    }
    
}


