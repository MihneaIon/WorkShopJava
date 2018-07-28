package primaAbordare;

public class LandVehicle extends Vehicle{

    protected int numWheels;

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public String toString() {
        return "LandVehicle{" +
                "numWheels=" + numWheels +
                '}';
    }

    public LandVehicle(int maxPassengers, int maxSpeed, String name, int numWheels) {
        super(maxPassengers, maxSpeed, name);
        this.numWheels = numWheels;
    }

    public void drive()
    {
        System.out.println( " I drive an ground car ");
    }
}
