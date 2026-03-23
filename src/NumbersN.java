import javax.swing.*;
import java.awt.*;

public class NumbersN {
    public static void main(String[] args) {
        String format="";
        int n=Integer.parseInt(JOptionPane.showInputDialog("N: "));
        for (int i = 1; i <=n ; i++) {
                format+=i;
                if (i<n){
                    format+=" ,";
                }

        }
        JOptionPane.showMessageDialog(null,format
        );
    }
}
