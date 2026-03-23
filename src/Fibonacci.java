import javax.swing.*;

public class Fibonacci {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null,"N: "));
        int a=0;
        int b=1;
        String format="";

        for (int i = 0; i <n ; i++) {
            format+=a+" ";
            int c=a+b;
            a=b;
            b=c;

        }
        JOptionPane.showMessageDialog(null,format);

    }
}
