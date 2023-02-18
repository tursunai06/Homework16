public class Square extends Shapes{
    private double width;
    private double length;

    public Square(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Square() {
        System.out.println("Square's  area is: " + width*length);;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width: " + width +
                ", length: " + length +
                '}';
    }
}


