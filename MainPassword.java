import java.util.Scanner;

public class MainPassword {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("tu contrasena generada es:");
        boolean contrasena = scanner.nextBoolean();
        
        boolean contrasena2 = contrasena(contrasena);
        System.out.println(contrasena + " la contrasena es " + contrasena2 + " c3.");

    }

    public static boolean contrasena (boolean contrasena2) {
        return ("contrasena + contrasena2");

    }
}