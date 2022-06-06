package Demo_B3_Array;

import java.util.Scanner;

public class Max_Min_2_Dimensional_Array {
    public static void main(String[] args) {
        int n , m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng vào đây: ");
        n = scanner.nextInt();
        System.out.println("Nhập số cột vào đây: ");
        m = scanner.nextInt();
        int [] [] array = new int[n][m];
        // Nhập giá trị vào mảng 2 chiều.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        // Duyệt mảng 2 chiều.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }
        // Tìm Max.
        int max = array[0][0];
        int min = array[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < array[i][j]){
                    max = array[i][j];
                }
                if (min > array[i][j]){
                    min = array[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là " + max);
        System.out.println("Giá trị nhỏ nhất trong mảng là " + min);

    }
}
