import javax.management.StringValueExp;
import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public class ReverseNumber {
    public static void main(String[] args) {
        /*
        5. Invertir número

👉 Pide un número y muéstralo al revés.

Ejemplo:
123 → 321
         */
        String format="";
        int n=Integer.parseInt(JOptionPane.showInputDialog("N: "));
        char[] arr=String.valueOf(n).toCharArray();
        for (int i = arr.length-1; i >=0 ; i--) {
            format+=arr[i];
        }
        JOptionPane.showMessageDialog(null,"Num: "+format);
    }
}
