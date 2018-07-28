package interfaces;

import agreement.Agreement;
import models.Person;
import models.Vehicle;

import java.util.List;

public interface VehicleRented {


   Agreement rentVehicle(List<Vehicle> myBorrowVhiclesList, List<Person> myPersonList);
   List<Agreement> historyOfRent(List<Vehicle> myBorrowVhiclesList, List<Person> myPersonList);
   List<Vehicle> rentedVehicles(Person myPerson);





}
