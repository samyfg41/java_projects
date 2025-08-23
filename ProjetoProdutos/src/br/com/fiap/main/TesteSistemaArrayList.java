package br.com.fiap.main;

import br.com.fiap.beans.Produto;

import javax.swing.*;
import java.util.ArrayList;

public class TesteSistemaArrayList {

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

        // Prepara a lista
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        //Preparar objeto
        Produto objProduto = null;

        do{
            objProduto = new Produto();
            objProduto.setCodigo(inteiro("Código: "));
            objProduto.setTipo(texto("Tipo: "));
            objProduto.setMarca(texto("Marca: "));
            objProduto.setDescricao(texto("Descrição: "));
            objProduto.setValor(real("Valor: "));

            listaProdutos.add(objProduto);

        }while( JOptionPane.showConfirmDialog(null, "Adicionar mais produtos?",
                "CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                == 0);

        // Saídas utilizando o foreach

        for(Produto a : listaProdutos){
            System.out.println(
                    "\n\nCódigo: " + a.getCodigo() +
                    "\nTipo: " + a.getTipo() +
                    "\nMarca: " + a.getMarca() +
                    "\nDescrição: " + a.getDescricao() +
                    "\nValor: " + a.getValor()
            );
        }
    }
}
