import java.io.Serializable;

public class Contact implements Serializable {

    private static int count = 0;

    private int id;
    private String name;
    private String email;
    private String phone;
    private String notes;

    public Contact(String[] info) {
        this.id = ++count;
        this.name = info[0];
        this.email = info[1];
        this.phone = info[2];
        this.notes = info[3];
    }

    // Getters
    public static int getCount() {
        return count;
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

    // Setters
    public static void resetCount() {
        count = 0;
    }

    public static void setCount(int num) {
        if (num >= 0) {
            count = num;
        }
    }

    public void setID(int newID) {
        this.id = newID;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }

    @Override
    public String toString() {
        return String.format("%-2d | %-18s | %-18s | %-18s | %-18s", this.id, this.name, this.email, this.phone,
                this.notes);
    }
}
