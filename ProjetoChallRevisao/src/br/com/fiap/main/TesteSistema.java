package br.com.fiap.main;

import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

import javax.swing.*;

public class TesteSistema {

    //String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    //int
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    //double
    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        Produto objProduto = new Produto(
                inteiro("Informe o código do produto"),
                texto("Digite o tipo do produto"),
                texto("Digite a marca do produto"),
                inteiro("Digite a quantidade do produto"),
                real("Digite o valor do produto")
        );

        Endereco objEndereco = new Endereco(
                texto("Informe o logradouro"),
                inteiro("Informe o número"),
                texto("Informe o complemento"),
                texto("Informe o CEP"),
                texto("Informe o bairro"),
                texto("Informe a cidade")
        );

        Empresa objEmpresa = new Empresa(
                texto("Informe o CNPJ"),
                texto("Informe a Razão Social"),
                texto("Informe o Nome Fantasia"),
                texto("Informe o segmento")
        );

        objEmpresa.setEndereco(objEndereco);

        //saida
        System.out.println(
                objProduto + "" + objEmpresa
        );
    }
}
