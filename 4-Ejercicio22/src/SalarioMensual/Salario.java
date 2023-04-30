package SalarioMensual;
public class Salario {
    public static String Calcular_salario(double salario_horas, double horas, String nombre){
        double salario_mensual = salario_horas*horas;
        if (salario_mensual > 450000){
            return "Hola, " + nombre + ". Su salario mensual es: " + salario_mensual;    
    }
        else{
            return "Hola, " + nombre;
        }
    }  
}
