import java.util.ArrayList;
import java.util.Scanner;

public class Search {

    public static void searchBy(String by, Scanner sc, ArrayList<Contact> addressBook) {
        System.out.println("\nMain Window --> Search for contact window --> Search by " + by);
        Utils.printBrokenLine("=", 25);
        System.out.printf("(1) Enter %s: ", by);
        String target = sc.nextLine();

        System.out.println("\nSearch Results:");
        Utils.printHeader();

        String each = "";
        for (Contact c : addressBook) {

            switch (by) {
                case "Name":
                    each = c.getName();
                    break;
                case "Email":
                    each = c.getEmail();
                    break;
                case "Phone":
                    each = c.getPhone();
                    break;
            }

            if (each.contains(target)) {
                System.out.println(c);
            }
        }

        Utils.printBrokenLine("-", 83);
        System.out.print(
                "\nChoose one of these options:\n(1) To delete a contact\n(2) Back to main Window\n\nEnter Your Choice: ");
        each = sc.nextLine();

        System.out.println();
        if (each.compareTo("1") == 0) {
            System.out.printf("Main Window --> Search for contact window --> Search by %s --> Delete a Contact\n", by);
            Utils.printBrokenLine("=", 25);
            System.out.print("Enter the Contact ID: ");
            each = sc.nextLine();

            // Delete the contact
            for (int i = 0; i < addressBook.size(); i++) {
                if (addressBook.get(i).getID() == Integer.parseInt(each)) {
                    addressBook.remove(i);
                    break;
                }
            }

            Contact.setCount(Contact.getCount() - 1); // Update the count
            System.out.println("Deleted....Press Enter to go back to the Main Window");
            sc.nextLine();
        }
    }
}
