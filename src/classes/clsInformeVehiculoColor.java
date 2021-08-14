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
public class clsInformeVehiculoColor {
    //Atributos
    private String color;
    private int cantidad;
    
    //Constructor
    public clsInformeVehiculoColor(String color, int cantidad) {
        this.color = color;
        this.cantidad = cantidad;
    }
    
    //Métodos
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
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
