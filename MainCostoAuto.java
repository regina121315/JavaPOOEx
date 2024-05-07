import java.util.Scanner;

public class MainCostoAuto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un costo de un vehiculo:");
        double $costo = scanner.nextDouble();

        double $costofinal = $costofinal($costo);
        System.out.println($costo + " el costo es:$" + $costofinal + " costo final.");

    }

    public static double $costofinal(double $costo) {
        return ($costo * 1 * 0.12 + 0.06);

    }
}