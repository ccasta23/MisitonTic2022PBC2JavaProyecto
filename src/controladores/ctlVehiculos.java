/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import classes.clsCarro;
import classes.clsVehiculo;
import java.util.LinkedList;
import modelos.*;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public class ctlVehiculos {
    //Enlazar la capa controlador con la capa modelo
    modeloCarro modeloCarro;
    modeloCamion modeloCamion;

    public ctlVehiculos() {
        //Constructor del controlador
        modeloCarro = new modeloCarro();
        modeloCamion = new modeloCamion();
    }
    
    public void crearVehiculo( clsVehiculo vehiculo ){
        //Crear un nuevo Vehiculo - CONTROLADOR
        if( vehiculo.obtenerTipoMedioTransporte().equals("Carro") ){
            //Debo llamar el modelo de CARRO
            modeloCarro.crearCarro( (clsCarro) vehiculo  );
        } else if (vehiculo.obtenerTipoMedioTransporte().equals("Camion")){
            //Debo llamar el modelo de CAMIÓN
        }
    }
    
    public clsVehiculo obtenerVehiculo( String codigo, String tipo){
        //Consultar 1 vehiculo
        if( tipo.equals("Carro") ){
            //Debo llamar el modelo de CARRO
            return modeloCarro.obtenerCarro(codigo);
        } else if (tipo.equals("Camion")){
            //Debo llamar el modelo de CAMIÓN
        }
        return null;
    }
    
    public boolean actualizarVehiculo( clsVehiculo vehiculo ){
        //Actualizar un vehiculo - CONTROLADOR
        if( vehiculo.obtenerTipoMedioTransporte().equals("Carro") ){
            //Debo llamar el modelo de CARRO
            return modeloCarro.actualizarCarro((clsCarro) vehiculo );
        } else if (vehiculo.obtenerTipoMedioTransporte().equals("Camion")){
            //Debo llamar el modelo de CAMIÓN
        }
        return false;
    }
    
    public boolean eliminarVehiculo( clsVehiculo vehiculo ){
        //Eliminar un vehiculo - CONTROLADOR
        if( vehiculo.obtenerTipoMedioTransporte().equals("Carro") ){
            //Debo llamar el modelo de CARRO
            return modeloCarro.eliminarCarro((clsCarro) vehiculo);
        } else if (vehiculo.obtenerTipoMedioTransporte().equals("Camion")){
            //Debo llamar el modelo de CAMIÓN
        }
        return false;
    }
    
    public LinkedList<clsCarro> listarCarros(){
        //Ejecutar y retornar lo que la clase modelo nos retorna
        return modeloCarro.listarCarros();
    }
    
}
