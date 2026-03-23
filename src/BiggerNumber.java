import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class BiggerNumber {
    public static void main(String[] args) {
        //Pide 3 números y muestra cuál es el mayor.
        int num1=Integer.parseInt(JOptionPane.showInputDialog("num 1: "));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("num 2: "));
        int num3=Integer.parseInt(JOptionPane.showInputDialog("num 3: "));
        int mayor=num1;
        if (num2>mayor) {
            mayor = num2;
        }
        if (num3>mayor){
            mayor=num3;
        }
        JOptionPane.showMessageDialog(null,mayor);
    }
}
