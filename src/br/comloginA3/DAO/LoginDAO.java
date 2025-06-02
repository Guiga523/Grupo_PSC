package br.comloginA3.DAO;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class LoginDAO {
    
    public void cadastrarUusuario(String nome, String email, String senha){
        try{
            Connection conexao = Conexao.spConn;
            String sql = "INSERT INTO login (nome, email, senha) VALUES ('"+nome+"','"+email+"','"+senha+"')";
            System.out.println(sql);
            PreparedStatement statment = conexao.prepareStatement(sql);
            statment.execute();
            conexao.close();
        }catch(SQLException exception){
            System.err.println(exception.getMessage());
        }
    }
    public void login(String email, String senha){
        Connection conexao = Conexao.spConn;
        String sql = "SELECT email,senha FROM LOGIN where email = '"+email+"' AND senha = '"+senha+"'";
        System.out.println(sql);
        try{
            PreparedStatement statment = conexao.prepareStatement(sql);
            ResultSet rs = statment.executeQuery();
            
            if(rs.next()){
                System.out.println("Possui");
            }else{
                System.out.println("Não possui");
            }
            conexao.close();
        }catch(SQLException exception){
            System.err.println(exception.getMessage());
        }
    }
    
    public Object getjTextFieldLogin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
