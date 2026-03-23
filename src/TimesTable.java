import javax.swing.*;

public class TimesTable {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("N: "));
        int mult=0;
        String format="";
        for (int i = 1; i <= 10; i++) {
            mult=n*i;
            format+=n+" * "+ i+" = "+mult+"\n";
        }
        JOptionPane.showMessageDialog(null,"Tabla del "+n+"\n"+format);
    }
}
