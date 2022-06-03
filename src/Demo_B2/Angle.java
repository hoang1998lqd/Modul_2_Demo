package Demo_B2;

import java.util.Scanner;

public class Angle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int height;
        System.out.println("\n\nNhập vào chiều cao của tam giác: ");
        height = sc.nextInt();
        for (int i = height; i>=1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n----------------------------------");
        for (int i = 1; i <= height ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
