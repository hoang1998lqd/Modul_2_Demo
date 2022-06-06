package Demo_B4_Class_OOP;

import java.util.Scanner;

public class PT_Bac_2 {
    double a, b, c, delta, x1,x2;

    public PT_Bac_2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDelta() {
        return delta = (Math.pow(this.b,2) - 4 * this.a * this.c);
    }
    public double getX1(){
        return x1 = (((-this.b)+Math.pow(delta,0.5)))/(2 * this.a);
    }
    public double getX2(){
        return x2 =  (((-this.b)-Math.pow(delta,0.5)))/(2 * this.a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        PT_Bac_2 bac_2 = new PT_Bac_2(a,b,c);
       if (a == 0 && b ==0 && c == 0 ){
           System.out.println("Phương trình vô số nghiệm");
       } else if (a == 0 && b == 0 && c !=0) {
           System.out.println("Phương trình vô nghiệm ");
       } else if (a==0 && b != 0 && c != 0 ) {
           double x = (-b) / c;
           System.out.println("Phương trình có nghiệm duy nhất là: " + x);
       }else {
           if (bac_2.getDelta() < 0){
               System.out.println("Phương trình vô nghiệm ");
           } else if (bac_2.getDelta() == 0) {
               double x = (-b) / (2 * a);
               System.out.println("Phương trình có nghiệm duy nhất x = " + x);
           }else {
               System.out.println("Phương trình có 2 nghiệm riêng biệt x1= " + bac_2.getX1() + " x2 = " + bac_2.getX2());
           }

       }
    }
}
