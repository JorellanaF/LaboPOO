/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas_Concretas;

import Fabricas_Abstractas.AbstractFactory;
import Productos_Abstractos.Convertor;
import Productos_Abstractos.Operacion;
import Productos_Concretos.Binario;

/**
 *
 * @author Jorge Orellana <00103717@uca.edu.sv>
 */
public class FactoryConvertor implements AbstractFactory{    
    @Override
    public Convertor getConvertor(String type) {
        switch(type){
            case "BINARIO":
                return new Binario();
            /*case "DECIMAL":
                return new Decimal();   */                
        }
        return null;
    }

    @Override
    public Operacion getOperacion(String type) {
        return null;
    }

}
