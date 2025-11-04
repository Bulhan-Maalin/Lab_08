import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;

        String username = InputHelper.getNonZeroLenString(scan, "Please enter your username.");
        System.out.println("The username you entered is: " + username);
    }
}