import javax.swing.*;

public class PairNumber {
    public static void main(String[] args) {
        /*Pide un número y suma solo los números pares desde 1 hasta ese número.

Ejemplo:
Entrada: 10
Salida: 2 + 4 + 6 + 8 + 10 = 30*/
        String formato="";
        int resultado=0;
        while (true){
            try{
                int num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero"));
                for (int i=2;i<=num;i+=2){
                    resultado+=i;
                    if (i==2){
                        formato+=i;
                    }else {
                        formato+=" + "+i;
                    }

                }
                JOptionPane.showMessageDialog(null,"El resultado es: \n"+formato+" = "+resultado);
                break;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Ingrese solo numeros");
            }

        }

    }
}
