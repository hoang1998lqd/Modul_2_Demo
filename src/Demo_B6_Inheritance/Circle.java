package Demo_B5_Inheritance;

public class Circle {
    double radius;
    String color;
    double area;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area = Math.PI * Math.pow(this.radius, 2);
    }

    public static class Cylinder extends Circle {
        public double volume;
        public double height;

        public Cylinder(double radius, String color, double height) {
            super(radius, color);
            this.height = height;
        }

        public double getVolume() {
            return volume = super.getArea() * this.height;
        }

        public double getHeight() {
            return height;
        }
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(4.5, "Red", 10);
        System.out.println("Thể tích là: " + cylinder.getVolume());
        System.out.println(cylinder.getArea());
    }
}
