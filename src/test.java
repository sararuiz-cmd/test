import javax.swing.*;

public class test {
    public static void main(String[] args) {
        boolean esBisiesto=false;
        int dia=Integer.getInteger(JOptionPane.showInputDialog("Ingresa un numero: "));
        int mes=Integer.getInteger(JOptionPane.showInputDialog("ingresa un mes: "));
        int anio=Integer.getInteger(JOptionPane.showInputDialog("Ingresa el año: "));
        int dias_mes=0;
        if (mes==1 && mes==3 && mes==5 && mes==7 && mes==8 && mes==10 && mes==11){
            dias_mes=31;
        } else if (mes==4 && mes==6 && mes==9 && mes==12) {
            dias_mes=30;
        } else if (dias_mes==2) {
            if(anio%4==0 && anio%100!=0 ||anio%400==0){
                esBisiesto=true;
                dias_mes=29;
            }else {
                dias_mes=28;
            }
        }
        if(dia>1 && dia<=dias_mes || mes>1 && mes<=12 || anio>=1 && anio<=3000){
            JOptionPane.showMessageDialog(null,"Fecha valida");

        }else {
            JOptionPane.showMessageDialog(null, "Fecha invalida");
        }

    }
}
