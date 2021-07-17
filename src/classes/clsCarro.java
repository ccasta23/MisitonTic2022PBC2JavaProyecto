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
public class clsCarro extends clsVehiculo{
    
    //Atributos
    private boolean automatico;
    
    //Constructor
    public clsCarro(boolean automatico, String codigo, String marca, int numeroLlantas, String color, int caballosDeFuerza) {
        super(codigo,marca, numeroLlantas, color, caballosDeFuerza);
        this.automatico = automatico;
    }
    
    //Métodos
    @Override //Anotación de sobrescritura
    //Sobrescribir el método de la clase padre
    public void pitar(){
        //Modificar o agregar funcionalidad al método de la clase padre
        super.pitar(); //Ejecutar el método de la clase padre
        System.out.println( this.getMarca() + " BIP BIP"); //Implementar mi propia funcionalidad
    }
    
    //Sobrecargar
    public void pitar(int cantidadVeces){
        for (int i = 0; i < cantidadVeces; i++) {
            System.out.print("BIP ");
        }
        System.out.println("");
    }
    
    public void pitar( String pitido ){
        System.out.println(this.getMarca() + " " + pitido);
    }
    
    public void pitar( int cantidadVeces, String pitido ){
        for (int i = 0; i < cantidadVeces; i++) {
            System.out.print(pitido);
        }
        System.out.println("");
    }
    
    public void pitar(String pitido,  int cantidadVeces ){
        for (int i = 0; i < cantidadVeces; i++) {
            System.out.print(pitido + "-");
        }
        System.out.println("");
    }
    
    
    @Override
    public String obtenerTipoMedioTransporte() {
        return "Carro";
    }
    
    @Override
    public String toString(){
        return this.getCodigo() + " - " + this.getMarca() + " - " + this.getColor();
    }

    /**
     * @return the automatico
     */
    public boolean isAutomatico() {
        return automatico;
    }

    /**
     * @param automatico the automatico to set
     */
    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }
    
}
