package Demo_B3_Array;

public class Delete_Value {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int del = 7;
        int count = arr.length;
        int index;
        for (int i = 0; i < count; i++) {
            if (del == arr[i]){
                index = i;
//                System.out.println(index);
                for (int j = index; j <(arr.length-1) ; j++) {
                    arr[j] = arr[j + 1];
                }
                count --;
                System.out.println("Mảng mới là " );
                for (int j = 0; j < count; j++) {
                    System.out.println(arr[j]);
                    
                }
            }
        }

    }
}
