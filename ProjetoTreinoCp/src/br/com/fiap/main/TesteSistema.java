package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TesteSistema {

    public static void main(String[] args) {

        Cliente objCliente = new Cliente();
        Produto objProduto = new Produto();
        Endereco objEndereco = new Endereco();

        // entrada cliente
        objCliente.setIdade(41);
        objCliente.setNome("Braufagelio");
        objCliente.setEmail("brf@gmail.com");
        objCliente.setRenda(7.455);

        objCliente.setEndereco(objEndereco);

        // entrada produto
        objProduto.setCodigo(123);
        objProduto.setTipo("Dydyo");
        objProduto.setMarca("Refrigerante");
        objProduto.setValor(5.45);

        // entrada endereco
        objEndereco.setLogradouro("Rua Apito do Vapor");
        objEndereco.setNumero(295);
        objEndereco.setComplemento("Casa");
        objEndereco.setCep("08485-450");
        objEndereco.setBairro("Cid Tiradentes");
        objEndereco.setCidade("São Paulo");

        // saidas

        System.out.println(
                "\nINFORMAÇÕES DO CLIENTE" +
                "\nIdade: " + objCliente.getIdade() +
                "\nNome: " + objCliente.getNome() +
                "\nEmail: " + objCliente.getEmail() +
                "\nRenda: R$" + objCliente.getRenda() +
                "\n\nINFORMAÇÕES ENDEREÇO CLIENTE" +
                "\nLogradouro: " + objCliente.getEndereco().getLogradouro() +
                "\nNúmero: " + objCliente.getEndereco().getNumero() +
                "\nComplemento: " + objCliente.getEndereco().getComplemento() +
                "\nCep: " + objCliente.getEndereco().getCep() +
                "\nBairro: " + objCliente.getEndereco().getBairro() +
                "\nCidade: " + objCliente.getEndereco().getCidade()
        );

        System.out.println(
                "\nINFORMAÇÕES PRODUTO" +
                "\nCodigo: " + objProduto.getCodigo() +
                "\nTipo: " + objProduto.getTipo() +
                "\nMarca: " + objProduto.getMarca() +
                "\nValor: R$" + objProduto.getValor()
        );
    }
}
