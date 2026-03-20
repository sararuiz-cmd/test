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



        while (true){
            try {
                String nuevo="";
                int num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero: "));
                char[] Arreglo= String.valueOf(num).toCharArray();
                for (int i =Arreglo.length-1;i>=0 ; i--) {
                    nuevo+=Arreglo[i];
                }
                JOptionPane.showMessageDialog(null,"Nuevo: "+nuevo);
                break;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Solo numeros");

            }

        }
    }
}
