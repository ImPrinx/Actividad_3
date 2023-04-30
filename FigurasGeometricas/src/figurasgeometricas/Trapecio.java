package figurasgeometricas;
public class Trapecio {
    double altura;
    double baseMayor;
    double baseMenor;
    Trapecio(double basemayor, double basemenor, double altura){
        this.altura = altura;
        this.baseMayor = basemayor;
        this.baseMenor = basemenor;
    }
    public double calcularArea(){
        return ((baseMayor + baseMenor))/2*altura;
    }
    public double calcularPerimetro(){
        return (baseMayor + baseMenor +(determinarHipotenusa())+(determinarHipotenusa()));
    }
    public double determinarHipotenusa(){
        return Math.pow(((baseMayor-baseMenor)/2)*((baseMayor-baseMenor)/2)+altura*altura, 0.5);
    }
}
    

