package taller7;
public class Utilidades {
    public double suma(double numero1,double numero2){
        return numero1 + numero2;
    }
    public double resta(double numero1,double numero2){
        return numero1 - numero2;
    }
    public double multiplicacion(double numero1,double numero2){
        return numero1 * numero2;
    }
    public double division(double numero1, double numero2){
        if(numero2!=0){
            return numero1/numero2;
        }
        else {
            System.out.println("No se puede dividir sobre 0");
            return 0;
        }
    }
}
