import java.util.Scanner;

public class MainGasolineria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un galon para saber su valor en litros:");
        double galones = scanner.nextDouble();
        
        double litros = litros(galones);
        System.out.println(galones + " los galones equivalen a " + litros + " litros.");

    }

    public static double litros (double galones) {
        return (galones * 1 * 3.785);

    }
}
