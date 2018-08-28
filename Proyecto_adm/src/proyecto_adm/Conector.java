/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_adm;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Conector {
    private static Connection Conexion;
 
    public void MySQLConnection(Publicaciones p, Votos v) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + p.getPublicacion()+","+ p.getPorcentaje()+""+v.negativo+""+v.positivo);
            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public void closeConnection() {
        try {
            Conexion.close();
            System.out.println("Se ha finalizado la conexión con el servidor");
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public void createDB(String name) {
        try {
            String Query = "CREATE DATABASE " + name;
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            MySQLConnection("root", "", name);
            JOptionPane.showMessageDialog(null, "Se ha creado la base de datos " + name + " de forma exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public void createTable(String name) {
        try {
            String Query = "CREATE TABLE " + name + ""
                    + "(publicacion VARCHAR(25),prosentaje VARCHAR(50), negativo VARCHAR(50), positivo VARCHAR(50)";
            JOptionPane.showMessageDialog(null, "Se ha creado la base de tabla " + name + " de forma exitosa");
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
        } catch (SQLException ex) {
            Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public void insertData(Publicaciones p, Votos v) {
        try {
            String Query = "INSERT INTO " + p.getTable_name() +" VALUES("
                    + "\"" + p.getPublicacion() + "\", "
                    + "\"" + p.getPorcentaje() + "\", "
                    + "\"" + v.negativo + "\", "
                    + "\"" + v.positivo + "\", ";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
        }
    }
 
    public void getValues(String table_name) {
        try {
            String Query = "SELECT * FROM " + table_name;
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
 
            while (resultSet.next()) {
                System.out.println("Publicaciones " + resultSet.getString("publicaciones") + " "
                        + "porsentaje " + resultSet.getString("porsentaje") + "negativo " + resultSet.getString("negativo") + " "
                        + "positivo" + resultSet.getString("positivo"));
            }
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
    }
 
    public void deleteRecord(Publicaciones p) {
        try {
            String Query = "DELETE FROM " +p.getTable_name() + " WHERE ID = \"" + p.getPublicacion() + "\"";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
        }
    }
//    private PreparedStatement psInsertar;
//    private Statement statem;
//    private Connection con;
//    
//    public void insertar(Publicaciones p) throws SQLException{
//        String url = "jdbct:mysql:localhost:3306:votos?user:root";
//        con = DriverManager.getConnection(url);
//        statem = con.createStatement();
//        
//        psInsertar = con.prepareStatement("");
//        
//        psInsertar.setFloat(1, p.getPorcentaje());
//        psInsertar.setString(2, p.getPublicacion());
//        
//        psInsertar.executeUpdate();
//    }
//    public int actualizar(Publicaciones p) throws SQLException{
//        String sql = "jdbct:mysql:localhost:3306:votos?user:root";
//        int re = 0;
//        try{
//            psInsertar.setFloat(1, p.getPorcentaje());
//            psInsertar.setString(2, p.getPublicacion());
//            if (re >0){
//                JOptionPane.showInternalMessageDialog(null, "Reguistro modificado");}
//            }catch (SQLException e){
//            System.out.print("error");}
//        finally{
//        psInsertar = null;
//        con.close();}
//        return re;
//        
//    }
//   public void insertar_2(Guardar g) throws SQLException{
//        String url = "jdbct:mysql:localhost:3306:votos?user:root";
//        con = DriverManager.getConnection(url);
//        statem = con.createStatement();
//        
//        psInsertar = con.prepareStatement("");
//        
//        psInsertar.setString(1, g.getGuardar());
//        
//        psInsertar.executeUpdate();
//    }
//   public int actualizar_2(Guardar g) throws SQLException{
//        String sql = "jdbct:mysql:localhost:3306:votos?user:root";
//        int re = 0;
//        try{
//            psInsertar.setString(2, g.getGuardar());
//            if (re > 0){
//                JOptionPane.showInternalMessageDialog(null, "Reguistro modificado");}
//            }catch (SQLException e){
//            System.out.print("error");}
//        finally{
//        psInsertar = null;
//        con.close();}
//        return re;
//        
//    }

    private void MySQLConnection(String root, String string, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
