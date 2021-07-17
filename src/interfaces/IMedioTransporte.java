/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public interface IMedioTransporte {
    
    //Constante
    final int NIVEL_MAXIMO_COMBUSTIBLE = 100;
    
    /* Firma del método
    Modificador: public
    Tipo de retorno: void
    Nombre de la función: moverse
    Parámetros: ( )
    */
    public void moverse();
    
    public void cargarCombustible(int cantidad);
    
    public String obtenerTipoMedioTransporte();
    
}
