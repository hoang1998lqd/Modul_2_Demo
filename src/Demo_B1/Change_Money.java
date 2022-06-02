package Demo_B1;

import java.util.Scanner;

public class Change_Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao tien USD");
        float USD = scanner.nextFloat();
        float VND = USD * 23000;
        System.out.println("VND = " + VND);
    }
}