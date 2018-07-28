public  class Exemple2 {
    public static void main(String[] args) {

        Squer s=new Squer();
        System.out.println(s.getArea(3));
        System.out.println(" "+ s.getPerimeter(6));
        System.out.println(" "+ s.getColor());

    }


}


 abstract class Shape
{
    protected abstract double getArea(double length);
    protected abstract double getPerimeter(double length);

}

class Squer extends Shape

{
    public double getArea(double side)
    {
        return side*side;
    }

    public double getPerimeter(double side)
    {
        return side*side;
    }

    public String getColor()
    {
        return  "blue";
    }


}

