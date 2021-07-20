/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import classes.clsCarro;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public class modeloCarro {
    
    //Modelo - Crear las 4 operaciones básicas
    
    public boolean crearCarro( clsCarro carro ){
        try {
            //Intentar almacenar en base de datos
            //TODO: Falta implementar el código para almacenar en BD
            return true;
        } catch(Exception e){
            //La operación falló en BD
            return false;
        }
    }
    
    public boolean actualizarCarro( String codigo, clsCarro carro ){
        try {
            //Intentar actualizar un registro en base de datos
            //TODO: Falta implementar el código para almacenar en BD
            return true;
        } catch(Exception e){
            //La operación falló en BD
            return false;
        }
    }
    
    public boolean eliminarCarro( clsCarro carro ){
        try {
            //Intentar eliminar un registro en base de datos
            //TODO: Falta implementar el código para almacenar en BD
            return true;
        } catch(Exception e){
            //La operación falló en BD
            return false;
        }
    }
    
    public clsCarro obtenerCarro( String codigo ){
        try {
            //Consultar si el carro se encuentra en BD
            //TODO: Falta implementar el código para almacenar en BD
            return null;
        } catch(Exception e){
            //La operación falló en BD
            return null;
        }
    }
    
}
