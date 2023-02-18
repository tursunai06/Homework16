public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(6, 10);
        System.out.println(triangle);
        triangle.findArea();
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println(rectangle);
        rectangle.findArea();
        Circle circle = new Circle(3.14,50.5);
        System.out.println(circle);
        circle.findArea();
        Square square = new Square(8, 9);
        System.out.println(square);
        square.findArea();

        }}

