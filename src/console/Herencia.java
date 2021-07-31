/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

import classes.clsCarro;
import classes.clsCamionElectrico;
import classes.clsMecanico;
import classes.clsVehiculo;
import classes.clsTallerMecanico;
import classes.clsCamion;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public class Herencia {
    
    public static void main(String[] args) {
        
        //Crear un objeto de la clase Vehiculo
        clsVehiculo mi_vehiculo = new clsVehiculo(0,"001","Chevrolet", 4, "Azul", 20);
//        mi_vehiculo.setMarca("Chevrolet");
//        mi_vehiculo.setNumeroLlantas(4);
//        mi_vehiculo.setColor("Azul");
//        mi_vehiculo.setCaballosDeFuerza(20);
        
        mi_vehiculo.encender();
        mi_vehiculo.acelerar();
        mi_vehiculo.frenar();
        mi_vehiculo.apagar();
        mi_vehiculo.pitar();
        
        clsVehiculo.estrellar();
        
        //System.out.println("La marca del vehiculo es: " + mi_vehiculo.marca);//Obtener el valor del atributo DIRECTAMENTE
        //mi_vehiculo.marca = "Mazda"; //Modificar el valor del atributo DIRECTAMENTE
        //System.out.println("La marca del vehiculo es: " + mi_vehiculo.marca);//Obtener el valor del atributo DIRECTAMENTE
        
        System.out.println("La marca del vehiculo es: " + mi_vehiculo.getMarca());//Obtener el valor del atributo a través de un método
        mi_vehiculo.setMarca("Mazda"); //Modificar el valor del atributo a través de un método
        System.out.println("La marca del vehiculo es: " + mi_vehiculo.getMarca());//Obtener el valor del atributo a través de un método
        
        System.out.println("-----------------------------------------");
        
        //Crear objeto de la clase carro
        clsCarro mi_carrito = new clsCarro(1,true,1,"002", "BMW", 4, "Blanco", 27);
        mi_carrito.encender(); //Ejecutar métodos creados en la clase padre
        System.out.println("¿Es automático?: " + mi_carrito.isAutomatico());
        System.out.println("¿Qué color es?: " + mi_carrito.getColor());
        //Sobrecarga de métodos
        mi_carrito.pitar( );
        mi_carrito.pitar( 8 );
        mi_carrito.pitar( "BOOOOOING" );
        mi_carrito.pitar(4, "PIU ");
        mi_carrito.pitar("PEW ", 9);
        
        System.out.println("-----------------------------------");
        //Crear objeto de la clase camión
        clsCamion mi_camion = new clsCamion(1,"Cisterna",2, "003","Fotón", 8, "Verde", 50);
        mi_camion.unirRemolque();
        mi_camion.soltarRemolque();
        mi_camion.encender();
        mi_camion.acelerar();
        mi_camion.frenar();
        mi_camion.apagar();
        mi_camion.pitar();
        
        System.out.println("--------------------------");
        
        //Crear OBJETO
        clsCamionElectrico mi_camion_electrico = new clsCamionElectrico(1,94,1, "No",3, "004","Kenworth", 12, "Amarillo", 60);
        mi_camion_electrico.cargarBateria();
        mi_camion_electrico.unirRemolque();
        mi_camion_electrico.encender();
        System.out.println("--------------------------");
        
        clsMecanico mecanico1 = new clsMecanico("56489", "Juan", 37);
        
        clsTallerMecanico tallerDondeJuan = new clsTallerMecanico("Donde Juan", "Calle 1 # 2 - 3", mecanico1);
        tallerDondeJuan.recibirVehiculo( mi_camion_electrico );
        
        
        mi_carrito.setTaller(tallerDondeJuan);
        
        
        
        String edad = "58";
        int edad_en_numero = Integer.parseInt(edad); //Casteo o intercambio de tipo de datos
        double edad_con_decimal = (double) edad_en_numero;
        
        System.out.println("Edad en cadena: " + edad);
        System.out.println("Edad en entero: " + edad_en_numero);
        System.out.println("Edad con decimal: " + edad_con_decimal);
    }
    
}
