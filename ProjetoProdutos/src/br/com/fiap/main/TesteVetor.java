package br.com.fiap.main;

import br.com.fiap.beans.Produto;

import javax.swing.*;

public class TesteVetor {

    // String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    // int
    static Integer inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double
    static Double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        Produto[] vetorProduto = new Produto[3];

        // Preparar indice
        int indice = 0;

        // Laço de Repetição do/while

        do{
            // Entradas
            vetorProduto[indice] = new Produto();
            vetorProduto[indice].setCodigo(inteiro("Código: "));
            vetorProduto[indice].setTipo(texto("Tipo: "));
            vetorProduto[indice].setMarca(texto("Marca: "));
            vetorProduto[indice].setDescricao(texto("Descrição: "));
            vetorProduto[indice].setValor(real("Valor: "));

            indice++;

        }while( JOptionPane.showConfirmDialog(null, "Adicionar mais produtos?",
                "CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                == 0 );

        // Saídas utilizando for

        for(int buscar = 0; buscar < indice; buscar++){
            System.out.println(
                    "\n\nCódigo: " + vetorProduto[buscar].getCodigo() +
                    "\nTipo: " + vetorProduto[buscar].getTipo() +
                    "\nMarca: " + vetorProduto[buscar].getMarca() +
                    "\nDescrição: " + vetorProduto[buscar].getDescricao() +
                    "\nValor: " + vetorProduto[buscar].getValor()
            );
        }
    }
}
