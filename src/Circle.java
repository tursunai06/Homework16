public class Circle extends Shapes{
    private  double PI = 3.14;
    private double rad;

    public Circle(double PI, double rad) {
        this.PI = PI;
        this.rad=rad;
    }


    @Override
    public void findArea() {
        double area= Math.PI*rad*rad;
        System.out.println("Circle's  area is: " + area );;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getRadius() {
        return rad;
    }

    public void setRadius(double rad) {
        this.rad= rad;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI:" + PI +
                "radius: " + rad +

                '}';
    }
}


