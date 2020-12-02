/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author Thiago
 */
public class ModuloConexao {

    //método responsável por estabelecer a conexão com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo "chama" o driver
        String driver = "com.mysql.jdbc.Driver";
        // armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox"; // endereço do servidor do banco e nome do banco
        String user = "root";//usuário e senha do xampp
        String password = "";
        // estabelecendo a conexão com o banco
        try {
            Class.forName(driver);//executa o arquivo do driver mysql para java
            conexao = DriverManager.getConnection(url, user, password);//obtém a conexao usando os dados em parâmetros e armazena na variável conexao
            return conexao;
        } catch (Exception e) {//se houver qualquer erro com a conexao retornar null
            //a linha abaixo serve de apoio para esclarecer o erro de conexão, mas não podemos exibir essa msg para o usuário
            //System.out.println(e);
            return null;
        }

    }

}
