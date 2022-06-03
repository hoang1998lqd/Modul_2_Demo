package Demo_B2;

import java.util.Scanner;

public class Check_SNT {
    static boolean isNumberPrime(int n){
        if (n <2 ){
            return false;
        }else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    static void display(){
        int num;
        int i = 2;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        while (count <= num){
            if (isNumberPrime(i)){
                System.out.print(" " + i);
                count ++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
            display();
    }

    }





