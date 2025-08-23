package br.com.fiap.main;

import br.com.fiap.beans.Produto;

public class TesteProduto {

    public static void main(String[] args) {

        // Instanciando Objetos
        Produto objProduto = new Produto();

        // entradas
        objProduto.setCodigo(202);
        objProduto.setMarca("Honda");
        objProduto.setTipo("Carro");
        objProduto.setValor(25700);

        // saidas
        System.out.println("Código: " + objProduto.getCodigo() +
                           "\nMarca: " + objProduto.getMarca() +
                           "\nTipo: " + objProduto.getTipo() +
                           "\nValor: R$" + objProduto.getValor());
    }
}
