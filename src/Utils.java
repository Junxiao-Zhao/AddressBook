public class Utils {
    public static void printHeader() {
        printBrokenLine("-", 83);
        System.out.printf("%-2s | %-18s | %-18s | %-18s | %-18s\n", "ID", "Name", "Email", "Phone", "Notes");
        printBrokenLine("-", 83);
    }

    public static void printBrokenLine(String s, int num) {
        for (int i = 0; i < num - 1; i++) {
            System.out.print(s);
        }
        System.out.println(s);
    }
}
