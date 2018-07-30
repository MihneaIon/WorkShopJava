import read.ReadFromFile;
import viewVehicles.ViewVehiclesBy;
import models.Type;

public class Main {

    public static void main(String[] args) {
        ViewVehiclesBy myVehicle=new ViewVehiclesBy();
 //       myVehicle.sortedVehiclesType();
 //       myVehicle.sortedVehiclesBy("manufacturing year");
 //       myVehicle.sortedVehiclesByBrand();

//        myVehicle.viewAllVehicles();

        try {
            ReadFromFile.readPerson();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }


}
