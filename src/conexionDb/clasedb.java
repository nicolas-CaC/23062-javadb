package conexionDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class clasedb {

    public static void main(String[] args) throws SQLException {

        Conexion conexion = new Conexion();
        Connection connect = conexion.getConnection();
        
        PreparedStatement ps = connect.prepareStatement("SELECT * from clientes");
        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            byte edad = rs.getByte("edad");
            
            System.out.println("Id: " + id + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad);
        }
        
    }

}
