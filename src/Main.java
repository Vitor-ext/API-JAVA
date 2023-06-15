/* Autor: ❣️🚀❣️ Vitor de Jesus ❣️🚀❣️
   Data: 14/06/2023
 */

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import javax.swing.*;
import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Bora Fazer um CRUD!");

        // Cria o servidor HTTP na porta 3000
        HttpServer server = HttpServer.create(new InetSocketAddress(3000), 0);

        // Define o manipulador para lidar com as requisições
        server.createContext("/", new MyHandler());

        // Inicia o servidor
        server.start();

        System.out.println("Servidor rodando em http://localhost:3000/");

    }

    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Define a resposta
            System.out.println("Funciona  😂😂🚀");
            JOptionPane.showMessageDialog(null, "Funciona");
        }
    }

}