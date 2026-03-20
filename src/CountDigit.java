import javax.swing.*;

public class CountDigit {
    public static void main(String[] args) {
        /*
        👉 Pide un número y cuenta cuántos dígitos tiene.
        Ejemplo:
        12345 → 5 dígitos
         */
        String format="";
        String numero= JOptionPane.showInputDialog("Ingresa un numero");
        char Arreglo[]=numero.toCharArray();
        for (int i = 0; i < Arreglo.length; i++) {
            format+=Arreglo[i]+" , ";

        }
        JOptionPane.showMessageDialog(null,"El numero tiene "+Arreglo.length+" Digitos :"+format);
    }
}
