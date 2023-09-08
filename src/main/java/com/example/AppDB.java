package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class AppDB {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");//api/biblioteca p acessar o db
            var conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", ""); // caminho, nome db, senha db
            System.out.println("Conexão realizada com sucesso");
            var statement = conn.createStatement(); //cria um obj para manipular/consultar dados
            var result = statement.executeQuery("select * from estado"); //manipulação e consulta de dados se colocar where é para filtro
            //looping para mostrar os valores que selecionamos
            // \n = pula lnha; printf = para essa concat; %d = ndecimal; %s = string 
            while (result.next()) /*para verificar se existe a próxima linha*/ {
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf") ); //getters para popular nosso prinf
            }
        } catch (SQLException e) {
         System.err.println("Não foi possível carregar o db" + e.getMessage());// err substitui o out pra erro
                                                                               // var e = msg de erro   
        } 
        catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a biblioteca para acessar o banco" + e.getMessage());;
        };

    }
}
//fechar a conexao e tratar os erros de forma adequada: fim da aula 02 db
