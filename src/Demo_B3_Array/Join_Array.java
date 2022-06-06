package Demo_B3_Array;

import java.util.Arrays;

public class Join_Array {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {10,20,30,40,50,60,70,80,80,100};
        int length = arr1.length + arr2.length;
//        System.out.println(length);
        int [] arr = new int[length];
        int n = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr[n] = arr1[i];
            n ++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[n] = arr2[i];
            n++;
        }

        System.out.println(Arrays.toString(arr));


    }
}
