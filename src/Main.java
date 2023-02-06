import java.util.*;

public class Main {

    // Case 3: Display all contacts
    private static void displayAllContacts(Scanner sc, ArrayList<Contact> addressBook) {
        // sort according to names
        addressBook.sort(new Comparator<Contact>() {
            @Override
            public int compare(Contact c1, Contact c2) {
                return c1.getName().compareTo(c2.getName());
            }
        });

        System.out.println("\nMain Window --> Display All Contacts");
        Utils.printBrokenLine("=", 25);
        Utils.printHeader();

        // Print all contacts
        for (Contact c : addressBook) {
            System.out.println(c);
        }

        Utils.printBrokenLine("-", 83);
        System.out.println("\nPress Enter to go back to the Main Window");
        sc.nextLine();
    }

    // Case 2: Search for contact
    private static void searchForContact(Scanner sc, ArrayList<Contact> addressBook) {
        System.out.println("\nMain Window --> Search for contact window: (Choose one of the following options)");
        Utils.printBrokenLine("=", 80);
        System.out.print("(1) Search by Name\n(2) Search by Email\n(3) Search by Phone\nEnter your choice: ");
        String str = sc.nextLine();

        switch (str) {
            case "1":
                Search.searchBy("Name", sc, addressBook);
                break;
            case "2":
                Search.searchBy("Email", sc, addressBook);
                break;
            case "3":
                Search.searchBy("Phone", sc, addressBook);
                break;
        }
    }

    // Case 1: Add new contact
    private static Contact addNewContact(Scanner sc) {
        String[] info = new String[] { "Name:  ", "Email: ", "Phone: ", "Notes: " };
        System.out.println("\nMain Window --> Add a new contact window: (Enter the following information)");
        Utils.printBrokenLine("=", 75);

        for (int j = 0; j < 4; j++) {
            System.out.print(info[j]);
            info[j] = sc.nextLine();
        }

        Contact person = new Contact(info);

        Utils.printBrokenLine("-", 75);
        System.out.println("Saved successfully....Press Enter to go back to the Main Window");
        sc.nextLine();
        return person;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Contact> addressBook = new ArrayList<>(); // the address book
        Scanner sc = new Scanner(System.in);
        String str = "0";

        // Continue running until Quit
        while (str.compareTo("4") != 0) {
            System.out.println("Main Window:");
            Utils.printBrokenLine("=", 12);
            System.out.print(
                    "Choose one of the following options:\n(1) Add a new contact\n(2) Search for contact\n(3) Display all contacts\n(4) Quit\nEnter your choice: ");
            str = sc.nextLine();

            switch (str) {
                case "4":
                    break;
                case "1":
                    addressBook.add(addNewContact(sc));
                    break;
                case "2":
                    searchForContact(sc, addressBook);
                    break;
                case "3":
                    displayAllContacts(sc, addressBook);
                    break;
            }
        }
    }
}
