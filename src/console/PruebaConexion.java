/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public class PruebaConexion {
    
    public static void main(String[] args) {
        
        //Probar que Java tenga conexión a la BD
        String user = "pruebasg75"; //Usar root únicamente en el entorno LOCAL. NUNCA en producción
        String pass = "pruebasg75";
        String url = "jdbc:mysql://localhost:3306/vehiculosdbg75";
        
        try {
            //Intentar conectarse a la BD
            Connection conexion = DriverManager.getConnection(url, user, pass);
            if( conexion != null ){ //Si se pudo conectar a la BD
                System.out.println("¡Se conectó! :D");
                String query = "SELECT id, nombre FROM tb_talleres_mecanicos WHERE id = ? ";
                PreparedStatement preparedStatement = conexion.prepareStatement(query);
                //Establecer valor al parámetro de la consulta
                preparedStatement.setInt(1, 4);
                //Variable para obtener los resultados de la consulta
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    System.out.println("Id: " + rs.getInt(1) + "" //Obtener el valor de un registro en la columna 1
                            + " Nombre: " + rs.getString("nombre"));
                }
            }
        } catch (Exception e) {
            //Si algo sale mal, mostrar el siguiente mensaje
            System.out.println("ERROR: " + e.getMessage());
        }
        
    }
    
}
