package figura;

public class Cerc extends Figura implements Comparable<Cerc> {

    private Double radius;

    @Override
    public int compareTo(Cerc o) {
        if(this.radius.equals( o.radius))
            return 0;
        else if(this.radius<o.radius)
            return -1;
        return 1;
    }

    public Cerc()
    {

    }

    public Cerc(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double aria() {
        return Math.PI* Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Cerc{" +
                "radius=" + radius +
                '}';
    }
}
