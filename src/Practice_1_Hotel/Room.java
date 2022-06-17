package Practice_1_Hotel;

public class Room {
    private String nameRoom;
    private String type;
    private long price;
    public String  status;

    public Room() {
    }

    public Room(String nameRoom, String type, long price, String status) {
        this.nameRoom = nameRoom;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "nameRoom ='" + nameRoom + '\'' +
                ", type ='" + type + '\'' +
                ", price =" + price +
                ", status ='" + status + '\'' +
                '}';
    }
}
