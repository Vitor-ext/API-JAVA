/* Autor: ❣️🚀❣️ Vitor de Jesus ❣️🚀❣️
   Data: 14/06/2023
 */

import Controller.CadastroClientes;
import Controller.ListarClientes;
import Model.Conexao;
import Viewer.Server;
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
        String nome = "";
        int idCliente = 0;

        System.out.println("Bora Fazer um CRUD!");

        // Cria o servidor HTTP na porta 3000
        HttpServer server = HttpServer.create(new InetSocketAddress(3000), 0);

        // Define o manipulador para lidar com as requisições
        CadastroClientes cadastro = new CadastroClientes();
       // server.createContext("/", exchange -> cadastro.handle(exchange));

        ListarClientes listar = new ListarClientes();
        // Define o manipulador para lidar com as requisições listar
        server.createContext("/listar", exchange -> listar.handle(exchange));

        // Inicia o servidor
        server.start();

        System.out.println("Servidor rodando em http://localhost:3000/");

    }

}