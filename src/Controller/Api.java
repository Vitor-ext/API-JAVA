/* Autor: ❣️🚀❣️ Vitor de Jesus ❣️🚀❣️
   Data: 15/06/2023
 */
package Controller;

import Model.Conexao;
public class Api {

    // Criar as variaveis para consumir do Front

    public void Api (){
        // Instancia Objeto
        Conexao objConexao = new Conexao();

        // Chamando metodo
        objConexao.getConnection();
    }

}

