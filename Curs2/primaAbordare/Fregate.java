package primaAbordare;

public class Fregate extends SeaVassel{

    public Fregate(int maxPassengers, int maxSpeed, String name, String displacement) {
        super(maxPassengers, maxSpeed, name, displacement);
    }

    public void fireGun()
    {
        System.out.println(" 10 quick fire canons");
    }

    @Override
    public void launch() {
        super.launch();
    }
}
