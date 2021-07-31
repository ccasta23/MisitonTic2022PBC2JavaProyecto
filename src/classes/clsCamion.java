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
    
    //Atributos
    private int idCamion;
    private String remolque;

    //Constructor
    public clsCamion(int idCamion, String remolque, int idVehiculo, String codigo, String marca, int numeroLlantas, String color, int caballosDeFuerza) {
        super(idVehiculo, codigo, marca, numeroLlantas, color, caballosDeFuerza);
        this.idCamion = idCamion;
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

    /**
     * @return the idCamion
     */
    public int getIdCamion() {
        return idCamion;
    }

    /**
     * @param idCamion the idCamion to set
     */
    public void setIdCamion(int idCamion) {
        this.idCamion = idCamion;
    }
    
}
