import javax.swing.*;
import java.util.Calendar;
import java.util.Scanner;

public class TrianguloSimple {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("N: ");
        int n= leer.nextInt();
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
