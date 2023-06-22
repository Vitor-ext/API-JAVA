package Controller;

import Model.Conexao;
import com.sun.net.httpserver.HttpExchange;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadastroClientes {
   /** public void handle(HttpExchange exchange) {

        String nome = "vitor";
        Integer idCliente = 1;

        // Define a resposta
        String sql = "Select * from tbl_cliente";
        //String sql = "INSERT INTO tbl_cliente (idCliente, nome) VALUES (?, ?)";
        Conexao bd = new Conexao();
        Connection statement = bd.getConnection();

        try {
            // Registrar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Usado para inserir dados
            PreparedStatement preparedStatement = statement.prepareStatement(sql);

            try {
                ResultSet result = preparedStatement.executeQuery();

                while (result.next()) {
                    System.out.println(result.getObject("nome"));
                }

                result.close();
            } catch (SQLException e) {
                System.out.println("Falho no Result");
            }

            // Define a resposta
            System.out.println("Funciona  😂😂🚀");
            JOptionPane.showMessageDialog(null, "Funciona");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }**/
}
