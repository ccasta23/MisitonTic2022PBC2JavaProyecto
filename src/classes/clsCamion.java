/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.ITransporteTerrestre;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public class clsCamion extends clsVehiculo implements ITransporteTerrestre{
    
    private String remolque;

    public clsCamion(String remolque, String codigo, String marca, int numeroLlantas, String color, int caballosDeFuerza) {
        super(codigo, marca, numeroLlantas, color, caballosDeFuerza);
        this.remolque = remolque;
    }
    
    public void unirRemolque(){
        System.out.println("Uniendo remolque...");
    }
    
    public void soltarRemolque(){
        System.out.println("Soltando remolque...");
    }
    
    @Override
    public String obtenerTipoMedioTransporte() {
        return "Camion";
    }

    /**
     * @return the remolque
     */
    public String getRemolque() {
        return remolque;
    }

    /**
     * @param remolque the remolque to set
     */
    public void setRemolque(String remolque) {
        this.remolque = remolque;
    }
    
}
