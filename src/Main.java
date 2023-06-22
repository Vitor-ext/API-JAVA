/* Autor: ❣️🚀❣️ Vitor de Jesus ❣️🚀❣️
   Data: 14/06/2023
 */

import Model.Conexao;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import javax.swing.*;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Bora Fazer um CRUD!");

        // Cria o servidor HTTP na porta 3000
        HttpServer server = HttpServer.create(new InetSocketAddress(3000), 0);

        // Define o manipulador para lidar com as requisições
        Object res;
        server.createContext("/", new CadastroBanco());

        // Define o manipulador para lidar com as requisições listar
        //server.createContext("/listar", new ListarClientes());

        // Inicia o servidor
        server.start();

        System.out.println("Servidor rodando em http://localhost:3000/");

    }

    static class CadastroBanco implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) {
            // Define a resposta
            String sql = "Select * from tbl_cliente";
            Conexao bd = new Conexao();
            Connection statement = bd.getConnection();
            try {
                // Usado para inserir dados
                PreparedStatement preparedStatement = statement.prepareStatement(sql);
                // preparedStatement = ( dados para inserir)
                System.out.println("o try funciona");

                try {
                    ResultSet result = preparedStatement.executeQuery();
                    System.out.println(result);
                    int teste = result.getInt("idCliente");
                    System.out.println(teste);

                    result.close();
                }
                catch (SQLException e) {
                    System.out.println("Falho no Result");
                }

                System.out.println("chegou aqui abaixo teste");

                // Define a resposta
                System.out.println("Funciona  😂😂🚀");
                JOptionPane.showMessageDialog(null, "Funciona");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

        /**static class ListarClientes implements HttpHandler {
        @Override public  handle(HttpExchange exchange) throws IOException {
        // Define a resposta
        String sql = "Select * from tbl_clientes";

        try {
        statement = bd.getConnection().prepareStatement(sql);
        // Define a resposta
        System.out.println("Funciona  😂😂🚀");
        JOptionPane.showMessageDialog(null, "Funciona");
        }
        catch (IOException ex){
        String erroList = "Deu Ruim";
        return erroList;
        System.out.println("🚀 So sorry 🚀");
        JOptionPane.showMessageDialog(null, "🚀 Falha no Erro 🚀");
        }

        }**/

    }

}