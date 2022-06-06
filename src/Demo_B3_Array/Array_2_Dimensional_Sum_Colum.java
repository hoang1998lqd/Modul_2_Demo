package Demo_B3_Array;

import java.util.Scanner;

public class Array_2_Dimensional_Sum_Colum {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng vào đây: ");
        n = scanner.nextInt();
        System.out.println("Nhập số cột vào đây: ");
        m = scanner.nextInt();
        // Nhập giá trị vào mảng.
        int [][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        // Duyệt mảng 2 chiều.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }
        int sum = 0;
        int col;
        System.out.println("Nhập cột cần tính tổng: ");
        col = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            sum += arr[i][col];
        }
        System.out.println("Tổng của cột " + col + " là " + sum);

    }
}
