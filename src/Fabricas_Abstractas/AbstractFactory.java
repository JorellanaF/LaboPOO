/*
Fabricas a utilizar
 */
package Fabricas_Abstractas;

import Productos_Abstractos.Convertor;
import Productos_Abstractos.Operacion;

/**
 *
 * @author Jorge Orellana <00103717@uca.edu.sv>
 */
public interface AbstractFactory {
    Operacion getOperacion(String type);
    Convertor getConvertor(String type);
    
}
