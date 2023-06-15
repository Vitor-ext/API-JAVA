package Viewer;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Server {
    public Server () throws IOException {
        // Cria o servidor HTTP na porta 3000
        HttpServer server = HttpServer.create(new InetSocketAddress(3000), 0);

        // Define o manipulador para lidar com as requisições
        server.createContext("/", new MyHandler());

        // Inicia o servidor
        server.start();

        System.out.println("Servidor rodando em http://localhost:3000/");
    }

    public static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Define a resposta
            String response = "Olá, mundo!";

            // Define o código de status 200 (OK)
            exchange.sendResponseHeaders(200, response.length());

            // Obtém o fluxo de saída e escreve a resposta nele
            OutputStream outputStream = exchange.getResponseBody();
            outputStream.write(response.getBytes());
            outputStream.close();
        }
    }
}
