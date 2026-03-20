import javax.swing.*;

public class BankAccount {
    public static void main(String[] args) {
        //implementacion de metodos publicos para depositar y retirar con validaciones (no se puede
        //retirar mas dinero del que hay en el saldo y no cantidades negativas)
        double deposito = 0;
        double retiro=0;
        int opcion = 0;
        while (true) {
            //Validacion de saldo
            try {
                double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial: "));
                if (saldo>=1){
                    do {
                        while (true) {
                            //validacion del menu
                            try {
                                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenidos al sistema bancario\n" +
                                        "Selecciona una opcion: \n" +
                                        "1. Depositar saldo\n" +
                                        "2. Retirar dinero\n" +
                                        "3. Ver saldo\n" +
                                        "4. Salir del sistema\n", "Sistema bancario", JOptionPane.INFORMATION_MESSAGE));
                                switch (opcion) {
                                    case 1:
                                        while (true) {
                                            try {
                                                deposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar: "));
                                                saldo=depositar(deposito,saldo);
                                                JOptionPane.showMessageDialog(null,"Deposito exitoso");
                                                break;
                                            } catch (NumberFormatException e) {
                                                JOptionPane.showMessageDialog(null, "ERROR" + e, "Error", JOptionPane.ERROR_MESSAGE);
                                            }
                                        }
                                        break;
                                    case 2:
                                        while (true) {
                                            try {
                                                retiro= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar: "));
                                                saldo=retirar(retiro,saldo);

                                                break;
                                            } catch (NumberFormatException e) {
                                                JOptionPane.showMessageDialog(null, "ERROR" + e, "Error", JOptionPane.ERROR_MESSAGE);
                                            }
                                        }
                                        break;
                                    case 3:
                                        JOptionPane.showMessageDialog(null,"Saldo restante: "+saldo);
                                        break;
                                    case 4:
                                        JOptionPane.showMessageDialog(null,"Saliendo del sistema...");
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                                }
                                break;//validacion menu
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Ingrese solo numeros ", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }

                    }while (opcion!=4);
                    break;

                }else {
                    JOptionPane.showMessageDialog(null,"Solo cantidad positiva");

                }

                //validacion de saldo
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error" + e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public static double depositar(double deposito, double saldo){
        if (deposito<=0){
            JOptionPane.showMessageDialog(null,"No se puede depositar saldo negativo");
            return saldo;
        }
        return saldo+=deposito;
    }
    public static double retirar(double retiro, double saldo){
        if (retiro<=0){
            JOptionPane.showMessageDialog(null,"No se permiten retiran saldos negativos ");
        } else if (retiro>saldo) {
            JOptionPane.showMessageDialog(null,"Fondos insuficientes");
        } else {
            JOptionPane.showMessageDialog(null,"Retiro exitoso");
            return saldo-=retiro;
        }
        return saldo;
    }
}
