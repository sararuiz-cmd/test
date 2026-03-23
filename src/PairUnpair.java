import javax.swing.*;

public class PairUnpair {
    public static void main(String[] args) {
        /*
            Números pares e impares

            Pide un número n y muestra:

            Cuántos números pares hay entre 1 y n
            Cuántos impares
         */
        String par="";
        String impar="";
        int cont=0;
        int n=Integer.parseInt(JOptionPane.showInputDialog("N: "));
        for (int i = 1; i <=n; i++) {
            if(i%2==0){
                par+=i+" ";
                cont++;
            }else {
                impar+=i+" ";
            }
        }
        JOptionPane.showMessageDialog(null,"Pares: "+cont+" , son: "+par+"\n Impares: "+(n-cont)+" , son: "+impar);
    }
}
