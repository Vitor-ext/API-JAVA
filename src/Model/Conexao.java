/* Autor: ❣️🚀❣️ Vitor de Jesus ❣️🚀❣️
   Data: 14/06/2023
 */

package Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

}
