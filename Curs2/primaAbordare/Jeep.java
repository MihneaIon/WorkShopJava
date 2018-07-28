package primaAbordare;

public class Jeep extends LandVehicle{

    public Jeep(int maxPassengers, int maxSpeed, String name, int numWheels) {
        super(maxPassengers, maxSpeed, name, numWheels);
    }

    public void soundHorn()
    {
        System.out.println(" Nino nino, Danonino ");
    }

    @Override
    public void drive() {
        super.drive();
    }
}
