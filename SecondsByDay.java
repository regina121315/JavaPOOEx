import java.util.Scanner;

public class SecondsByDay {
    public static void main(String[] args) {
        double dias;
        double segundos;
        double constante= 86400;
    
    }

    public SecondsByDay(double dias ){
        this.dias = dias;
        this.segundos = dias * constante;
    }

    public double getSegundos() {
        return segundos;
    }

    public double getDias(){
        return dias;
    }


    }
    

