package primaAbordare;

public class Vehicle {

    protected int maxPassengers,maxSpeed;
    protected String name;

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle(int maxPassengers, int maxSpeed, String name) {
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maxPassengers=" + maxPassengers +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                '}';
    }
}
