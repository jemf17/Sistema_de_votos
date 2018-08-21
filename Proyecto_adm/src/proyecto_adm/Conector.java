/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_adm;

import java.sql.*;

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
}
