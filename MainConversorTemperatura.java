import java.util.Scanner;


public class MainConversorTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la temperatura en grados Celsius:");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = celsiusFahrenheit(celsius);
        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");

    }

    public static double celsiusFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
