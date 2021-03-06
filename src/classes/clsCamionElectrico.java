/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public class clsCamionElectrico extends clsCamion {
    //Atributos
    private int idCamionElectrico;
    private int nivelCarga;
    
    //Constructor
    public clsCamionElectrico(int idCamionElectrico, int nivelCarga, int idCamion, String remolque, int idVehiculo, String codigo, String marca, int numeroLlantas, String color, int caballosDeFuerza) {
        super(idCamion, remolque, idVehiculo, codigo, marca, numeroLlantas, color, caballosDeFuerza);
        this.idCamionElectrico = idCamionElectrico;
        this.nivelCarga = nivelCarga;
    }
    
    
    //Métodos
    public void cargarBateria(){
        System.out.println("Cargando.....");
    }
    
    @Override
    public String obtenerTipoMedioTransporte() {
        return "Camion Electrico";
    }

    /**
     * @return the nivelCarga
     */
    public int getNivelCarga() {
        return nivelCarga;
    }

    /**
     * @param nivelCarga the nivelCarga to set
     */
    public void setNivelCarga(int nivelCarga) {
        this.nivelCarga = nivelCarga;
    }

    /**
     * @return the idCamionElectrico
     */
    public int getIdCamionElectrico() {
        return idCamionElectrico;
    }

    /**
     * @param idCamionElectrico the idCamionElectrico to set
     */
    public void setIdCamionElectrico(int idCamionElectrico) {
        this.idCamionElectrico = idCamionElectrico;
    }
    
}
