package numeros;
public class MayorMenorIgual {
    public static String Comparar_numeros(double a, double b){
        if (a>b){
            return "A es mayor que B";
        }
        else if (a<b){
            return "B es mayor que A";
        }
        else{
            return "A y B son iguales";
        }
    }    
}
