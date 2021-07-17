/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.IMedioTransporte;
import interfaces.ITransporteTerrestre;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public class clsVehiculo implements IMedioTransporte, ITransporteTerrestre{
    
    //Atributos
    private String codigo;
    private String marca;
    private int numeroLlantas;
    private String color;
    private int caballosDeFuerza;
    private clsTallerMecanico taller; //Asociación de Agregación
    
    //Constructor
    public clsVehiculo(String codigo,String marca, int numeroLlantas, String color, int caballosDeFuerza) {
        this.codigo = codigo;
        this.marca = marca;
        this.numeroLlantas = numeroLlantas;
        this.color = color;
        this.caballosDeFuerza = caballosDeFuerza;
    }
    
    //Métodos
    public void encender(){
        System.out.println("Enciendo carro " + this.getMarca());
    }
    
    public void apagar(){
        System.out.println("Apagando carro " + this.getMarca());
    }
    
    public void acelerar(){
        System.out.println("Acelerando el carro " + this.getMarca());
    }
    
    public void frenar(){
        System.out.println("Frenando el carro " + this.getMarca());
    }
    
    public void pitar(){
        System.out.println("BEEEEEEEEEEEEEEP");
    }
    
    public static void estrellar(){
        System.out.println("Pow");
    }
    
    @Override
    public void moverse() { //Implementación
        System.out.println("Me estoy moviendo como se mueve un vehiculo. Rodando");
        System.out.println("");
    }
    
    @Override
    public void cargarCombustible(int cantidad) {
        System.out.println("Cargando " + cantidad + " unidades de combustible");
        System.out.println("Capacidad máxima: " + NIVEL_MAXIMO_COMBUSTIBLE);
    }
    
    @Override
    public void obtenerTipoTerreno() {
        System.out.println("Terreno: Pista");
    }

    @Override
    public void cambiarLlanta() {
        System.out.println("Cambiando llanta.....");
    }
    
    @Override
    public String obtenerTipoMedioTransporte() {
        return "Vehiculo";
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca.toUpperCase(); //Ejemplo del uso de método GET para cambiar el valor del atributo
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the numeroLlantas
     */
    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    /**
     * @param numeroLlantas the numeroLlantas to set
     */
    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the caballosDeFuerza
     */
    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    /**
     * @param caballosDeFuerza the caballosDeFuerza to set
     */
    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    /**
     * @return the taller
     */
    public clsTallerMecanico getTaller() {
        return taller;
    }

    /**
     * @param taller the taller to set
     */
    public void setTaller(clsTallerMecanico taller) {
        this.taller = taller;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
