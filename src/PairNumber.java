import javax.swing.*;

public class PairNumber {
    public static void main(String[] args) {
        /*Pide un número y suma solo los números pares desde 1 hasta ese número.

Ejemplo:
Entrada: 10
Salida: 2 + 4 + 6 + 8 + 10 = 30*/
        int num1=Integer.parseInt(JOptionPane.showInputDialog("num 1"));
        int suma=0;
        String format="";
        for (int i = 2; i <num1+1 ; i+=2) {
            suma+=i;
            if(num1%2==0){
                format+=i+"+";
            }
            if(i==2){
                format+=i;
            }else {
                format+=i;
            }

        }
        JOptionPane.showMessageDialog(null,"suma"+" "+format+"="+suma);


    }
}
