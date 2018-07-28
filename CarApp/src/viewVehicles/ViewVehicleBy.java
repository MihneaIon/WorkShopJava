package viewVehicles;

import interfaces.VehiclesModel;
import models.Type;
import models.Vehicle;
import read.ReadFromFile;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

import java.util.stream.Collectors;

public class ViewVehiclesBy implements VehiclesModel {

    List<Vehicle> myVehicles;
    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return 0;
    }

    @Override
    public List<Vehicle> sortedVehiclesType(Type myType) {

        List<Vehicle> printVehicles = new ArrayList<>();

        /*
        *
        In metoda aceasta nu am reusit sa afisez folosind lambda
         expresion toata lista sortata dupa un anumit tip ci doar
          elementele de acel tip din lista
        *
         */

        try {
            myVehicles = ReadFromFile.read();
            printVehicles = myVehicles.stream().filter(p -> p.getType().equals(myType)).collect(Collectors.toList());
            System.out.println(printVehicles);
            System.out.println(myVehicles);


/*            for (Iterator<Vehicle> iterator = myVehicles.iterator(); iterator.hasNext(); ) {
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

            listOfPropertiesWanted = ReadFromFile.read();

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

            myVehicles = ReadFromFile.read();
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

//    class CompareAboutBrand implements Comparator<Vehicle>
//    {
//        @Override
//        public int compare(Vehicle o1, Vehicle o2) {
//            if (o1.getBrand().equals(o2.getBrand()))
//                return 0;
//            else if (o1.getBrand().hashCode() > o2.getBrand().hashCode())
//                return 1;
//
//            return -1;
//        }
//    }
//
//    class CompareAboutYear implements Comparator<Vehicle>
//    {
//        @Override
//        public int compare(Vehicle o1, Vehicle o2) {
//            if(o1.getManufacturingYear()==o2.getManufacturingYear())
//                return 0;
//            else if(o1.getManufacturingYear()< o2.getManufacturingYear())
//                return -1;
//            return 1;
//        }
//    }


}


