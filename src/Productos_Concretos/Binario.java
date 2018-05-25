/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos_Concretos;

import Productos_Abstractos.Convertor;
import java.util.ArrayList;

/**
 *
 * @author Jorge Orellana <00103717@uca.edu.sv>
 */
public class Binario implements Convertor{
    @Override
    public String convertir(double a) {
        ObtenerBinario(a);
        return null;
    }
    
    public static String ObtenerBinario(double numero){
        ArrayList<String> binario = new ArrayList<String>();
        double resto;
        String binarioString = "";

        do{
            resto = numero%2;
            numero = numero/2;
            binario.add(0, Integer.toString((int) resto));
        }while(numero > 2); //Haremos el bucle hasta que el cociente no se pueda dividir mas

        binario.add(0, Integer.toString((int) numero)); //Cogeremos el ultimo cociente

        //Cogemos cada uno de los elementos del ArrayList y los juntamos en un String
        for(int i = 0; i < binario.size(); i++){
            binarioString += binario.get(i);
        }
        System.out.println(binarioString);
        return binarioString;
    }
    
}
