package br.com.fiap.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

    // Metodo de conexão com o banco de dados
    public Connection conexao() throws ClassNotFoundException, SQLException {
            // Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Retornar com informações de conexão do banco de dados
            return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
                    "RM554794", "fiap25");
    }
}
