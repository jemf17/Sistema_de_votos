/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_adm;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conector {
    private PreparedStatement psInsertar;
    private Statement statem;
    private Connection con;
    
    public void insertar(Publicaciones p) throws SQLException{
        String url = "";
        con = DriverManager.getConnection(url);
        statem = con.createStatement();
        
        psInsertar = con.prepareStatement("");
        
        psInsertar.setFloat(1, p.getPorcentaje());
        psInsertar.setString(2, p.getPublicacion());
        
        psInsertar.executeUpdate();
    }
    public int actualizar(Publicaciones p) throws SQLException{
        String sql = ""; 
        int re = 0;
        try{
            psInsertar.setFloat(1, p.getPorcentaje());
            psInsertar.setString(2, p.getPublicacion());
            if (re >0){
                JOptionPane.showInternalMessageDialog(null, "Reguistro modificado");}
            }catch (SQLException e){
            System.out.print("error");}
        finally{
        psInsertar = null;
        con.close();}
        return re;
        
    }
   public void insertar_2(Guardar g) throws SQLException{
        String url = "";
        con = DriverManager.getConnection(url);
        statem = con.createStatement();
        
        psInsertar = con.prepareStatement("");
        
        psInsertar.setString(1, g.getGuardar());
        
        psInsertar.executeUpdate();
    }
   public int actualizar_2(Guardar g) throws SQLException{
        String sql = ""; 
        int re = 0;
        try{
            psInsertar.setString(2, g.getGuardar());
            if (re >0){
                JOptionPane.showInternalMessageDialog(null, "Reguistro modificado");}
            }catch (SQLException e){
            System.out.print("error");}
        finally{
        psInsertar = null;
        con.close();}
        return re;
        
    }
}
