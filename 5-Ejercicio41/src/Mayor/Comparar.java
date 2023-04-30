package Mayor;
import javax.swing.JList;
import javax.swing.JTextField;
public class Comparar {
    public static double Mas_grande(JList <String> lista) {
        double[] numeros = new double[lista.getModel().getSize()];
        for (int i = 0; i < lista.getModel().getSize(); i++) {
            String s = lista.getModel().getElementAt(i);
            numeros[i] = Double.parseDouble(s);
        }
        double mayor = numeros[0];
        for (int x = 1; x < numeros.length; x++) {
            if (numeros[x] > mayor) {
                mayor = numeros[x];
            }
        }
        return mayor;
    }
}
    
    

