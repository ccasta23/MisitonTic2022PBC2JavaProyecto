/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import classes.clsCarro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author CARLOS CASTAÑEDA
 */
public class modeloCarro {
    
    DatosBD datosBD;

    public modeloCarro() {
        datosBD = new DatosBD(); //Instanciar la clase que contiene los datos de conexión
    }
    
    //Modelo - Crear las 4 operaciones básicas
    
    public boolean crearCarro( clsCarro carro ){
        try (Connection conexion = DriverManager.getConnection(datosBD.getUrl(), datosBD.getUser(), datosBD.getPass())) {
            //Intentar almacenar en base de datos
            String query = "INSERT INTO `tb_vehiculos`(`codigo`, `marca`, `numero_llantas`, `color`, `caballos_fuerza`) VALUES ( ?, ?, ?, ?, ? )";
            PreparedStatement preparedStatement = conexion.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            //Modificar los valores de los parámetros de la consulta
            preparedStatement.setString(1, carro.getCodigo());
            preparedStatement.setString(2, carro.getMarca());
            preparedStatement.setInt(3, carro.getNumeroLlantas());
            preparedStatement.setString(4, carro.getColor());
            preparedStatement.setInt(5, carro.getCaballosDeFuerza());
            //Ejecutar la consulta en la BD
            int filasAfectadas = preparedStatement.executeUpdate();
            //¿Se almacenó 1 registro correctamente?
            if( filasAfectadas>0 ){
                System.out.println("Almacenó el Vehiculo :D");
                //Resultset con el ID del registro de la tabla vehiculos
                ResultSet idVehiculoRS = preparedStatement.getGeneratedKeys();
                if(idVehiculoRS.next()){
                    //Obtener el ID del registro de la tabla vehiculos desde el RS
                    int idVehiculo = idVehiculoRS.getInt(1);
                    //Construir la consulta para insertar un registro en la BD
                    query = "INSERT INTO `tb_carros`(`automatico`, `id_vehiculo`) VALUES (?, ?)";
                    //Preparar la consulta (Evitar SQL Injection)
                    preparedStatement = conexion.prepareStatement(query);
                    //Modificar el valor de los parámtros de la consulta
                    preparedStatement.setBoolean(1, carro.isAutomatico());
                    preparedStatement.setInt(2, idVehiculo);
                    //Ejecutar la consulta en el motor de base de datos
                    filasAfectadas = preparedStatement.executeUpdate();
                    if(filasAfectadas>0){
                        //Se insertó el registro en la tabla carros correctamente
                        return true;
                    }
                }
            }
            return false;
        } catch(Exception e){
            //La operación falló en BD
            System.out.println("Error almacenando: " + e.getMessage());
            return false;
        }
    }
    
    public boolean actualizarCarro( clsCarro carro ){
        //Mantener la conexión activa únicamente dentro del Try
        try (Connection conexion = DriverManager.getConnection(datosBD.getUrl(), datosBD.getUser(), datosBD.getPass())) {
            //Intentar actualizar un registro en base de datos
            
            //Intentar actualizar los registros en BD en base de datos
            //Primero actualizar en la tabla vehiculos
            String query = "UPDATE `tb_vehiculos` SET `codigo`=?,`marca`=?,`numero_llantas`=?,`color`=?,`caballos_fuerza`=? WHERE `id`=?";
            //Preparar la consulta
            PreparedStatement preparedStatement = conexion.prepareStatement(query);
            //Modificar el valor de los parámetros
            preparedStatement.setString(1, carro.getCodigo());
            preparedStatement.setString(2, carro.getMarca());
            preparedStatement.setInt(3, carro.getNumeroLlantas());
            preparedStatement.setString(4, carro.getColor());
            preparedStatement.setInt(5, carro.getCaballosDeFuerza());
            preparedStatement.setInt(6, carro.getIdVehiculo());
            //Ejecutar consulta
            preparedStatement.executeUpdate();
            //Actualizar en la tabla carros
            query = "UPDATE `tb_carros` SET `automatico`=? WHERE `id`=?";
            //Preparar la consulta
            preparedStatement = conexion.prepareStatement(query);
            //Modificar los valores de los parámetros de la consulta
            preparedStatement.setBoolean(1, carro.isAutomatico());
            preparedStatement.setInt(2, carro.getIdCarro());
            //Ejecutar consulta en BD
            preparedStatement.executeUpdate();
            return true;
        } catch(Exception e){
            System.out.println("Error actualizando: " + e.getMessage());
            //La operación falló en BD
            return false;
        }
    }
    
