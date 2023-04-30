package matricula;
public class Estudiante {
    public static double Calcular_matricula(int estrato, double patrimonio){
        double matricula = 50000;
        if (patrimonio > 2000000 && estrato > 3){
            matricula += patrimonio*0.03;
        }
        return matricula;
    }
}
