package Controller;

import Model.Conexao;
import com.sun.net.httpserver.HttpExchange;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.sql.*;

public class ListarClientes {
    public void handle(HttpExchange exchange) {

        String sql = "Select * from tbl_cliente";

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
                    String id = result.getString("idCliente");
                    System.out.print(id);
                    System.out.print(" ");
                    String nome = result.getString("nome");
                    System.out.println(nome);

                }
                System.out.println("Finalizou os nomes");
                result.close();
            } catch (SQLException e) {
                System.out.println("Falho no Result");
            }

            // Define a resposta * Testes
//            System.out.println("Funciona  😂😂🚀");
//            JOptionPane.showMessageDialog(null, "Funciona");

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
