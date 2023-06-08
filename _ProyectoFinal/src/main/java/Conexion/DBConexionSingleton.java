package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConexionSingleton {
    private String baseDatos;
    public static DBConexionSingleton _instance;
    private Connection connection;

    private  DBConexionSingleton(String database) {
        this.baseDatos = database;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:"+this.baseDatos);
        } catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static DBConexionSingleton getInstance(String baseDatos) {
        if(_instance == null){
            _instance = new DBConexionSingleton(baseDatos);
        }else{
            System.out.println("Ya fué creada.");
        }
        return _instance;
    }

    public Connection getConnection() {
        return connection;
    }

}