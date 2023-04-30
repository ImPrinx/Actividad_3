package figurasgeometricas;
public class Circulo {
    double radio;    
    Circulo(double radio) {
    this.radio = radio;
    }
    public double calcularArea(){
        return Math.PI*Math.pow(this.radio, 2);
    }
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }  
}
