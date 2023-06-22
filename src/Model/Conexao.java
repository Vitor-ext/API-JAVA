/* Autor: ❣️🚀❣️ Vitor de Jesus ❣️🚀❣️
   Data: 14/06/2023
 */

package Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {
    private String servidor, banco, usuario, senha, porta;
    private Connection conexao;

    public Conexao(){
        this.servidor  = "127.0.0.1";
        this.porta = "3306";
        this.banco = "db_api";
        this.usuario = "root";
        this.senha = "";
    }

    public boolean Connect(){

        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://"+this.servidor+":"+this.porta+"/"+this.banco,this.usuario,this.senha);
            return true;
        }
        catch (SQLException ex ){
            System.out.println("OCORREU UM ERRO AO ACESSAR O BANDO DE DADOS");
            System.out.println(ex);
            return false;
        } finally{
            if (conexao != null){
                //conexao.close();
            }
        }
    }

    public Connection getConnection(){
        Connect();
        return conexao;
    }

    // Caso Tenha Bloqueio de SSL - Database
    /**public static void desabilitarSSL() {
        Properties properties = new Properties();
        properties.setProperty("useSSL", "false");
        properties.setProperty("verifyServerCertificate", "false");
        properties.setProperty("requireSSL", "false");
        properties.setProperty("enabledTLSProtocols", "TLSv1,TLSv1.1,TLSv1.2");

        System.setProperties(properties);
        return;
    }**/
}
