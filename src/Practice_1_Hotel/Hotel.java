package Practice_1_Hotel;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Users> users = new ArrayList<>();
    public ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();


    // Thêm phần tử vào mảng Room.
    public void add(Room room){
        rooms.add(room);
    }
    public long getTotal(){
        long total = 0;
        for (Order order: orders) {
            total += order.getTotalPrice();
        }
        return total;
    }



    public Hotel(ArrayList<Users> users, ArrayList<Room> rooms, ArrayList<Order> orders) {
        this.users = users;
        this.rooms = rooms;
        this.orders = orders;
    }


    public ArrayList<Users> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Users> users) {
        this.users = users;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "users=" + users +
                ", rooms=" + rooms +
                ", orders=" + orders +
                '}';
    }
}
