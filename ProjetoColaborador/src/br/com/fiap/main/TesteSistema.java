package br.com.fiap.main;

import br.com.fiap.beans.Colaborador;

import javax.swing.*;

public class TesteSistema {

    public static void main(String[] args) {

        //instanciar objetos
        Colaborador objColaborador = new Colaborador();

        //entrada
        objColaborador.setNome(JOptionPane.showInputDialog("Digite o nome do colaborador"));
        objColaborador.setEmail(JOptionPane.showInputDialog("Digite o email do colaborador"));
        objColaborador.setCargo(JOptionPane.showInputDialog("Digite o cargo do colaborador"));
        objColaborador.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do colaborador")));
        objColaborador.setQuantidadeHoras(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de hora")));
        objColaborador.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora")));

        //saida
        System.out.println(
                objColaborador
        );

        System.out.println(
                "\n\nSALÁRIO DO COLABORADOR: " + objColaborador.calcularSalario()
        );

        System.out.println(
                "\nINFORMAÇÃO: " + objColaborador.informacaoSalario()
        );
    }
}
