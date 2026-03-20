import javax.swing.*;

public class NumberRange {
    public static void main(String[] args) {
        //Sumar números de un rango
        //
        //Pide inicio y fin

        //Muestra la suma total
        String total="";
        String formato="";
        int suma=0;
        while (true){
            try{
                int num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero:", "Suma de rango",JOptionPane.INFORMATION_MESSAGE));
                int num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa otro numero:", "Suma de rango",JOptionPane.INFORMATION_MESSAGE));
                for (int i=num1;i<=num2;i++){
                    suma+=i;
                    formato+=suma+" ,";
                }
                if(formato.length()>0){
                    formato=formato.substring(0,formato.length()-1);
                }
                total+=formato;
                JOptionPane.showMessageDialog(null,"La suma es: \n"+total);
                break;

            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Ingrese solo numeros");
            }


        }

    }
}
