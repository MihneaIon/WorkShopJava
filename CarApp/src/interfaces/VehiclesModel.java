package interfaces;

import models.Type;
import models.Vehicle;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public interface VehiclesModel extends Comparator<Vehicle> {

    public List<Vehicle> sortedVehiclesBy(String name);
    public List<Vehicle> sortedVehiclesType(Type myType);
    public List<Vehicle> viewAllVehicles();
}
