/*
Ejecucion de la ventana 
 */
package Main;

import Fabricas_Abstractas.AbstractFactory;
import Fabricas_Concretas.FactoryProducer;
import GUI.Ventana;
import Productos_Abstractos.Convertor;
import Productos_Abstractos.Operacion;
import Productos_Concretos.Suma;
import java.util.Scanner;
import javax.swing.JFrame;


/**
 *
 * @author Jorge Orellana <00103717@uca.edu.sv>
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame ventana = new JFrame("Ventana");
        ventana.setContentPane(new Ventana());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
        
    }
}
