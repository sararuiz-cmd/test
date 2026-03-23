import javax.swing.*;

public class MayorMenor {
    public static void main(String[] args) {
        int[]arreglo=new int[10];
        int n=0;

        for (int i = 0; i <10 ; i++) {
            n=Integer.parseInt(JOptionPane.showInputDialog(null,(i+1)+" N: "));
            arreglo[i]=n;
        }
        int mayor=arreglo[0];
        for (int i = 0; i <10 ; i++) {
            if (arreglo[i]>mayor){
                mayor=arreglo[i];
            }
        }
        JOptionPane.showMessageDialog(null,"El mayor es"+mayor);
    }
}
