public class Circulo {
    private double radio;
    private double PI=3.1416;
 
    public double mostrarResultado() {
        return PI * radio * radio;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
       this.PI = PI;
    }

    public Radio(double radio) {
        this.radio = radio;
    }
 
   
 }