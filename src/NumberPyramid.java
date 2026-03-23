import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("N: ");
        int n=leer.nextInt();
        int cont=0;
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(cont);
                cont++;
            }
            cont=0;
            cont++;
            System.out.println(" ");

        }
    }
}
