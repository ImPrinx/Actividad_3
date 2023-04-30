package figurasgeometricas;
public class Cuadrado {   
    double lado;
    Cuadrado(double lado){
        this.lado =lado;
    }
    public double calcularArea(){
        return lado*lado;
    }
    public double calcularPerimetro(){
        return (lado*4);
    }
}
    

