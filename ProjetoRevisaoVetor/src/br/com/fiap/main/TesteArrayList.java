package br.com.fiap.main;

import br.com.fiap.beans.Produto;

import javax.swing.*;
import java.util.ArrayList;

public class TesteArrayList {

    //String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    //int
    static Integer inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    //double
    static Double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto objProduto = null;

        // do / while

        do{
            // entradas
            objProduto = new Produto();
            objProduto.setCodigo(inteiro("Código: "));
            objProduto.setTipo(texto("Tipo: "));
            objProduto.setMarca(texto("Marca: "));
            objProduto.setDescricao(texto("Descrição: "));
            objProduto.setValor(real("Valor: "));

            listaProdutos.add(objProduto);

        }while( JOptionPane.showConfirmDialog(null,
                "Adicionar mais produtos ao carrinho?", "CARRINHO DE COMPRAS",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
        == 0 );

        //Saídas usando o foreach

        for(Produto p : listaProdutos){
            System.out.println(
                    "\n\nCódigo: " + p.getCodigo() +
                    "\nTipo: " + p.getTipo() +
                    "\nMarca: " + p.getMarca() +
                    "\nDescrição: " + p.getDescricao() +
                    "\nValor: " + p.getValor()
            );
        }
    }
}
