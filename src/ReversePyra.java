import java.util.Scanner;

public class ReversePyra {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("Numero: ");
        int n=leer.nextInt();
        for (int i = n; i >0 ; i--) {
            for (int j = 1; j <n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
