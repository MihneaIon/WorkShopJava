import viewVehicles.ViewVehiclesBy;
import models.Type;

public class Main {

    public static void main(String[] args) {
        ViewVehiclesBy myVehicle=new ViewVehiclesBy();
        myVehicle.sortedVehiclesType(Type.SCOOTER);
        myVehicle.sortedVehiclesBy("manufacturing year");

        myVehicle.viewAllVehicles();

    }


}
