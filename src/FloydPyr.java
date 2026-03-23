import java.util.Scanner;

public class FloydPyr {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("N: ");
        int n=leer.nextInt();
        int cont=1;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(cont);
                cont++;
            }
            System.out.println(" ");
        }
    }
}
