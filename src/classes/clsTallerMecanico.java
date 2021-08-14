/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import abstracts.absCentroReparacion;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public class clsTallerMecanico extends absCentroReparacion{
    //Atributos
    private String nombre;
    private String direccion;
    private clsMecanico mecanico; //Asociación de Composición (Ver el constructor)

    //Constructor
    public clsTallerMecanico(String nombre, String direccion, clsMecanico mecanico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.mecanico = mecanico;
    }
    
    //Métodos
    public boolean recibirVehiculo(clsVehiculo vehiculo){
        System.out.println( this.nombre +" - Recibiendo vehiculo " + vehiculo.getMarca() 
                + " y asignandolo al mecánico: " + mecanico.getNombre() );
        boolean seReparo = mecanico.repararVehiculo(vehiculo); //No sabemos cómo se desarrolló
        if(seReparo){
            System.out.println("Se pudo reparar");
            darSalidaAVehiculo();
            return true;
        } else {
            System.out.println("No se pudo reparar");
            darSalidaAVehiculo();
            return false;
        }       
    }
    
    public void darSalidaAVehiculo(){
        System.out.println("El vehiculo está saliendo del taller");
    }
    
    @Override
    public void arreglarVehiculo() {
        System.out.println("Arreglando vehiculo en el taller " + this.nombre);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the mecanico
     */
    public clsMecanico getMecanico() {
        return mecanico;
    }

    /**
     * @param mecanico the mecanico to set
     */
    public void setMecanico(clsMecanico mecanico) {
        this.mecanico = mecanico;
    }

}
