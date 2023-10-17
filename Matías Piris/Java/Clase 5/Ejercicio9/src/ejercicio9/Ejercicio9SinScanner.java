/*Ejercicio 9: pedir el día, mes y año de una fecha e indicar si la misma es correcta, 
suponiendo que todos los meses son de 30 días.*/
package ejercicio9;

import javax.swing.JOptionPane;

public class Ejercicio9SinScanner {
    public static void main(String[] args){
        int Dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día: "));
        int Mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        int A = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));
        
        if(Dia != 0 && Dia <= 30){
            if(Mes != 0 && Mes <= 12){
                if(A != 0 && A <= 2023){
                    JOptionPane.showMessageDialog(null,"La fecha ingresada (" + Dia + "/" + Mes + "/" + A + ") es correcta.");
                }
                else{
                    JOptionPane.showMessageDialog(null,"El año ingresado es incorrecto");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"El mes ingresado es incorrecto");
            }
        }
        else{
                JOptionPane.showMessageDialog(null,"El año ingresado es incorrecto");
        }
    }
}
