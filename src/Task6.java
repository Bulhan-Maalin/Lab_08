import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double userCelsius = 0;
        userCelsius = celsiusToFahrenheit(scan, userCelsius);
        System.out.println(userCelsius);
    }
        public static double celsiusToFahrenheit(Scanner scan, double Celsius) {
            double userCelsius = 0;
            boolean valid = false;
            double userFahrenheit;

            userCelsius = InputHelper.getDouble(scan, "Enter a temperature in Celsius:");

            userFahrenheit = (userCelsius * 1.8) + 32;

            System.out.printf("You temperature in degrees Fahrenheit is:    " + "\"%.2f%n\"", userFahrenheit);

            return userCelsius;
    }
}
