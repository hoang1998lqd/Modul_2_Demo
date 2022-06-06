package Demo_B4_Class_OOP;

import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getAee() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return (this.height * this.width);
    }

    public double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chiều rộng là: ");
        double width = scanner.nextDouble();
        System.out.println("Chiều dài là: ");
        double height = scanner.nextDouble();
        // Gọi class đã được tạo: "Rectangle" là tên class; "rectangle" là biến tự đăt.
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hiển thị thông tin hình chữ nhật: " + rectangle.display());
        System.out.println("Diện tích hình chữ nhật là: " + rectangle.getArea() );
        System.out.println("Chu vi hình chữ nhật là: " + rectangle.getPerimeter() );

    }
}