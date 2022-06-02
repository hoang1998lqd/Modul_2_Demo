package Demo_B1;

import java.util.Scanner;

public class Name_Hello {
    public static void main(String[] args) {
        String name ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập tên của bạn vào đây: ");
        name = scan.nextLine(); // Nhập chuỗi dữ liệu và Scan cả chuỗi đó khi nhấn Enter.
        System.out.println("Xin chào bạn : " + name);

    }
}
