package Demo_B1;

import java.util.Scanner;

public class Check_Nam_Nhuan {
    public static void main(String[] args) {
        int year;
        Scanner check = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra");
        year = check.nextInt();
       if (year % 4 == 0){
           if (year % 100 == 0){
               if (year % 400 == 0){
                   System.out.println("Năm " + year + " là năm nhuận");
               }else {
                   System.out.println("Năm " + year + " không phải là năm nhuận");
               }
           }else {
               System.out.println("Năm " + year + " là năm nhuận");
           }
       }else {
           System.out.println("Năm " + year + " không phải là năm nhuận");
       }
    }
}
