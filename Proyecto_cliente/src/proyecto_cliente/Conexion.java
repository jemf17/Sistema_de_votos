/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_cliente;


import java.sql.*;

public class Conexion {

    private static Connection cnx = null;

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

    public boolean logUser(Connection conection, String user) throws SQLException {
        PreparedStatement consulta;
        try {
            consulta = conection.prepareStatement("select user from Login where user='" + user + "'");
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next() && resultado.getString("user").equals(user)) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }

    public boolean registro(Connection conexion, String usuario, String contraseña) throws SQLException {
        PreparedStatement consulta;
        try {
            consulta = conexion.prepareStatement("select user from Login where user='" + usuario + "'");
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next() && resultado.getString("user").equals(usuario)) {
                return false;
            } else {
                consulta = conexion.prepareStatement("insert into Login (user,pass) values (" + "'" + usuario + "'" + "," + "'" + contraseña + "'" + ")");
                consulta.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }

    public boolean logPass(Connection conection, String pass) throws SQLException {
        PreparedStatement consulta;
        try {
            consulta = conection.prepareStatement("select pass from Login where pass='" + pass + "'");
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next() && resultado.getString("pass").equals(pass)) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
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

}
