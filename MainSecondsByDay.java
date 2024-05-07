import java.util.Scanner;

public class MainSecondsByDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero de dias para convertirlo en segundos transcurridos:");
        double dias = scanner.nextDouble();
        SecondsByDay connversion = new SecondsByDay(dias);

        System.out.println(dias + " los dias transcurridos son: " + segundos + " segundos.");

        double segundos = scanner.nextDouble();
        SecondsByDay connversion1 = new SecondsByDay(segundos);

        System.out.println("ingresa numero de segundos para convertirlo en dias");
        
        System.out.println(segundos + "segundos son equivalentesa" + conversion.getDias() + "dias");

    }

}