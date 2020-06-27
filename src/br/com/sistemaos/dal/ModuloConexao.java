/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaos.dal;

import java.sql.*;

/**
 *
 * @author Igor
 */
public class ModuloConexao {
    
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/sistemaos";
        String user = "postgres";
        String password = "12345igoR";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
            
        }
    }
}
