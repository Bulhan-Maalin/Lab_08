import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double userInput;
        boolean YN;
        double totalPrice = 0;

        do {
            userInput = InputHelper.getRangedDouble(scan, "Enter the item price: $", .50, 9.99);
            scan.nextLine();
            totalPrice += userInput;
            YN = InputHelper.getYNConfirm(scan, "Do you want to add another item? [Y/N]");

        } while (YN);

        System.out.printf("Total Cost in $:     " + "%.2f%n", totalPrice);
    }
}
