import javax.swing.*;

public class Number {
    public static void main(String[] args) {
        //Pida al usuario numeros y sume sus digitos
        int n=Integer.parseInt(JOptionPane.showInputDialog(null,"N: "));
        char[]arr=String.valueOf(n).toCharArray();
        int suma=0;
        String format="";
        for (int i = 0; i <arr.length ; i++) {
            suma+=Character.getNumericValue(arr[i]);
            format+=arr[i];
            if(i<arr.length){
                format+=" + ";
            }
        }
        JOptionPane.showMessageDialog(null,"Suma: "+format+" = "+suma);
    }

}


