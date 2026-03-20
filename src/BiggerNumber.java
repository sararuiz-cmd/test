import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class BiggerNumber {
    public static void main(String[] args) {
        //Pide 3 números y muestra cuál es el mayor.
        while (true){
            try{
                int mayor=0;
                int num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el num 1"));
                int num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el num 2"));
                int num3=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el num 3"));
                mayor=num1;
                if(num2>num1){
                    num2=mayor;
                }else if (num3>mayor){
                    num3=mayor;
                }
                JOptionPane.showMessageDialog(null,"El mayor es: "+mayor);
                break;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Ingresa solo numeros ");
            }
        }
    }
}
