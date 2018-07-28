package primaAbordare;

public class SeaVassel extends Vehicle {

    protected String displacement;

    public void launch()
    {
        System.out.println(" I displacement from Black Sea ");
    }

    public SeaVassel(int maxPassengers, int maxSpeed, String name, String displacement) {
        super(maxPassengers, maxSpeed, name);
        this.displacement = displacement;
    }
}
