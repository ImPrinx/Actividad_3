package figurasgeometricas;
public class Rombo {
    double lado;
    double diagonalMayor;
    double diagonalMenor;
    Rombo(double lado, double diagonalMenor, double diagonalMayor){
        this.lado=lado;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }
    public double calcularArea(){
        return diagonalMenor *diagonalMayor/2;
    }
    public double calcularPerimetro(){
        return lado*4;
    }
}
    
