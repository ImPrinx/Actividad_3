package Bachiller;
public class Ecuacion {
    public static String Calcular_soluciones(double a, double b, double c){
        if (Math.pow(b, 2) - 4*a*c < 0){
            return "La ecuación de segundo grado no tiene solución en los reales.";
        }
        else{
            double cuadratica_pos, cuadratica_neg;
            cuadratica_pos = (-b + (Math.sqrt((Math.pow(b, 2)) - 4*a*c)))/(2*a); 
            cuadratica_neg = (-b - (Math.sqrt((Math.pow(b, 2)) - 4*a*c)))/(2*a);
            if (cuadratica_pos == cuadratica_neg){
                return "La ecuación de segundo grado solo tiene una solucion real y es " + cuadratica_pos + ".";
            }
            else{
               return "Las soluciones de la ecuación de segundo grado son " + cuadratica_pos + " y " + cuadratica_neg + ".";
            }          
        }
    }
}
