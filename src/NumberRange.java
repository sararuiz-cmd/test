import javax.swing.*;

public class NumberRange {
    public static void main(String[] args) {
        //Sumar números de un rango
        //
        //Pide inicio y fin

        //Muestra la suma total
        int suma=0;
        int inicio=Integer.parseInt(JOptionPane.showInputDialog("n1; "));
        int fin=Integer.parseInt(JOptionPane.showInputDialog("n2; "));
        for (int i = inicio+1; i <fin ; i++) {
            suma+=i;
        }
        JOptionPane.showMessageDialog(null,suma);
    }
}
