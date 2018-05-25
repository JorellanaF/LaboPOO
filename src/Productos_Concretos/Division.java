/*
Se retorna la division
 */
package Productos_Concretos;

import Productos_Abstractos.Operacion;

/**
 *
 * @author Jorge Orellana <00103717@uca.edu.sv>
 */
public class Division implements Operacion{

    @Override
    public double operar(double a, double b) {
        return a/b;
    }
    
}
