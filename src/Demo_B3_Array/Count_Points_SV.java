package Demo_B3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Count_Points_SV {
    public static void main(String[] args) {
        int [] arr = new int[30];
        Scanner scanner = new Scanner(System.in);
        // Nhập điểm cho Sinh viên.
        for (int i = 0; i < arr.length; i++) {
                System.out.println("Nhập điểm cho sinh viên số " + (i + 1) + " :");
                arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int count = 0;
        int [] pass = new  int[30];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5){
                pass[count] = arr[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(pass) + count);
    }
}
