package salarios;
public class Salario {
    public static double Calcular_SalarioBruto(double horas_trabajadas, double valor_hora){
        double sBruto;
        sBruto = horas_trabajadas*valor_hora;
        return sBruto;
    }
    
    public static double Calcular_SalarioNeto(double porcentaje_retencion, double horas_trabajadas, double valor_hora){
        double sNeto, sBruto, retencion;         
        sBruto = horas_trabajadas*valor_hora;
        retencion = porcentaje_retencion/100;
        sNeto = sBruto - (sBruto*retencion);
        return sNeto;
    }    
}
