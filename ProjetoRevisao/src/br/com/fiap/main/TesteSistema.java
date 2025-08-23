package br.com.fiap.main;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

import javax.swing.*;

public class TesteSistema {

    public static void main(String[] args) {

        // instanciar objetos
        Empresa objEmpresa = new Empresa();
        Endereco objEndereco = new Endereco();
        Colaborador objColaborador = new Colaborador();

        //entrada Empresa
        objEmpresa.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ da Empresa"));
        objEmpresa.setRazaoSocial(JOptionPane.showInputDialog("Informe a Razão Social da Empresa"));
        objEmpresa.setNomeFantasia(JOptionPane.showInputDialog("Informe o Nome Fantasia da Empresa"));
        objEmpresa.setSegmento(JOptionPane.showInputDialog("Qual é o Segmento da Empresa?"));

        //entrada
        objColaborador.setNome(JOptionPane.showInputDialog("Digite o nome do Cliente"));
        objColaborador.setEmail(JOptionPane.showInputDialog("Digite o Email do Cliente"));
        objColaborador.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Cliente: ")));
    }
}
