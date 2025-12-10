package rvt;

public class Chapter50 {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }

    public static void ex1() {
        Box b = new Box(2.5, 5.0, 6.0);
        System.out.println("Area: " + b.area() + " volume: " + b.volume());
    }

    public static void ex2() {
        Box b = new Box(3, 4, 5);
        System.out.println("Area: " + b.area());
    }

    public static void ex3() {
        Box b = new Box(2, 3, 4);
        Box c = new Box(b);
        System.out.println(c.length() + " " + c.height() + " " + c.width());
    }

    public static void ex4() {
        Box b = new Box(2, 3, 4);
        Box big = b.biggerBox();
        Box small = b.smallerBox();
        System.out.println(big.volume());
        System.out.println(small.volume());
    }

    public static void ex5() {
        Box a = new Box(2, 3, 4);
        Box b = new Box(3, 4, 5);
        System.out.println(a.nests(b));
        System.out.println(b.nests(a));
    }
}

final class Box {
    private final double width;
    private final double height;
    private final double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public Box(Box old) {
        this.width = old.width;
        this.height = old.height;
        this.length = old.length;
    }

    public double volume() {
        return width * height * length;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    private double faceArea() {
        return width * height;
    }

    private double topArea() {
        return width * length;
    }

    private double sideArea() {
        return height * length;
    }

    public double width() {
        return width;
    }

    public double height() {
        return height;
    }

    public double length() {
        return length;
    }

    public Box biggerBox() {
        return new Box(width * 1.25, height * 1.25, length * 1.25);
    }

    public Box smallerBox() {
        return new Box(width * 0.75, height * 0.75, length * 0.75);
    }

    public boolean nests(Box outside) {
        return width < outside.width
                && height < outside.height
                && length < outside.length;
    }
}

