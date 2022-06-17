package Practice_1_Hotel;

import java.util.HashMap;
import java.util.Scanner;

public class Receptionist {
public static void main(String[] args) {
    // Tạo mặc định danh sách phòng


    // Tạo ArrayList cho phòng của khách sạn.

//
//    Room r1 = new Room("Phòng 201","VIP",500000,"On");
//    Room r2 = new Room("Phòng 202","VIP",500000,"On");
//    Room r3 = new Room("Phòng 203","NORMAL",300000,"On");
//    Room r4 = new Room("Phòng 204","VIP",500000,"Off");
//    Room r5 = new Room("Phòng 205","NORMAL",300000,"On");
//    Room r6 = new Room("Phòng 301","VIP",500000,"On");
//    Room r7 = new Room("Phòng 302","NORMAL",300000,"Off");
//    Room r8 = new Room("Phòng 303","VIP",500000,"On");
//    Room r9 = new Room("Phòng 304","NORMAL",300000,"On");
//    Room r10 = new Room("Phòng 305","VIP",500000,"On");
//
//    ArrayList<Room> listRooms = new ArrayList<>();
//    listRooms.add(r1);
//    listRooms.add(r2);
//    listRooms.add(r3);
//    listRooms.add(r4);
//    listRooms.add(r5);
//    listRooms.add(r6);
//    listRooms.add(r7);
//    listRooms.add(r8);
//    listRooms.add(r9);
//    listRooms.add(r10);


//    Users An = new Users("An", "28/6/1996",123456789);
//    Users Bình = new Users("Bình", "12/8/1987",456123789);
//    Users Minh = new Users("Minh", "1/2/1992",456789123);
//
//    ArrayList<Users> listUser = new ArrayList<>();
//    listUser.add(An);
//    listUser.add(Bình);
//    listUser.add(Minh);
//
//    Order orderOfAn = new Order();
//    orderOfAn.setCheckin(LocalDate.of(2020,3,28));
//    orderOfAn.setCheckout(LocalDate.of(2020,3,30));
//    orderOfAn.setRoom(r1);
//    orderOfAn.setUsers(An);
//    System.out.println(orderOfAn.getTotalPrice());
//    System.out.println("---------------------------");
//
//    TreeMap<String,Users> hotel = new TreeMap<>();
//    hotel.put(r1.getNameRoom(),An);
//    hotel.put(r2.getNameRoom(),Bình);
//    hotel.put(r3.getNameRoom(),Minh);
//    System.out.println(hotel);
//    System.out.println("****************");
//    System.out.println( r1.getNameRoom() + " " + hotel.get(r1.getNameRoom()));




   Scanner scanner = new Scanner(System.in);
   Method_Hotel hotel = new Method_Hotel();

   HashMap<String, Users> codeGym = new HashMap<>();
   hotel.addUser(scanner);
   hotel.choiceRoom(scanner);
   hotel.displayRoom();
   System.out.println("-----------------------");
   hotel.displayUsers();
   hotel.infoRoom();
   hotel.bill();


}
}
