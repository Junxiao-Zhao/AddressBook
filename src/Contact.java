import java.io.Serializable;

public class Contact implements Serializable {

    private static int count = 0;
    private static int ID = 0;

    private String name;
    private String email;
    private String phone;
    private String notes;
    private int id;

    public Contact(String[] info) {
        this.id = ++ID;
        this.name = info[0];
        this.email = info[1];
        this.phone = info[2];
        this.notes = info[3];
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void resetCount() {
        count = 0;
    }

    public static void setCount(int num) {
        if (num >= 0) {
            count = num;
        }
    }

    public static void setID(int newID) {
        if (newID > ID) {
            ID = newID;
        }
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    @Override
    public String toString() {
        return String.format("%-2d | %-18s | %-18s | %-18s | %-18s", this.id, this.name, this.email, this.phone,
                this.notes);
    }
}
