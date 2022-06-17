package Practice_1_Hotel;

// Import hàm có sẵn trong java để tính ngày.

import java.time.LocalDate;

public class Order  {
    // Ngày nhận phòng.
    private LocalDate checkin;
    // Ngày trả phòng.
    private LocalDate checkout;
    private Users users;
    private Room room;

    public Order() {
    }
    public Order(LocalDate checkin, LocalDate checkout){
        this.checkin = checkin;
        this.checkout = checkout;
    }


    public Order(LocalDate checkin, LocalDate checkout, Users users, Room room) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.users = users;
        this.room = room;
    }
    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public String getUsers() {
        return users.getName();
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getRoom() {
        return room.getNameRoom();
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Oder{" +
                "checkin =" + checkin +
                ", checkout =" + checkout +
                ", users =" + users +
                ", room =" + room +
                '}';
    }
}
