package br.comloginA3.DAO;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao{
    public Conexao(){
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:base.db");
            Statement state = conn.createStatement();
            state.setQueryTimeout(30);

            state.executeUpdate("CREATE TABLE IF NOT EXISTS Login (nome STRING, email STRING, senha STRING)");
            state.close();
            spConn = conn;
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }   
    }

    private Connection conn;
    public static Connection spConn; 
}
