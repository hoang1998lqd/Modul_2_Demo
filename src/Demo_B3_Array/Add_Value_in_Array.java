package Demo_B3_Array;
import java.util.Scanner;
public class Add_Value_in_Array {
    public static void main(String[] args) {
        int [] arr = new int[10];
       int index = 4;
       int value = 1000;
       int n = 8;
        for (int i = 0; i < n; i++) {
            arr[i] = i +1;

        }
        System.out.println("Mảng ban đầu: ");
        for (int element : arr){
            System.out.println("\n" + element);
        }
        System.out.println();
        for (int i = n; i >index ; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        System.out.println("Mảng sau khi thay đổi");
        for (int element : arr){
            System.out.println(" " + element);
        }

    }
}
