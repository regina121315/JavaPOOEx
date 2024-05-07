import java.util.Scanner;
public class MainCirculo{ 
    public static void main(String[] args){
        Scanner op = new Scanner(System.in);
        double y;
        int r;
        do{
        System.out.println("1:area del circulo ");
        System.out.println("0:cerrar programa ");


         r=op.nextInt();
         if(r==1){
         System.out.println("ingresa el valor del numero");

         y=op.nextDouble();

         Circulo evaluar = new Circulo ();
         evaluar.setRadio(y);
         System.out.println("EL RESULTADO ES: " + evaluar.mostrarResultado());
         }
        } while(r>0);
       
    

}

}