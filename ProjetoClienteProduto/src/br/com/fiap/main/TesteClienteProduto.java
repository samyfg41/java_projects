package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Produto;

public class TesteClienteProduto {

    public static void main(String[] args) {

        // Instanciar objetos
        Cliente objCliente = new Cliente();
        Produto objProduto = new Produto();

        // entrada
        objCliente.setIdade(45);
        objCliente.setNome("Braufagelio");
        objCliente.setEmail("brf@gmail.com");
        objCliente.setRenda(7.855);

        objProduto.setCodigo(235);
        objProduto.setTipo("Chinelo");
        objProduto.setMarca("Kenner");
        objProduto.setValor(25.65);

        // saida
        System.out.println(
                "Informações Cliente: " +
                "\nIdade: " + objCliente.getIdade() +
                "\nNome: " + objCliente.getNome() +
                "\nEmail: " + objCliente.getEmail() +
                "\nRenda: R$" + objCliente.getRenda() +
                "\n\nInformações Produto: " +
                "\nCódigo: " + objProduto.getCodigo() +
                "\nTipo: " + objProduto.getTipo() +
                "\nMarca: " + objProduto.getMarca() +
                "\nValor: R$" + objProduto.getValor()
        );
    }
}
