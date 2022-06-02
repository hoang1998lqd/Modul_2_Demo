package Demo_B2;

import java.util.Scanner;

public class Check_SNT {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        number = scan.nextInt();
        if (number < 2){
            System.out.println("Đây không phải là số nguyên tố ");
        }else {
            boolean check = true;
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println("Đây là số nguyên tố");
            }else {
                System.out.println("Đây không phải là số nguyên tố ");
            }
        }
    }
}
