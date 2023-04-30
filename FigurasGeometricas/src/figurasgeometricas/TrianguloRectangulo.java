package figurasgeometricas;
public class TrianguloRectangulo {
    double base;
    double altura;
    TrianguloRectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        return (base * altura / 2);
    }
    public double calcularPerimetro(){
        return (base+altura+calcularHipotenusa());
    }
    public double calcularHipotenusa(){
        return (Math.pow(base*base+altura*altura, 0.5));
    }
    public String determinarTipoTriangulo(){
        if ((base==altura) && (base==calcularHipotenusa()) && (altura==calcularHipotenusa())){
            return("El triángulo es equilátero.");
        }else if((base!=altura) && (base!=calcularHipotenusa()) && (altura!=calcularHipotenusa())){
            return("El triángulo es escaleno.");
        }else{
            return("El triángulo es isósceles.");
        }
    }
}

    

