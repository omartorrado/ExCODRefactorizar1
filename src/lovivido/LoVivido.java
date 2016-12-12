/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class LoVivido {

    public static void main(String[] args) {
        String nombre;
        String edad;

        int meses;
        int dias;
        int horas;
        int anhos;

        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");

        anhos = Integer.parseInt(edad);
        meses = (anhos * 12);
        dias = (anhos * 365);
        horas = (dias * 24);

        getMesesVividos(meses, nombre);

        getDiasVividos(dias, nombre);

        getHorasVividas(horas, nombre);

        System.exit(0);

    }

    public static void getHorasVividas(int horas, String nombre) throws HeadlessException {
        JOptionPane.showMessageDialog(null, "Horas: " + horas, "Numero de horas vividas de " + nombre, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void getDiasVividos(int dias, String nombre) throws HeadlessException {
        JOptionPane.showMessageDialog(null, "Días: " + dias, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void getMesesVividos(int meses, String nombre) throws HeadlessException {
        JOptionPane.showMessageDialog(null, "Meses: " + meses, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);
    }

}
