/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas_Concretas;

import Fabricas_Abstractas.AbstractFactory;

/**
 *
 * @author Jorge Orellana <00103717@uca.edu.sv>
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case"OPERACION":
                return new FactoryOperacion();
            case"CONVERTOR":
                return new FactoryConvertor();
        }
        return null;
    }
}
