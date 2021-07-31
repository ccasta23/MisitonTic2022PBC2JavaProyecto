/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public class DatosBD {
    
    private final String url;
    private final String user;
    private final String pass;

    public DatosBD() {
        this.url = "jdbc:mysql://localhost:3306/vehiculosdbg75";
        this.user = "root"; //Ojo con el uso de root. UNICAMENTE EN DESARROLLOz
        this.pass = "";
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }
    
    
    
}
