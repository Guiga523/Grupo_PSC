package br.comloginA3.controller;

import br.comloginA3.DAO.Conexao;
import br.comloginA3.DAO.LoginDAO;
import br.comloginA3.view.LoginA3_View;
import br.comloginA3.view.LoginA3_ViewCadastro;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class LoginController {
    
    public void cadastroUusuario(LoginA3_ViewCadastro view){

        Connection conexao = Conexao.spConn;
        LoginDAO cadastro = new LoginDAO();
        cadastro.cadastrarUusuario(view.getjFormattedTextFieldNome().getText(),view.getjFormattedTextFieldEmail().getText(),
                new String(view.getjPasswordFieldSenha().getPassword()));
    }
    public void LoginUsuario(LoginA3_View view){

        Connection conexao = Conexao.spConn;
        LoginDAO login = new LoginDAO();
        login.login(view.getjFormattedTextFieldLogin().getText(), 
                    new String(view.getjPasswordFieldSenhaLogin().getPassword()));
    }
    
}
