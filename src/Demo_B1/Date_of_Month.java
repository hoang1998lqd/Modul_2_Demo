package Demo_B1;

import javafx.scene.effect.MotionBlur;

import java.util.Scanner;

public class Date_of_Month {
    public static void main(String[] args) {
        int Month;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập tháng cần kiểm tra vào đây: ");
         Month = scan.nextInt();
         switch (Month){
             case 1:
             case 3:
             case 5:
             case 7:
             case 8:
             case 10:
             case 12:
                 System.out.println("Tháng " + Month + " có 31 ngày");
                 break;
             case 2:
                 System.out.println("Tháng " + Month + " có 28 hoặc 29 ngày");
                 break;
             case 4:
             case 6:
             case 9:
             case 11:
                 System.out.println("Tháng " + Month + " có 30 ngày");
                 break;
         }
    }
}
