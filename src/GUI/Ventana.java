/*
Ventana del programa
 */
package GUI;

import Fabricas_Abstractas.AbstractFactory;
import Fabricas_Concretas.FactoryProducer;
import Productos_Abstractos.Operacion;
import static Productos_Concretos.Binario.ObtenerBinario;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jorge Orellana <00103717@uca.edu.sv>
 */
public class Ventana extends JPanel{
    public int WIDTH = 600,widthTF = 120,widthB = 100;
    public int HEIGHT = 500,heightTF = 30,heightB = 30;
    public JTextField textF1,textF2,textF3,resultado;
    public JButton Suma,Resta,Division,Multiplicacion; 
    
    public Ventana(){
        textF1 = new JTextField();
        textF1.setBounds(200,40,widthTF,heightTF);
        
        textF2 = new JTextField();
        textF2.setBounds(200,200,widthTF,heightTF);
        
        textF3 = new JTextField();
        textF3.setBounds(350,300,widthTF,heightTF);
        
        resultado = new JTextField();
        resultado.setBounds(200,300,widthTF,heightTF);
        
        Suma = new JButton("Suma");
        Suma.setBounds(70,115,widthB,heightB);
        
        Resta = new JButton("Resta");
        Resta.setBounds(200,115,widthB,heightB);
        
        Multiplicacion = new JButton("Multiplicacion");
        Multiplicacion.setBounds(330,115,120,heightB);
        
        Division = new JButton("Division");
        Division.setBounds(480,115,widthB,heightB);
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        
        Suma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1=0;
                double num2=0;
                
                AbstractFactory factory;
                num1=Double.parseDouble(textF1.getText());
                num2=Double.parseDouble(textF2.getText());
                factory = FactoryProducer.getFactory("OPERACION");
                Operacion suma = factory.getOperacion("SUMA");
                double resultado1 = suma.operar(num1, num2);
                System.out.println(resultado1);
                String cadenaR = String.valueOf(resultado1);
                resultado.setText(cadenaR);
                String binarioR = ObtenerBinario(resultado1);
                textF3.setText(binarioR);
            }
        });
        
        Resta.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1=0;
                double num2=0;
                
                AbstractFactory factory;
                num1=Double.parseDouble(textF1.getText());
                num2=Double.parseDouble(textF2.getText());
                factory = FactoryProducer.getFactory("OPERACION");
                Operacion resta = factory.getOperacion("RESTA");
                double resultado1 = resta.operar(num1, num2);
                System.out.println(resultado1);
                String cadenaR = String.valueOf(resultado1);
                resultado.setText(cadenaR);
                String binarioR = ObtenerBinario(resultado1);
                textF3.setText(binarioR);
            }
        });
        
        Multiplicacion.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1=0;
                double num2=0;
                
                AbstractFactory factory;
                num1=Double.parseDouble(textF1.getText());
                num2=Double.parseDouble(textF2.getText());
                factory = FactoryProducer.getFactory("OPERACION");
                Operacion multiplicacion = factory.getOperacion("MULTIPLICACION");
                double resultado1 = multiplicacion.operar(num1, num2);
                System.out.println(resultado1);
                String cadenaR = String.valueOf(resultado1);
                resultado.setText(cadenaR);
                String binarioR = ObtenerBinario(resultado1);
                textF3.setText(binarioR);
            }
        });
        
        Division.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1=0;
                double num2=0;
                
                AbstractFactory factory;
                num1=Double.parseDouble(textF1.getText());
                num2=Double.parseDouble(textF2.getText());
                factory = FactoryProducer.getFactory("OPERACION");
                Operacion division = factory.getOperacion("DIVISION");
                double resultado1 = division.operar(num1, num2);
                System.out.println(resultado1);
                String cadenaR = String.valueOf(resultado1);
                resultado.setText(cadenaR);
                String binarioR = ObtenerBinario(resultado1);
                textF3.setText(binarioR);
            }
        });
        
        add(textF1);
        add(Suma);
        add(Resta);
        add(Multiplicacion);
        add(Division);
        add(textF2);
        add(textF3);
        add(resultado);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        
    }
}
