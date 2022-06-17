package Practice_1_Hotel;

import java.util.ArrayList;

public class Menu_room {
    ArrayList<Room> listRooms = new ArrayList<>();

    public Menu_room() {
        Room p1 = new Room("Phòng 201","NORMAL", 350000,"On");
        Room p2 = new Room("Phòng 202","VIP", 500000,"On");
        Room p3 = new Room("Phòng 203","NORMAL", 350000,"On");
        Room p4 = new Room("Phòng 204","VIP", 500000,"On");
        Room p5 = new Room("Phòng 205","VIP", 500000,"On");
        Room p6 = new Room("Phòng 301","VIP", 500000,"On");
        Room p7 = new Room("Phòng 302","NORMAL", 350000,"On");
        Room p8 = new Room("Phòng 303","VIP", 500000,"On");
        Room p9 = new Room("Phòng 304","NORMAL", 350000,"On");
        Room p10 = new Room("Phòng 305","VIP", 500000,"On");

        listRooms.add(p1);
        listRooms.add(p2);
        listRooms.add(p3);
        listRooms.add(p4);
        listRooms.add(p5);
        listRooms.add(p6);
        listRooms.add(p7);
        listRooms.add(p8);
        listRooms.add(p9);
        listRooms.add(p10);
    }
    public Room getRoomByName(String nameRoom){
        for(Room room: listRooms){
            if(room.getNameRoom().equals(nameRoom)){
                return room;
            }
        }
        return null;
    }
    public long getPriceRoomByName(String nameRoom){
        for(Room room: listRooms){
            if(room.getNameRoom().equals(nameRoom)){
                return room.getPrice();
            }
        }
        return 0;
    }
    public void setStatusRoomByName(String nameRoom, String status){
        for(Room room: listRooms){
            if(room.getNameRoom().equals(nameRoom)){
               room.setStatus(status);
            }
        }
    }
    public String getNameRoom (String nameRoom){
        for (Room room: listRooms){
            if (room.getNameRoom().equals(nameRoom)){
                return room.getNameRoom();
            }
        }
        return null;
    }
    public String getStatus (String nameRoom){
        for (Room room: listRooms){
            if (room.getNameRoom().equals(nameRoom)){
                return room.getStatus();
            }
        }
        return null;
    }



}
