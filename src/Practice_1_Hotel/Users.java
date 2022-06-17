package Practice_1_Hotel;

public class Users {
    private String name;
    private String birth;
    private long code;

    public Users() {
    }

    public Users(String name, String birth, long code) {
        this.name = name;
        this.birth = birth;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public double getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Users{" +
                "Name ='" + name + '\'' +
                ", Birth day ='" + birth + '\'' +
                ", Code =" + code +
                '}';
    }
}
