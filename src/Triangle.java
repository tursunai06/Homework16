public class Triangle extends Shapes{
    private double height;
    private double width;

    public Triangle(double height, double weight) {
        this.height = height;
        this.width = weight;
    }

    @Override
    public void findArea() {
        System.out.println("Area  triangle's  is: " + (height*width)/2);

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double weight) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height: " + height +
                "width: " + width +
                '}';
    }
}


