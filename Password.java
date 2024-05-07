
 public class Password{
 int longitud = 8;
 private String contrasena;
 private int contrasena2;
 boolean c3= 1 > 8;
 boolean c4= 1 < 7;
 Password(){
    System.out.println("Se esta construyendo la contrasena");
 }

 
public  void mostrarContrasena () {
    System.out.println("contrasena  "+this.c3);


}


public int getLongitud() {
    return longitud;
}


public void setLongitud(int longitud) {
    this.longitud = longitud;
}


public String getContrasena() {
    return contrasena;
}


public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
}


public int getContrasena2() {
    return contrasena2;
}


public void setContrasena2(int contrasena2) {
    this.contrasena2 = contrasena2;
}

}