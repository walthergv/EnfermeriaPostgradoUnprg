package com.postgrado.postgradosistema.configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection connection;

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://localhost:3306/bd_postgrado?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            connection = DriverManager.getConnection(myBD, "root", "");
            //System.out.println("conectado");
            return connection;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
