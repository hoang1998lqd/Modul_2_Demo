package Practice_1_Hotel;

import java.util.Scanner;

public class Receptionist {
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   Method_Hotel hotel = new Method_Hotel();
   int choice;
   do {
      System.out.println("***********************************************");
      System.out.println("Quản lý khác sạn");
      System.out.println("1. Hiển thị danh sách phòng trọ.");
      System.out.println("2. Kiểm tra phòng còn trống.");
      System.out.println("3. Thuê phòng.");
      System.out.println("4. Kiểm tra thông tin khách thuê theo phòng.");
      System.out.println("5. Hiển thị thông tin khách hàng đang thuê phòng.");
      System.out.println("6. Trả phòng.");
      System.out.println("0. Exit.");
      System.out.println("***********************************************");
      choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice){
         case 1:
            hotel.displayRoom();
            break;
         case 2:
            hotel.infoRoom();
            break;
         case 3:
            hotel.addUser(scanner);
            hotel.choiceRoom(scanner);
            break;
         case 4:
            hotel.nameOfRoom(scanner);
            break;
         case 5:
            hotel.displayUsers();
            break;
         case 6:
            hotel.bill(scanner);
            break;
      }
   }while (choice != 0);
}
}
