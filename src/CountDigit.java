import javax.swing.*;

public class CountDigit {
    public static void main(String[] args) {
        /*
        👉 Pide un número y cuenta cuántos dígitos tiene.
        Ejemplo:
        12345 → 5 dígitos
         */
        String format="";
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa num: "));
        char[] arr=String.valueOf(num).toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            format+=arr[i]+ " ,";
        }
        JOptionPane.showMessageDialog(null,"Tiene"+arr.length+" digitos "+format);

    }
}
