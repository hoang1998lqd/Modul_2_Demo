package Demo_B3_Array;

import java.util.Scanner;

public class add_value {
    public static void main(String[] args) {
        int [] arr = new int[10];
        int n ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        n = scanner.nextInt();
        // Thêm giá trị của từng phần tử vào mảng.
        int i = 0;
        while ( i < n){
            System.out.println("Nhập phần tử " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        // Duyệt mảng.
        System.out.print( arr + "\t");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + "\t");
        }
        // Thêm phần tử vào cuối mảng.
//        int m = 1000;
//        arr[n] = m;
//        System.out.printf("%-20s%s", "Elements in array: ", "");
//        for (int j = 0; j < arr.length; j++) {
//            System.out.println(arr[j] + "\t");
//        }
//         // Thêm vào đầu mảng.
//        int number = 999;
//        for (int j = (n-1); j > 0; j--) {
//            arr[j] = arr[j-1];
//        }
//        arr[0] = number;
//        System.out.printf("%-20s%s", "Elements in array: ", "");
//        for (int j = 0; j < arr.length; j++) {
//            System.out.println(arr[j] + "\t");
//        }
        // Thêm phần tử vào vị trí K của mảng.
        int position = 3;
        int value = 55555;
        n++;
        for (int j = (n-1); j > position; j--) {
            arr[j] = arr[j-1];
        }
        arr[position] = value;
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }


    }

}
