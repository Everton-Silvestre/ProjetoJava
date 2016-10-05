/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;
import java.sql.*;

/**
 *
 * @author Valdir
 */
public class CriarConexao {

    public static Connection getConexao() throws SQLException {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        //System.out.print("Conexão Realizada com Sucesso");
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1/test");
        
        }catch(ClassNotFoundException erro){
            throw new SQLException(erro.getMessage());
        }
    }
    
    }
    
    
    

