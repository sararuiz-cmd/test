import java.sql.SQLOutput;
import java.util.Scanner;

public class CenterPyram {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("N: ");
        int n=leer.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
