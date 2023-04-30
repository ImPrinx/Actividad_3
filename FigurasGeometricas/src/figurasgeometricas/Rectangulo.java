package figurasgeometricas;
public class Rectangulo {
    double base;
    double altura;
    Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        return base*altura;
    }
    public double calcularPerimetro(){
        return (base*2)+(altura*2);
    }
}
    

