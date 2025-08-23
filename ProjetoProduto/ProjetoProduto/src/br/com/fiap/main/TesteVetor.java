package br.com.fiap.main;

import br.com.fiap.beans.Produto;

import javax.swing.*;

public class TesteVetor {

    //String
    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    //int
    static Integer inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    //double
    static Double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        //Preparar a quantidade máxima de vetores
        Produto[] vetorProduto = new Produto[3]; //[0] [1] [2]

        //Preparar índice
        int indice = 0;

        //Laço de repetição      do/while (faça/enquanto)

        do{
            //int codigo, String tipo, String marca, String descricao, double valor
            // Entradas
            vetorProduto[indice] = new Produto();
            vetorProduto[indice].setCodigo(inteiro("Código"));
            vetorProduto[indice].setTipo(texto("Tipo"));
            vetorProduto[indice].setMarca(texto("Marca"));
            vetorProduto[indice].setDescricao(texto("Descrição"));
            vetorProduto[indice].setValor(real("Valor"));

            indice++;

        }while(JOptionPane.showConfirmDialog(null,
                "Cadastrar mais produtos?", "CARRINHO DE COMPRAS",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
                ) ==0 );

        // Saídas utilizando for
        for(int buscar =0; buscar < indice; buscar++){
            System.out.println(
                    "\n\nCódigo: " + vetorProduto[buscar].getCodigo() +
                    "\nTipo: " + vetorProduto[buscar].getTipo() +
                    "\nMarca: " + vetorProduto[buscar].getDescricao() +
                    "\nDescrição: " + vetorProduto[buscar].getDescricao() +
                    "\nValor: " + vetorProduto[buscar].getValor()
            );
        }
    }
}
