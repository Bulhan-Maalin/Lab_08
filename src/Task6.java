import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsius = 0;
        celsius = celsiusToFahrenheit(scan, celsius);
        System.out.printf("Your temperature in degrees fahrenheit is:    %.2f%n", celsius);
    }
        public static double celsiusToFahrenheit(Scanner scan, double celsius) {
            celsius = InputHelper.getDouble(scan, "Please enter a temperature in celsius.");
            return (celsius * 1.8) + 32.0;
        }
}
