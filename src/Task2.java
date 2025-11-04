import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userInt = InputHelper.getInt(scan, "Enter your favorite int: ");
        double userDouble = InputHelper.getDouble(scan, "Enter your favorite double: ");

        System.out.println("Your favorite int is " + userInt + " and your favorite double is " +  userDouble + ".");
    }
}
