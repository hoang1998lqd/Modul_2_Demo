package Demo_B2;


import java.util.Scanner;

public class display_SNT {
    public static void main(String[] args) {
        int count ;
        int n = 2;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Nhập giá trị: ");
        count = scanner.nextInt();
        for (int i = 1; i < count ; i++) {
            boolean check = true;
            for (int j = 2; j <=Math.sqrt(n); j++) {
                if (n % j == 0){
                    check = false;
                    break;
                }
            }if (check){
                System.out.println("Số nguyên tố " + n);
            }
            n++;
            
        }


    }
}
