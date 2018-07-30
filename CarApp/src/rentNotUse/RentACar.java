package rentNotUse;

import models.Person;
import models.Vehicle;
import read.ReadFromFile;

import java.util.*;

public class RentACar  {

    private static final Scanner SCANNER = new Scanner(System.in);
    List<Vehicle> myVehicleList;

    {
        try {
            myVehicleList = ReadFromFile.readVehicles();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    List<Vehicle> myBorrowVehicle=new ArrayList<>();

    public void iWantToRent() {
        try {

            Map<Person,Vehicle> orders=new HashMap<>();
            orders.put(loggIn(),chousenVehicle(myVehicleList));



        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public Person loggIn()
    {

        String CNP=""; // sau int ??
        String firstName="",lastName="";
        char gender='A';
        Date dateOfBirth;
        Date yearOfDrivingLicense;
        System.out.println(" Please insert your first-name: ");
        firstName=SCANNER.nextLine();
        System.out.println(" Please insert your second-name: ");
        lastName=SCANNER.nextLine();
        System.out.println(" Please insert your CNP: ");
        CNP=SCANNER.nextLine();
        System.out.println(" Please insert your gender: ");
        gender=SCANNER.next().charAt(0);
       // System.out.println(" Please insert your DAte of birth: ");
        // TO DO : vezi cum parsezi si citesti datele de tip String si le face Date
        //Person myPerson=new Person(CNP,firstName,lastName,gender);

        return  new Person();
    }

    public Vehicle chousenVehicle(List<Vehicle> myList) {
        Vehicle borrowedCar=new Vehicle();
        for (Vehicle auxVehicle : myList) {
            System.out.println(auxVehicle);
        }
        String carName = "";
        System.out.println(" What car you want to borrow? ");
        try {
            carName = SCANNER.nextLine();
            if(checkIfCarExist(myList,carName)!=null)
            {
                borrowedCar=checkIfCarExist(myList,carName);
                System.out.println(borrowedCar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return borrowedCar;
    }

    public static Vehicle checkIfCarExist(List<Vehicle> myList,String name)
        {
            for (Vehicle auxVehicle : myList) {
               if(auxVehicle.getBrand().equals(name))
                   return auxVehicle;
            }
            return null;
        }


}
