/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_adm;


import java.sql.*;

public class Conexion {

    private static Connection cnx = null;

    //conecta a la base de datos
    public static Connection obtener() throws SQLException, ClassNotFoundException {
        if (cnx == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost/proyecto", "root", "mesixd");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
               throw new ClassCastException(ex.getMessage());
            }
        }
        return cnx;
    }

    public static void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }

    public void sendVoto(Connection conexion,int contador, String voto) throws SQLException {
        PreparedStatement consulta;
        consulta = conexion.prepareStatement("update propuestas set "+voto+"="+voto+"+1 where id='"+contador+"'");
        consulta.execute();
    }

    public String getPropuesta(Connection conexion,int contador) throws SQLException, ClassNotFoundException {
        PreparedStatement consulta;
        consulta = conexion.prepareStatement("select propuesta from propuestas where id="+contador);
        ResultSet resultado = consulta.executeQuery();
        String texto = null;
        try {
            while (resultado.next()) {
                if (texto == null) {
                    texto = resultado.getString("propuesta");
                } else {
                    texto += resultado.getString("propuesta");
                }
            }
            return texto;
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    
    public void sendPropuesta(Connection conexion, String propuesta) throws SQLException {
        PreparedStatement consulta;
        consulta = conexion.prepareStatement("insert into proyecto.propuestas (propuesta) values ('"+propuesta+"');");
        consulta.execute();
        consulta = conexion.prepareStatement("insert into proyecto.historial (valor) values ('1');");
        consulta.execute();
    }
    
    public float getPorcentajePositivos(Connection conexion, int contador) throws SQLException {
        PreparedStatement consulta;
        consulta = conexion.prepareStatement("select * from propuestas where id="+contador);
        ResultSet res = consulta.executeQuery();
        float total = 0;
        int si = 0;
        int no = 0;
        try {
            while (res.next()) {
                si += res.getInt("si");
                no += res.getInt("no");
                total += si+no;
            }
            return (si*100)/total;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    
    public float getPorcentajeNegativos(Connection conexion, int contador) throws SQLException {
        PreparedStatement consulta;
        consulta = conexion.prepareStatement("select * from propuestas where id="+contador);
        ResultSet res = consulta.executeQuery();
        float total = 0;
        int si = 0;
        int no = 0;
        try {
            while (res.next()) {
                si += res.getInt("si");
                no += res.getInt("no");
                total += si+no;
            }
            return (no*100)/total;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    
    public void eliminarPropuesta(Connection conexion,int id) throws SQLException{
        PreparedStatement consulta;
        consulta=conexion.prepareStatement( "DELETE FROM propuestas WHERE id='"+id+"'");
        consulta.execute();
    }
    
    public int conseguirId(Connection conexion) throws SQLException{
        int id=0;
        PreparedStatement consulta;
        consulta=conexion.prepareStatement("select id from historial order by id desc limit 1");
        ResultSet res=consulta.executeQuery();
        while (res.next()){
            id=res.getInt("id");
        }
        return id;
    }
    
    }

