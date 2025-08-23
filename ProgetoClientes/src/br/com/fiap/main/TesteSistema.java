package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

import javax.swing.*;

public class TesteSistema {

    // String
    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    // Int
    static Integer inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // Double
    static Double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        Cliente objCliente = new Cliente(
                texto("Informe o nome"),
                texto("Inoforme o CPF"),
                texto("Informe o número de celular"),
                inteiro("Informe a idade"),
                real("Informe a renda")
        );

        System.out.println(
                objCliente
        );
    }
}
