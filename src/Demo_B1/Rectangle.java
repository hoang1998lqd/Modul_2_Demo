package Demo_B1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width ;
        float height ;
        float area;
        float perimeter;
        Scanner sc = new Scanner(System.in); // Nhập dữ liệu từ bàn phím.
        System.out.println("Nhập Width là : ");
        width = sc.nextFloat(); // Nhập chiều rộng
        System.out.println("Nhập Height là : ");
        height = sc.nextFloat(); // Nhập chiều dài.
        area = width * height;
        perimeter = (width + height) * 2;
        System.out.println(" Area là : " + area);
        System.out.println(" Perimeter là : " + perimeter);
    }
}
