import java.util.Scanner;

public class MainConversorDolares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero para saber su valor en dolar:");
        double pesos = scanner.nextDouble();
        
        double dolar = dolar(pesos);
        System.out.println(pesos + " pesos mexicanos equivalen a " + dolar + " dolar.");

    }

    public static double dolar (double pesos) {
        return (pesos * 1 * 0.059);

    }
}
