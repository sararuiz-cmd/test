import javax.swing.*;

public class NumeroPrimo {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("N: "));
        if(n==2){
            JOptionPane.showMessageDialog(null,"Es primo");
        }else if(n/n==1&&n/1==n &&n%2!=0){
            JOptionPane.showMessageDialog(null,"Es primo");
        }else {
            JOptionPane.showMessageDialog(null,"No es primo");
        }

    }
}
