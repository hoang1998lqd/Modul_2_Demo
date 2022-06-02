package Demo_B1;

import java.util.Scanner;

public class Translate_NumberToWords {
    public static void main(String[] args) {
        int weight;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập cân nặng vào đây: ");
       weight = scan.nextInt();
       int dv = weight % 10;
       weight /= 10;
//        System.out.println(weight/=10);
       int  chuc = weight % 10;
       int  tram = weight/10;
            switch (tram){
                case 0:
                    System.out.print(" ");
                    break;
                case 1:
                    System.out.print("Một trăm ");
                    break;
                case 2:
                    System.out.print("Hai trăm ");
                    break;
                case 3:
                    System.out.print("Ba trăm ");
                    break;
                case 4:
                    System.out.print("Bốn trăm ");
                    break;
                case 5:
                    System.out.print("Năm trăm ");
                    break;
                case 6:
                    System.out.print("Sáu trăm ");
                    break;
                case 7:
                    System.out.print("Bảy trăm ");
                    break;
                case 8:
                    System.out.print("Tám trăm ");
                    break;
                case 9:
                    System.out.print("Chín trăm ");
                    break;
            }
            switch (chuc){
                case 0:
                    if (tram == 0){
                        System.out.print(" ");
                        break;
                    }else {
                        System.out.println(" linh");
                    }

                case 1:
                    System.out.print(" mười ");
                    break;
                case 2:
                    System.out.print(" hai mươi ");
                    break;
                case 3:
                    System.out.print(" ba mươi ");
                    break;
                case 4:
                    System.out.print(" bốn mươi ");
                    break;
                case 5:
                    System.out.print(" năm mươi ");
                    break;
                case 6:
                    System.out.print(" sáu mươi ");
                    break;
                case 7:
                    System.out.print(" bảy mươi ");
                    break;
                case 8:
                    System.out.print(" tám mươi ");
                    break;
                case 9:
                    System.out.print(" chín mươi ");
                    break;
            }
            switch (dv){
                case 0:
                    System.out.print(" ");
                    break;
                case 1:
                    System.out.print(" một ");
                    break;
                case 2:
                    System.out.print(" hai");
                    break;
                case 3:
                    System.out.print(" ba ");
                    break;
                case 4:
                    System.out.print(" bốn ");
                    break;
                case 5:
                    System.out.print(" năm");
                    break;
                case 6:
                    System.out.print(" sáu ");
                    break;
                case 7:
                    System.out.print(" bảy ");
                    break;
                case 8:
                    System.out.print(" tám ");
                    break;
                case 9:
                    System.out.print(" chín ");
                    break;
            }
        }



}
