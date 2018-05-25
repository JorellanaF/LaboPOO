/*
Segun la operacion deseada llamara al metodo necesario
 */
package Fabricas_Concretas;

import Fabricas_Abstractas.AbstractFactory;
import Productos_Abstractos.Convertor;
import Productos_Abstractos.Operacion;
import Productos_Concretos.Division;
import Productos_Concretos.Multiplicacion;
import Productos_Concretos.Resta;
import Productos_Concretos.Suma;

/**
 *
 * @author Jorge Orellana <00103717@uca.edu.sv>
 */
public class FactoryOperacion implements AbstractFactory{

    @Override
    public Operacion getOperacion(String type) {
        switch(type){
            case "SUMA":
                return new Suma();
            case "RESTA":
                return new Resta();
            case "MULTIPLICACION":
                return new Multiplicacion();
            case "DIVISION":
                return new Division();                
                
        }
        return null;
    }

    @Override
    public Convertor getConvertor(String type) {
        return null;
    }
    
}
