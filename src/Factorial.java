import javax.swing.*;

public class Factorial {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("N: "));
        int fac=1;
        for (int i = 1; i <=n ; i++) {
            fac*=i;
        }
        JOptionPane.showMessageDialog(null,"Fact "+fac);
    }
}
