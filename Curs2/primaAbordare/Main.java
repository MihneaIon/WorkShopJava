package primaAbordare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Jeep myJeep1=new Jeep(8,220,"Range Rover",5);
        Fregate myFregate1=new Fregate(200,120,"Royal Queen","Mediteranen Sea");
        LandVehicle myLandVehicle1=new LandVehicle(5,200,"Golf 4",4);
        SeaVassel mySeaVassel1=new SeaVassel(200,120,"Titanic "," Pacific Ocean ");
        Vehicle myVehicle1=new Vehicle(5,260,"MotoBike ");
        Jeep myJeep2=new Jeep(8,220,"BMW",5);
        Fregate myFregate2=new Fregate(200,120,"Desperados","Mediteranen Sea");
        LandVehicle myLandVehicle2=new LandVehicle(5,200,"Golf 5",4);
        SeaVassel mySeaVassel2=new SeaVassel(200,120,"Ozana "," Pacific Ocean ");
        Vehicle myVehicle2=new Vehicle(5,260,"Alfa Romeo ");

        if(myFregate1 instanceof Fregate)
        {
            myFregate1.fireGun();
        }

        if(myFregate2 instanceof Fregate)
        {
            myFregate2.fireGun();
        }

        if(myJeep1 instanceof LandVehicle)
        {
            myJeep1.drive();
        }

        if(myJeep2 instanceof LandVehicle)
        {
            myJeep2.drive();
        }

        if(myLandVehicle1 instanceof LandVehicle)
        {
            myLandVehicle1.drive();
        }

        if(myLandVehicle2 instanceof LandVehicle)
        {
            myLandVehicle2.drive();
        }

        if(mySeaVassel1 instanceof Fregate)
        {
            ((Fregate) mySeaVassel1).fireGun();
        }

        if(mySeaVassel2 instanceof Fregate)
        {
            ((Fregate) mySeaVassel2).fireGun();
        }

        if(myVehicle1 instanceof Fregate)
        {
            ((Fregate) myVehicle1).fireGun();
        }

        if(myVehicle2 instanceof Fregate)
        {
            ((Fregate) myVehicle2).fireGun();
        }

       if(myVehicle1 instanceof LandVehicle)
       {
           ((LandVehicle) myVehicle1).drive();
       }

       if(myVehicle2 instanceof LandVehicle)
       {
           ((LandVehicle) myVehicle2).drive();
       }

       /*
       *
       pentru celelealte posibilitati gen sa verifica daca pentru
        Fregate2 se poate aplica metoda drive() ,nu se poate ca in
        exemplele de mai sus, Inconvertiblr type; cann't cast Fregate to LandVehicle
        in plus if-ul va fi mereu fals

        if((LandVehicle)myFregate2 instanceof LandVehicle)
        {
            myFregate2.drive();
        }

        in codul de deasupra

       *
        */

        List<Vehicle> myVehicleList=new ArrayList<>();

        myVehicleList.add(myVehicle1);
        myVehicleList.add(myVehicle2);
        myVehicleList.add(myLandVehicle1);
        myVehicleList.add(myLandVehicle2);
        myVehicleList.add(mySeaVassel1);
        myVehicleList.add(mySeaVassel2);
        myVehicleList.add(myJeep1);
        myVehicleList.add(myJeep2);
        myVehicleList.add(myFregate1);
        myVehicleList.add(myFregate2);
        System.out.println();

        Collections.sort(myVehicleList, new ListaSortata());

        for(Vehicle auxVehicle: myVehicleList)
        {
            System.out.println(auxVehicle.getName());
        }


    }
}
