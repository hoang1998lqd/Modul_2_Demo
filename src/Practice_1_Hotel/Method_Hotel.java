package Practice_1_Hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class Method_Hotel {
    private final ArrayList<Users> users;
    private final Menu_room menuRoom = new Menu_room();
    private final HashMap<String, Users> managerHotel = new HashMap<>();
    public Method_Hotel(){
        users = new ArrayList<>();
    }

    // Hiển thị danh sách phòng.
    public  void  displayRoom(){
        for (Room room: menuRoom.listRooms){
            System.out.println(room);
        }
    }
    // Chọn phòng.
    public void choiceRoom(Scanner scanner){
        System.out.println("Mời bạn chọn phòng");
        int choice = scanner.nextInt();
        switch (choice){
            case 201:
                Room room = menuRoom.getRoomByName("Phòng 201");
                if (!room.getStatus().equals("Off")){
                    System.out.println("Bạn đã đặt phòng 201 thành công." );
                    room.setStatus("Off");
                    managerHotel.put(menuRoom.getNameRoom("Phòng 201"), users.get(users.size()-1));
                    System.out.println(room);
                }
                else {
                    System.out.println("Phòng đã có khách thuê !!!");
                }
                break;
            case 202:
                Room room1 = menuRoom.getRoomByName("Phòng 202");
                if (!room1.getStatus().equals("Off")){
                    System.out.println("Bạn đã đặt phòng 202 thành công." );
                    room1.setStatus("Off");
                    managerHotel.put(menuRoom.getNameRoom("Phòng 202"),users.get(users.size()-1));
                    System.out.println(room1);
                }
                else {
                    System.out.println("Phòng đã có khách thuê !!!");
                }
                break;
            case 203:
                Room room2 = menuRoom.getRoomByName("Phòng 203");
                if (!room2.getStatus().equals("Off")){
                    System.out.println("Bạn đã đặt phòng 203 thành công." );
                    room2.setStatus("Off");
                    managerHotel.put(menuRoom.getNameRoom("Phòng 203"),users.get(users.size()-1));
                    System.out.println(room2);
                }
                else {
                    System.out.println("Phòng đã có khách thuê !!!");
                }
                break;
                case 204:
                    Room room3 = menuRoom.getRoomByName("Phòng 204");
                    if (!room3.getStatus().equals("Off")){
                        System.out.println("Bạn đã đặt phòng 204 thành công." );
                        room3.setStatus("Off");
                        managerHotel.put(menuRoom.getNameRoom("Phòng 204"),users.get(users.size()-1));
                        System.out.println(room3);
                    }
                    else {
                        System.out.println("Phòng đã có khách thuê !!!");
                    }
                break;
                case 205:
                    Room room4 = menuRoom.getRoomByName("Phòng 205");
                    if (!room4.getStatus().equals("Off")){
                        System.out.println("Bạn đã đặt phòng 205 thành công." );
                        room4.setStatus("Off");
                        managerHotel.put(menuRoom.getNameRoom("Phòng 205"),users.get(users.size()-1));
                        System.out.println(room4);
                    }
                    else {
                        System.out.println("Phòng đã có khách thuê !!!");
                    }
                break;
                case 301:
                    Room room5 = menuRoom.getRoomByName("Phòng 301");
                    if (!room5.getStatus().equals("Off")){
                        System.out.println("Bạn đã đặt phòng 301 thành công." );
                        room5.setStatus("Off");
                        managerHotel.put(menuRoom.getNameRoom("Phòng 202"),users.get(users.size()-1));
                        System.out.println(room5);
                    }
                    else {
                        System.out.println("Phòng đã có khách thuê !!!");
                    }
                break;
                case 302:
                    Room room6 = menuRoom.getRoomByName("Phòng 302");
                    if (!room6.getStatus().equals("Off")){
                        System.out.println("Bạn đã đặt phòng 302 thành công." );
                        room6.setStatus("Off");
                        managerHotel.put(menuRoom.getNameRoom("Phòng 202"),users.get(users.size()-1));
                        System.out.println(room6);
                    }
                    else {
                        System.out.println("Phòng đã có khách thuê !!!");
                    }
                break;
                case 303:
                    Room room7 = menuRoom.getRoomByName("Phòng 303");
                    if (!room7.getStatus().equals("Off")){
                        System.out.println("Bạn đã đặt phòng 303 thành công." );
                        room7.setStatus("Off");
                        managerHotel.put(menuRoom.getNameRoom("Phòng 303"),users.get(users.size()-1));
                        System.out.println(room7);
                    }
                    else {
                        System.out.println("Phòng đã có khách thuê !!!");
                    }
                break;
                case 304:
                    Room room8 = menuRoom.getRoomByName("Phòng 304");
                    if (!room8.getStatus().equals("Off")){
                        System.out.println("Bạn đã đặt phòng 304 thành công." );
                        room8.setStatus("Off");
                        managerHotel.put(menuRoom.getNameRoom("Phòng 304"),users.get(users.size()-1));
                        System.out.println(room8);
                    }
                    else {
                        System.out.println("Phòng đã có khách thuê !!!");
                    }
                break;
                case 305:
                    Room room9 = menuRoom.getRoomByName("Phòng 305");
                    if (!room9.getStatus().equals("Off")){
                        System.out.println("Bạn đã đặt phòng 305 thành công." );
                        room9.setStatus("Off");
                        managerHotel.put(menuRoom.getNameRoom("Phòng 305"),users.get(users.size()-1));
                        System.out.println(room9);
                    }
                    else {
                        System.out.println("Phòng đã có khách thuê !!!");
                    }
                break;
        }
    }

    // Hiển thị thông tin phòng trọ.
    public void infoRoom(){
       for (Room room: menuRoom.listRooms){
           if (!room.getStatus().equals("Off")){
               System.out.println(room);
           }
           else {
               System.out.println("Hết phòng cho thuê !!!!!");
           }
       }
    }


    // Hiển thị thông tin người dùng theo phòng.
    public void nameOfRoom (Scanner scanner){
        System.out.println("Nhập tên phòng bạn muốn kiểm tra: ");
        String nameRoom = scanner.nextLine();
        System.out.println(managerHotel.get(nameRoom));
    }

    // Checkin và checkout.
    public long dayOfCheck(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ngày thuê trọ: ");
        int dayIn = scanner.nextInt();
        System.out.println("Nhập tháng thuê trọ: ");
        int monthIn = scanner.nextInt();
        System.out.println("Nhập năm thuê trọ: ");
        int yearIn = scanner.nextInt();
        System.out.println(" -------------");
        System.out.println("Nhập ngày trả phòng: ");
        int dayOut = scanner.nextInt();
        System.out.println("Nhập tháng trả phòng : ");
        int monthOut = scanner.nextInt();
        System.out.println("Nhập năm trả phòng : ");
        int yearOut = scanner.nextInt();
        Order order = new Order(LocalDate.of(yearIn,monthIn,dayIn),LocalDate.of(yearOut,monthOut,dayOut));
        return DAYS.between(order.getCheckin(),order.getCheckout());
    }

    // Tính tiền thuê phòng
    public void bill(Scanner scanner){
    long price ;
    long totalPrice;
        System.out.println("Nhập tên phòng của bạn: ");
    int choice = scanner.nextInt();
    switch (choice){
        case 201:
            Room room = menuRoom.getRoomByName("Phòng 201");
            price = room.getPrice();
            totalPrice = price * dayOfCheck();
            System.out.println(" Giá tiền thuê " + room.getNameRoom() +  " của bạn là: " + totalPrice + " VNĐ");
            room.setStatus("On");
            break;

        case 202:
            Room room1 = menuRoom.getRoomByName("Phòng 202");
            price = room1.getPrice();
            totalPrice = price * dayOfCheck();
            System.out.println(" Giá tiền thuê " + room1.getNameRoom() +  " của bạn là: " + totalPrice + " VNĐ");
            room1.setStatus("On");
            nameRoomCheckOut(scanner);
            break;
        case 203:
            Room room2 = menuRoom.getRoomByName("Phòng 203");
            price = room2.getPrice();
            totalPrice = price * dayOfCheck();
            System.out.println(" Giá tiền thuê " + room2.getNameRoom() +  " của bạn là: " + totalPrice + " VNĐ");
            room2.setStatus("On");
            nameRoomCheckOut(scanner);
            break;
        case 204:
            Room room3 = menuRoom.getRoomByName("Phòng 204");
            price = room3.getPrice();
            totalPrice = price * dayOfCheck();
            System.out.println(" Giá tiền thuê " + room3.getNameRoom() +  " của bạn là: " + totalPrice + " VNĐ");
            room3.setStatus("On");
            nameRoomCheckOut(scanner);
            break;
        case 205:
            Room room4 = menuRoom.getRoomByName("Phòng 205");
            price = room4.getPrice();
            totalPrice = price * dayOfCheck();
            System.out.println(" Giá tiền thuê " + room4.getNameRoom() +  " của bạn là: " + totalPrice + " VNĐ");
            room4.setStatus("On");
            nameRoomCheckOut(scanner);
            break;
        case 301:
            Room room5 = menuRoom.getRoomByName("Phòng 301");
            price = room5.getPrice();
            totalPrice = price * dayOfCheck();
            System.out.println(" Giá tiền thuê " + room5.getNameRoom() +  " của bạn là: " + totalPrice + " VNĐ");
            room5.setStatus("On");
            nameRoomCheckOut(scanner);
            break;
        case 302:
            Room room6 = menuRoom.getRoomByName("Phòng 302");
            price = room6.getPrice();
            totalPrice = price * dayOfCheck();
            System.out.println(" Giá tiền thuê " + room6.getNameRoom() +  " của bạn là: " + totalPrice + " VNĐ");
            room6.setStatus("On");
            nameRoomCheckOut(scanner);
            break;
        case 303:
            Room room7 = menuRoom.getRoomByName("Phòng 303");
            price = room7.getPrice();
            totalPrice = price * dayOfCheck();
            System.out.println(" Giá tiền thuê " + room7.getNameRoom() +  " của bạn là: " + totalPrice + " VNĐ");
            room7.setStatus("On");
            nameRoomCheckOut(scanner);
            break;
        case 304:
            Room room8 = menuRoom.getRoomByName("Phòng 304");
            price = room8.getPrice();
            totalPrice = price * dayOfCheck();
            System.out.println(" Giá tiền thuê " + room8.getNameRoom() +  " của bạn là: " + totalPrice + " VNĐ");
            room8.setStatus("On");
            nameRoomCheckOut(scanner);
            break;case 305:
            Room room9 = menuRoom.getRoomByName("Phòng 305");
            price = room9.getPrice();
            totalPrice = price * dayOfCheck();
            System.out.println(" Giá tiền thuê " + room9.getNameRoom() +  " của bạn là: " + totalPrice + " VNĐ");
            room9.setStatus("On");
            nameRoomCheckOut(scanner);
            break;
        default:
            System.out.println("Không tìm thấy tên phòng !!!");
    }
    }
// Nhập tên người đăng ký phòng để xóa người dùng ra khỏi list người dùng sau khi checkout.
    private void nameRoomCheckOut(Scanner scanner) {
        System.out.println("Nhập tên khách hàng trả phòng: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(name)){
                users.remove(users.get(i));
            }
        }
    }

    // Thêm người thuê trọ
    public void addUser(Scanner scanner){
        Users users1 = addInformation(scanner);
        users.add(users1);
    }

    // Phương thức nhập thông tin người thuê trọ.
    public Users addInformation(Scanner scanner){
        System.out.println("Nhập tên người thuê trọ: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        String birth = scanner.nextLine();
        System.out.println("Nhập số chứng minh nhân dân hoặc căn cước công dân: ");
        long code = scanner.nextLong();
        return new Users(name,birth,code);
    }

    // Hiển thị thông tin người thuê trọ.
    public void displayUsers(){
        for (Users users1:users) {
            System.out.println(users1);
        }
    }

}
