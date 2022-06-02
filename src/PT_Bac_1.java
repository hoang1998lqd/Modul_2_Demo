import java.util.Scanner;

public class PT_Bac_1 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double x;
        Scanner scan = new Scanner(System.in); // Khai báo từ bàn phím.
        System.out.println("Nhập a vào đây : ");
        a = scan.nextDouble();
        System.out.println("Nhập b vào đây : ");
        b = scan.nextDouble();
        System.out.println("Nhập c vào đây : ");
        c = scan.nextDouble();
        if (a == 0){
            System.out.println("Phương trình vô nghiệm");
        }else if ( c - b == 0){
            System.out.println("Phương trình vố số nghiệm");
        }else {
            x = (c-b)/a;
            System.out.println("Nghiệm của phương trình là : " + x);
        }

    }

}