    public boolean eliminarCarro( clsCarro carro ){
        try (Connection conexion = DriverManager.getConnection(datosBD.getUrl(), datosBD.getUser(), datosBD.getPass())) {
            //Intentar eliminar los registros en BD en base de datos
            //Primero eliminar en la tabla carros (La tabla que tiene la llave foránea)
            String query = "DELETE FROM `tb_carros` WHERE id = ?";
            //Preparar la consulta
            PreparedStatement preparedStatement = conexion.prepareStatement(query);
            //Modificar el valor de los parámetros
            preparedStatement.setInt(1, carro.getIdCarro());
            //Ejecutar consulta
            preparedStatement.executeUpdate();
            //Eliminar en la tabla vehiculos
            query = "DELETE FROM `tb_vehiculos` WHERE id = ?";
            //Preparar la consulta
            preparedStatement = conexion.prepareStatement(query);
            //Modificar los valores de los parámetros de la consulta
            preparedStatement.setInt(1, carro.getIdVehiculo());
            //Ejecutar consulta en BD
            preparedStatement.executeUpdate();
            return true;
        } catch(Exception e){
            //La operación falló en BD
            return false;
        }
    }
    
    public clsCarro obtenerCarro( String codigo ){
        try ( Connection conexion = DriverManager.getConnection(datosBD.getUrl(), datosBD.getUser(), datosBD.getPass()) ) {
            //Consultar si el carro se encuentra en BD
            String query = "SELECT vh.id AS id_vehiculo, vh.codigo, vh.marca, vh.numero_llantas, vh.color, vh.caballos_fuerza, crr.id AS id_carro, crr.automatico " +
                    "FROM `tb_vehiculos` AS vh INNER JOIN tb_carros AS crr ON vh.id = crr.id_vehiculo " +
                    "WHERE vh.codigo = ?";
            //Preparar la consulta (Evitar SQL Injection)
            PreparedStatement preparedStatement = conexion.prepareStatement(query);
            //Modificar el valor de los parámetros de la consulta
            preparedStatement.setString(1, codigo);
            //Obtener las filas resultado de la consulta
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()){ //Si la consulta trae como resultado al menos 1 registro
                clsCarro carro_obtenido = new clsCarro(
                        rs.getInt("id_carro"),//Id Carro
                        rs.getBoolean("automatico"), 
                        rs.getInt("id_vehiculo"),//Id vehiculo
                        rs.getString("codigo"), 
                        rs.getString("marca"), 
                        rs.getInt("numero_llantas"), 
                        rs.getString("color"), 
                        rs.getInt("caballos_fuerza")
                    );
                return carro_obtenido;
            }
            return null;
        } catch(Exception e){
            System.out.println("Error consultando: " + e.getMessage());
            //La operación falló en BD
            return null;
        }
    }
    
    public LinkedList<clsCarro> listarCarros(){
        LinkedList<clsCarro> carros = new LinkedList<>();
        try ( Connection conexion = DriverManager.getConnection(datosBD.getUrl(), datosBD.getUser(), datosBD.getPass()) ) {
            //Consultar si el carro se encuentra en BD
            String query = "SELECT vh.id AS id_vehiculo, vh.codigo, vh.marca, vh.numero_llantas, vh.color, vh.caballos_fuerza, crr.id AS id_carro, crr.automatico " +
                    "FROM `tb_vehiculos` AS vh INNER JOIN tb_carros AS crr ON vh.id = crr.id_vehiculo ";
            //Preparar la consulta (Evitar SQL Injection)
            PreparedStatement preparedStatement = conexion.prepareStatement(query);
            //Obtener las filas resultado de la consulta
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){ //Si la consulta trae como resultado al menos 1 registro
                clsCarro carro = new clsCarro(
                        rs.getInt("id_carro"),//Id Carro
                        rs.getBoolean("automatico"), 
                        rs.getInt("id_vehiculo"),//Id vehiculo
                        rs.getString("codigo"), 
                        rs.getString("marca"), 
                        rs.getInt("numero_llantas"), 
                        rs.getString("color"), 
                        rs.getInt("caballos_fuerza")
                    );
                carros.add(carro);
            }
            return carros;
        } catch(Exception e){
            System.out.println("Error consultando: " + e.getMessage());
            //La operación falló en BD
            return carros;
        }
    }
    
}
