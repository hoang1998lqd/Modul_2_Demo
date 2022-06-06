package Demo_B3_Array;

import java.util.Scanner;

public class Search_Value {
    public static void main(String[] args) {
        String[] Students = {"A","B","C","D","E","F","G"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên SV cần tìm");
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < Students.length; i++) {
            if (Students[i].equals(name)){
                System.out.println("Vị trí của " + name + " là ở " + i);
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Không tìm thấy vị trí tên " + name + " ở trong Students ") ;
        }
    }
}
